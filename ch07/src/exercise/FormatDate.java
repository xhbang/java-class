package exercise;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now = new Date();
		System.out.println("���ڵ�ʱ���ǣ�" + now);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� ����ʱ��");
		System.out.println("���ڵ�ʱ���ǣ�" + sdf.format(now));

	}

}
