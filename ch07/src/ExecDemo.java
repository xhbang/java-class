public class ExecDemo
{

    public static void main(String[] args)
    {
        Runtime r = Runtime.getRuntime();
        Process p = null;
        try {
            p = r.exec("notepad");
            //������ͣ1����
            Thread.sleep(1000);
            //�ر��ⲿ����
            p.destroy();

        } catch (Exception e) {
            System.out.println("Error executing notepad.");
        }

    }
}