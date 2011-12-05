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
		System.out.println("现在的时间是：" + now);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 北京时间");
		System.out.println("现在的时间是：" + sdf.format(now));

	}

}
