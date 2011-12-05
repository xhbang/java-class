//ArrayAvg.java
public class ArrayAvg{
    public static void main(String[] args) {
        final int ARRAY_SIZE=10;
        int a[]=new int[ARRAY_SIZE];
        int i=0;
        int sum=0;
        double avg=0.0;
        for(i=0;i<a.length;i++) {       //使用了length属性
           a[i]=(int)(Math.random()*10); //产生随机数
           sum=sum+a[i];            //计算和
           System.out.print("  "+a[i]);  //输出
        }
        System.out.println();
        avg=(double)sum/a.length;      //先转换为浮点数，再计算
        System.out.println("average="+avg);
    }
}
