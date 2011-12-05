public class MemoryDemo
{

    public static void main(String[] args)
    {
        Runtime r = Runtime.getRuntime();
        long mem1, mem2;
        Integer someints[] = new Integer[1000];
        //总可用内存,不是计算机的总内存,是JVM中可用的总内存
        System.out.println("Total memory is: " + r.totalMemory());
        //空闲内存
        mem1 = r.freeMemory();
        System.out.println("Initial free memory: " + mem1);
        r.gc();
        //垃圾收集后的空闲内存
        mem1 = r.freeMemory();
        System.out.println("Free memory after garbage collection: " + mem1);
        //进行内存分配
        for (int i = 0; i < 1000; i++)
            someints[i] = new Integer(i);
        //分配后的可用空闲内存
        mem2 = r.freeMemory();
        System.out.println("Free memory after allocation: " + mem2);
        //占用的内存
        System.out.println("Memory used by allocation: " + (mem1 - mem2));
        //释放对象
        for (int i = 0; i < 1000; i++)
            someints[i] = null;
        r.gc(); // 垃圾回收
        mem2 = r.freeMemory();
        System.out.println("Free memory after collecting"
                + " discarded Integers: " + mem2);
    }
}