package exercise;

import java.util.*;

public class MonthCalendar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("2005��8��");
		System.out.println(" ��  һ ��  �� ��  ��  �� ");
		Calendar c = Calendar.getInstance();
		c.set(2005, 7, 1);//7��ʾ8��
		int weekday = c.get(Calendar.DAY_OF_WEEK) - 1;
		String a[] = new String[weekday + 31];
		for(int i=0;i<weekday;i++)
		{
			a[i]="**";
					}
         for(int i=weekday,n=1;i<a.length;i++)
         {
        	 if(n<=9)
        		 a[i]=String.valueOf(n)+" ";
        	 else
        		 a[i]=String.valueOf(n);
        	 n++;
         }
         for(int i=0;i<a.length;i++)
         {
        	if(i%7==0)
        	{
        		System.out.println("");
        	}
        	System.out.print(" "+a[i]);
         }
	}

}
