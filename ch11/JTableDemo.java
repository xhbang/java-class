//JTableDemo.java
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

public class JTableDemo extends JFrame {
	public JTableDemo() {
		setSize(300, 300);
		setLocation(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		// ����������ķ�ʽ��AbstractTableModel�̳�
		JTable table = new JTable(new AbstractTableModel() {
			// ����
			private String columnName[] = { "��1��", "��2��", "��3��", "��4��" };

			// ������(column)��������
			public String getColumnName(int column) {
				return columnName[column];
			}

			// �����еĴ�С
			public int getColumnCount() {
				return 4;
			}

			// �����еĴ�С
			public int getRowCount() {
				return 4;
			}

			// ���ر���е�row�У�col�е�����
			public Object getValueAt(int row, int col) {
				return new Integer(row * col);
			}
		});
		// Ϊ�˷�ֹ��������ʹ��JScrollPane��ʹ�ñ����й�����
		JScrollPane scrollpane = new JScrollPane(table);
		add(scrollpane, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		JTableDemo frame = new JTableDemo();
		frame.setVisible(true);

	}
}
