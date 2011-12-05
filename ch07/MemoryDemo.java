public class MemoryDemo
{

    public static void main(String[] args)
    {
        Runtime r = Runtime.getRuntime();
        long mem1, mem2;
        Integer someints[] = new Integer[1000];
        //�ܿ����ڴ�,���Ǽ���������ڴ�,��JVM�п��õ����ڴ�
        System.out.println("Total memory is: " + r.totalMemory());
        //�����ڴ�
        mem1 = r.freeMemory();
        System.out.println("Initial free memory: " + mem1);
        r.gc();
        //�����ռ���Ŀ����ڴ�
        mem1 = r.freeMemory();
        System.out.println("Free memory after garbage collection: " + mem1);
        //�����ڴ����
        for (int i = 0; i < 1000; i++)
            someints[i] = new Integer(i);
        //�����Ŀ��ÿ����ڴ�
        mem2 = r.freeMemory();
        System.out.println("Free memory after allocation: " + mem2);
        //ռ�õ��ڴ�
        System.out.println("Memory used by allocation: " + (mem1 - mem2));
        //�ͷŶ���
        for (int i = 0; i < 1000; i++)
            someints[i] = null;
        r.gc(); // ��������
        mem2 = r.freeMemory();
        System.out.println("Free memory after collecting"
                + " discarded Integers: " + mem2);
    }
}