//JTreeDemo.java
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeDemo extends JFrame {
	public JTreeDemo() {
		setSize(300, 300);
		setLocation(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		// �������ĸ��ڵ�
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
		// �������ӽڵ�
		DefaultMutableTreeNode childOne = new DefaultMutableTreeNode(
				"Child One");
		DefaultMutableTreeNode childTwo = new DefaultMutableTreeNode(
				"Child Two");
		DefaultMutableTreeNode childOfChildOne = new DefaultMutableTreeNode(
				"Child of Child One");
		DefaultMutableTreeNode childOfChildTwo = new DefaultMutableTreeNode(
				"Child of Child Two");
		// childOne��childTwo��Ϊ���ڵ�ĺ���
		root.add(childOne);
		root.add(childTwo);
		// childOfChildOne��ΪchildOne�ĺ���
		childOne.add(childOfChildOne);
		// childOfChildTwo��ΪchildTwo�ĺ���
		childTwo.add(childOfChildTwo);
		// ����JTree
		JTree jtree = new JTree(root);
		// Ϊ�˷�ֹ���οؼ�������ʹ��JScrollPane��ʹ�����οؼ����й�����
		JScrollPane scrollpane = new JScrollPane(jtree);
		add(scrollpane, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		JTreeDemo frame = new JTreeDemo();
		frame.setVisible(true);
	}
}
