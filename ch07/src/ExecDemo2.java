public class ExecDemo2
{
    public static void main(String[] args)
    {
        Runtime r = Runtime.getRuntime();
        Process p = null;
         try {
            p = r.exec("notepad  ");
            //������ͣ1����
            Thread.sleep(1000);
            //�ر��ⲿ����
            p.waitFor();

        } catch (Exception e) {
            System.out.println("Error executing notepad.");
        }
        System.out.println("Notepad returned " + p.exitValue());
    }
}