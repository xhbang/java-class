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
		// 采用匿名类的方式从AbstractTableModel继承
		JTable table = new JTable(new AbstractTableModel() {
			// 列名
			private String columnName[] = { "第1列", "第2列", "第3列", "第4列" };

			// 根据列(column)返回列名
			public String getColumnName(int column) {
				return columnName[column];
			}

			// 返回列的大小
			public int getColumnCount() {
				return 4;
			}

			// 返回行的大小
			public int getRowCount() {
				return 4;
			}

			// 返回表格中第row行，col列的数据
			public Object getValueAt(int row, int col) {
				return new Integer(row * col);
			}
		});
		// 为了防止表格过长，使用JScrollPane，使得表格具有滚动条
		JScrollPane scrollpane = new JScrollPane(table);
		add(scrollpane, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		JTableDemo frame = new JTableDemo();
		frame.setVisible(true);

	}
}
