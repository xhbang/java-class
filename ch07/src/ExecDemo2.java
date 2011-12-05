public class ExecDemo2
{
    public static void main(String[] args)
    {
        Runtime r = Runtime.getRuntime();
        Process p = null;
         try {
            p = r.exec("notepad  ");
            //程序暂停1秒钟
            Thread.sleep(1000);
            //关闭外部程序
            p.waitFor();

        } catch (Exception e) {
            System.out.println("Error executing notepad.");
        }
        System.out.println("Notepad returned " + p.exitValue());
    }
}