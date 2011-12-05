
import java.util.Calendar;

public class CalendarDemo
{
    public static void main(String[] args)
    {
        //�����������
        Calendar c = Calendar.getInstance();
        c.setFirstDayOfWeek(Calendar.MONDAY);
        //��ʾ��ǰ�����ڵĸ�������
        display(c);
        //�������ں�ʱ��.
        c.set(2006, 11, 30);
        c.set(Calendar.HOUR, 10);
        c.set(Calendar.MINUTE, 29);
        c.set(Calendar.SECOND, 22);
        System.out.println("���º�ʱ��: ");
        display(c);
        //�������ں�ʱ��
        c.add(Calendar.DATE, 10);
        c.add(Calendar.HOUR_OF_DAY, 10);
        System.out.println("������ʱ��: ");
        display(c);
    }

    static void display(Calendar c)
    {
        String months[] = { "һ��", "����", "����", "����", "����", 
                "����", "����", "����",
                "����", "ʮ��", "ʮһ��", "ʮ����" };
        String days[] = { "", "����һ", "���ڶ�", "������", "������", 
                "������", "������", "������" };
        System.out.print("����: ");
        System.out.print(c.get(Calendar.YEAR) + "��");

        System.out.print(months[c.get(Calendar.MONTH)]);
        System.out.print(c.get(Calendar.DATE) + "�� ");
        System.out.println(days[c.get(Calendar.DAY_OF_WEEK) - 1]);
        System.out.print("ʱ��: ");
        System.out.print(c.get(Calendar.HOUR) + ":");
        System.out.print(c.get(Calendar.MINUTE) + ":");
        System.out.println(c.get(Calendar.SECOND));
    }
}