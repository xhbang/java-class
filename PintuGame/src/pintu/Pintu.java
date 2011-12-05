package pintu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Pintu extends JFrame implements KeyListener
{
	private static final long serialVersionUID = 1L;

	PicPanel picPanel;
	JLabel statusText = new JLabel("");

	public static void main(String[] args)
	{
		Image img = Toolkit.getDefaultToolkit().getImage("img/pintu.jpg");
		Pintu pintu1 = new Pintu(img);
		pintu1.setVisible(true);
	}

	public Pintu(Image img) throws HeadlessException
	{
		picPanel = new PicPanel(img, statusText);
		this.setLayout(new BorderLayout());
		add(picPanel, BorderLayout.CENTER);
		add(statusText, BorderLayout.SOUTH);
		setTitle("拼图游戏");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 400);
		addKeyListener(this);
	}

	@Override
	public void keyPressed(KeyEvent e)
	{
		// Invoked when a key has been pressed.
		// System.out.println("press key" +
		// KeyEvent.getKeyText(e.getKeyCode()));

		int nDirection = picPanel.DIRECTION_NONE;
		switch (e.getKeyCode())
		{
			case KeyEvent.VK_DOWN:
				nDirection = picPanel.DIRECTION_DOWN;
				break;
			case KeyEvent.VK_UP:
				nDirection = picPanel.DIRECTION_UP;
				break;
			case KeyEvent.VK_LEFT:
				nDirection = picPanel.DIRECTION_LEFT;
				break;
			case KeyEvent.VK_RIGHT:
				nDirection = picPanel.DIRECTION_RIGHT;
				break;
			case KeyEvent.VK_F1: // F1键按下，重新开始游戏
				picPanel.initData();
				repaint();
				return;
			case KeyEvent.VK_Y: // 显示原图
				if (picPanel.bOnShowAll)
					picPanel.bOnShowAll = false;
				else
					picPanel.bOnShowAll = true;
				repaint();
				return;
			default:
				return;
		}
		boolean bCanMove = picPanel.move(nDirection);
		if (bCanMove)
		{
			picPanel.nStep++;
			repaint();
		}
	}

	@Override
	public void keyReleased(KeyEvent e)
	{
	}

	@Override
	public void keyTyped(KeyEvent e)
	{
	}
}

class PicPanel extends JPanel implements MouseListener, Runnable
{
	private static final long serialVersionUID = 1L;
	BufferedImage[] m_Image = new BufferedImage[9]; // 9个用来装入拼图的图片对象
	Image m_ImgAll; // 总的大图片
	int m_nImageNo[][] = new int[3][3]; // 标志现在各个拼图的排列情况
	final int NO_IMAGE = -1; // 此位置没有拼图
	final int IMAGE_WIDTH = 120; // 每张拼图的宽
	final int IMAGE_HEIGHT = 120; // 每张拼图的高
	final int DIRECTION_UP = 1;
	final int DIRECTION_DOWN = 2;
	final int DIRECTION_LEFT = 3;
	final int DIRECTION_RIGHT = 4;
	final int DIRECTION_NONE = -1;
	final int DELTAX = 120; // 标志提示信息区的宽度
	Thread thTimer; // 计时器线程
	int nTime = 0; // 已经玩过的时间，以秒为单位
	boolean bWantStartNewGame = false; // 游戏是否结束，是否需要开始新游戏
	int nStep = 0; // 已经走的步数
	int nScore = 0; // 玩家所得的分数
	int m_nNumOfImg = 0; // 拼图底图所使用的图片的个数
	String m_sImgName = null; // 记录拼图底图的名字
	boolean bOnShowAll = false; // 预览的开关

	JLabel statusText;

	public PicPanel(Image img, JLabel statusText)
	{
		this.statusText = statusText;
		setBackground(Color.white);
		m_sImgName = "pintu.jpg";
		MediaTracker mediaTracker = new MediaTracker(this); // 建立一个监视器
		try
		{
			// 装载总的大图片
			m_ImgAll = Toolkit.getDefaultToolkit()
					.getImage("img/" + m_sImgName);
			mediaTracker.addImage(m_ImgAll, 1);
			mediaTracker.waitForID(1);
		}
		catch (Exception e)
		{
			System.out.println("图片装载出错:" + e.getMessage());
			System.exit(1);
		}
		if (mediaTracker.isErrorAny())
		{
			System.out.println("图片装载出错");
			System.exit(1);
		}
		for (int i = 0; i < 9; i++)
		{
			m_Image[i] = new BufferedImage(IMAGE_WIDTH, IMAGE_HEIGHT,
					BufferedImage.TYPE_INT_ARGB);
			Graphics g = m_Image[i].createGraphics();
			int nRow = i % 3;
			int nCol = i / 3;
			g.drawImage(m_ImgAll, 0, 0, IMAGE_WIDTH, IMAGE_HEIGHT, nRow
					* IMAGE_WIDTH, nCol * IMAGE_HEIGHT, (nRow + 1)
					* IMAGE_WIDTH, (nCol + 1) * IMAGE_HEIGHT, this);
		}
		thTimer = new Thread(this); // 为线程分配内存空间
		thTimer.start(); // 开始线程
		initData();

		addMouseListener(this);

		// System.out.println("init over");
	}

	public void checkStatus()
	{
		boolean bWin = true; // 定义成员，默认值为真
		int nCorrectNum = 0;

		// 比较拼图是否都放到了正确的位置上，如果，有一个没有放到正确位置上，则游戏就不能结束。
		for (int j = 0; j < 3; j++)
		{
			for (int i = 0; i < 3; i++)
			{
				if (m_nImageNo[i][j] != nCorrectNum
						&& m_nImageNo[i][j] != NO_IMAGE) bWin = false;
				nCorrectNum++;
			}
		}
		if (bWin) this.bWantStartNewGame = true;
	}

	public int directionCanMove(int nCol, int nRow)
	{
		if ((nCol - 1) >= 0)
			if (m_nImageNo[nRow][nCol - 1] == NO_IMAGE) return DIRECTION_UP;
		if ((nCol + 1) <= 2)
			if (m_nImageNo[nRow][nCol + 1] == NO_IMAGE) return DIRECTION_DOWN;
		if ((nRow - 1) >= 0)
			if (m_nImageNo[nRow - 1][nCol] == NO_IMAGE) return DIRECTION_LEFT;
		if ((nRow + 1) <= 2)
			if (m_nImageNo[nRow + 1][nCol] == NO_IMAGE) return DIRECTION_RIGHT;
		return DIRECTION_NONE;
	}

	public void initData()
	{
		int[] nHasDistrib = new int[9];
		for (int i = 0; i < 9; i++)
			nHasDistrib[i] = 0;
		for (int j = 0; j < 3; j++)
		{
			for (int i = 0; i < 3; i++)
			{
				int nImgNo = -1;
				do
				{
					nImgNo = (int) (Math.random() * 9);
				}
				while (nHasDistrib[nImgNo] == 1); // 1代表已经分配了这张图片
				m_nImageNo[i][j] = nImgNo;
				nHasDistrib[nImgNo] = 1;
			}
		}
		m_nImageNo[(int) (Math.random() * 3)][(int) (Math.random() * 3)] = NO_IMAGE;
		nStep = 0;
		nTime = 0; // 清空计时器
	}

	@Override
	public void mouseClicked(MouseEvent e)
	{
		// Invoked when the mouse has been clicked on a component.
		if (bOnShowAll) return;
		if (bWantStartNewGame)
		{
			initData();
			repaint();
			bWantStartNewGame = false;
			return;
		}

		int nX = e.getX() - DELTAX;
		int nY = e.getY();
		int nCol = nY / IMAGE_HEIGHT;
		int nRow = nX / IMAGE_WIDTH;
		System.out.println("col:" + nCol + "  row:" + nRow);
		int nDirection = directionCanMove(nCol, nRow);
		if (nDirection != DIRECTION_NONE)
		{
			move(nCol, nRow, nDirection);
			nStep++;
			repaint();
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0)
	{
		// TODO Auto-generated method stub

	}

	public boolean move(int nDirection)
	{
		int nNoImageCol = -1;
		int nNoImageRow = -1;
		int i = 0;
		int j = 0;
		while (i < 3 && nNoImageRow == -1)
		{
			while (j < 3 && nNoImageCol == -1)
			{
				if (m_nImageNo[i][j] == NO_IMAGE)
				{
					nNoImageRow = i;
					nNoImageCol = j;
				}
				j++;
			}
			j = 0;
			i++;
		}
		// 以上判断哪个拼图可以往方向nDirection移动
		// 可以移动的拼图的位置为第nNoImageCol行，第nNoImageRow列。
		System.out.println(nNoImageCol + ",," + nNoImageRow);
		switch (nDirection)
		{
			case DIRECTION_UP:
				if (nNoImageCol == 2) return false;
				m_nImageNo[nNoImageRow][nNoImageCol] = m_nImageNo[nNoImageRow][nNoImageCol + 1];
				m_nImageNo[nNoImageRow][nNoImageCol + 1] = NO_IMAGE;
				break;
			case DIRECTION_DOWN:
				if (nNoImageCol == 0) return false;
				m_nImageNo[nNoImageRow][nNoImageCol] = m_nImageNo[nNoImageRow][nNoImageCol - 1];
				m_nImageNo[nNoImageRow][nNoImageCol - 1] = NO_IMAGE;
				break;
			case DIRECTION_LEFT:
				if (nNoImageRow == 2) return false;
				m_nImageNo[nNoImageRow][nNoImageCol] = m_nImageNo[nNoImageRow + 1][nNoImageCol];
				m_nImageNo[nNoImageRow + 1][nNoImageCol] = NO_IMAGE;
				break;
			case DIRECTION_RIGHT:
				if (nNoImageRow == 0) return false;
				m_nImageNo[nNoImageRow][nNoImageCol] = m_nImageNo[nNoImageRow - 1][nNoImageCol];
				m_nImageNo[nNoImageRow - 1][nNoImageCol] = NO_IMAGE;
				break;
		}
		return true;
	}

	public void move(int nCol, int nRow, int nDirection)
	{
		switch (nDirection)
		{
			case DIRECTION_UP:
				m_nImageNo[nRow][nCol - 1] = m_nImageNo[nRow][nCol];
				m_nImageNo[nRow][nCol] = NO_IMAGE;
				break;
			case DIRECTION_DOWN:
				m_nImageNo[nRow][nCol + 1] = m_nImageNo[nRow][nCol];
				m_nImageNo[nRow][nCol] = NO_IMAGE;
				break;
			case DIRECTION_LEFT:
				m_nImageNo[nRow - 1][nCol] = m_nImageNo[nRow][nCol];
				m_nImageNo[nRow][nCol] = NO_IMAGE;
				break;
			case DIRECTION_RIGHT:
				m_nImageNo[nRow + 1][nCol] = m_nImageNo[nRow][nCol];
				m_nImageNo[nRow][nCol] = NO_IMAGE;
				break;
		}
	}

	public void paint(Graphics g)
	{
		g.setColor(Color.white); // 将当前颜色变为白色
		g.fillRect(0, 0, DELTAX, IMAGE_HEIGHT * 3); // 填充左边的提示信息区域
		g.setFont(new Font("宋体", Font.PLAIN, 15)); // 设置字体
		g.setColor(Color.blue); // 设置颜色
		g.drawString("步数：" + nStep, 5, 20);
		g.setColor(Color.white);
		if (bOnShowAll)
		{
			int x = DELTAX;
			int y = 0;
			g.drawImage(m_ImgAll, x, y, this);
			return;
		}
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				int x = i * IMAGE_WIDTH + DELTAX;
				int y = j * IMAGE_HEIGHT;

				if (m_nImageNo[i][j] == NO_IMAGE)
					g.fill3DRect(x, y, IMAGE_WIDTH, IMAGE_HEIGHT, true);
				else
				{
					g.drawImage(m_Image[m_nImageNo[i][j]], x, y, this);
					g.drawRect(x, y, IMAGE_WIDTH, IMAGE_HEIGHT);
				}
			}
		}
		checkStatus();
		if (bWantStartNewGame)
		{
			// 如果游戏结束，玩家将拼图的顺序排对之后
			nScore = 1000 - nStep * 10 - nTime;
			g.setColor(Color.blue);
			g.drawString("请按任意键重新开始", 5, 140);
			g.setColor(Color.red);
			g.setFont(new Font("宋体", Font.PLAIN, 40));
			g.drawString("你赢了" + nScore + "分", 70 + DELTAX, 160);
			g.drawString("祝贺你！", 110 + DELTAX, 210);
			transferScore(nScore);
		}
	}

	@SuppressWarnings("static-access")
	@Override
	public void run()
	{
		while (Thread.currentThread() == thTimer)
		{
			try
			{
				thTimer.sleep(990);
				String sTemp = "你玩了" + nTime + "秒的时间,";
				if (nTime > 200)
					sTemp = sTemp + "时间用的很长了，你可要加油啦!";
				else
					sTemp = sTemp + "别紧张，慢慢来。";
				this.statusText.setText(sTemp);
				if (!bWantStartNewGame) nTime++;
			}
			catch (Exception e)
			{
			}
		}
	}

	public void transferScore(int nScore)
	{
		nScore = (nScore / 2) * 10 + nScore % 4;
	}

	public void update(Graphics g)
	{
		paint(g);
	}
}
