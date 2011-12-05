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
		// 创建树的根节点
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
		// 创建孩子节点
		DefaultMutableTreeNode childOne = new DefaultMutableTreeNode(
				"Child One");
		DefaultMutableTreeNode childTwo = new DefaultMutableTreeNode(
				"Child Two");
		DefaultMutableTreeNode childOfChildOne = new DefaultMutableTreeNode(
				"Child of Child One");
		DefaultMutableTreeNode childOfChildTwo = new DefaultMutableTreeNode(
				"Child of Child Two");
		// childOne和childTwo作为根节点的孩子
		root.add(childOne);
		root.add(childTwo);
		// childOfChildOne作为childOne的孩子
		childOne.add(childOfChildOne);
		// childOfChildTwo作为childTwo的孩子
		childTwo.add(childOfChildTwo);
		// 创建JTree
		JTree jtree = new JTree(root);
		// 为了防止树形控件过长，使用JScrollPane，使得树形控件具有滚动条
		JScrollPane scrollpane = new JScrollPane(jtree);
		add(scrollpane, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		JTreeDemo frame = new JTreeDemo();
		frame.setVisible(true);
	}
}
