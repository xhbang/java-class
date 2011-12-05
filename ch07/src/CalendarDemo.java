
import java.util.Calendar;

public class CalendarDemo
{
    public static void main(String[] args)
    {
        //获得日历对象
        Calendar c = Calendar.getInstance();
        c.setFirstDayOfWeek(Calendar.MONDAY);
        //显示当前的日期的各个分量
        display(c);
        //设置日期和时间.
        c.set(2006, 11, 30);
        c.set(Calendar.HOUR, 10);
        c.set(Calendar.MINUTE, 29);
        c.set(Calendar.SECOND, 22);
        System.out.println("更新后时间: ");
        display(c);
        //调整日期和时间
        c.add(Calendar.DATE, 10);
        c.add(Calendar.HOUR_OF_DAY, 10);
        System.out.println("调整后时间: ");
        display(c);
    }

    static void display(Calendar c)
    {
        String months[] = { "一月", "二月", "三月", "四月", "五月", 
                "六月", "七月", "八月",
                "九月", "十月", "十一月", "十二月" };
        String days[] = { "", "星期一", "星期二", "星期三", "星期四", 
                "星期五", "星期六", "星期日" };
        System.out.print("日期: ");
        System.out.print(c.get(Calendar.YEAR) + "年");

        System.out.print(months[c.get(Calendar.MONTH)]);
        System.out.print(c.get(Calendar.DATE) + "日 ");
        System.out.println(days[c.get(Calendar.DAY_OF_WEEK) - 1]);
        System.out.print("时间: ");
        System.out.print(c.get(Calendar.HOUR) + ":");
        System.out.print(c.get(Calendar.MINUTE) + ":");
        System.out.println(c.get(Calendar.SECOND));
    }
}