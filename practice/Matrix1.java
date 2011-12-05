//the basic part of aoglrithm
//显然我把它写得复杂了。。。。肯定有更好的方法
//思路：
//zeros[i]是第i行的0的个数
//newindex是依次在zeros找出的最小值的下标，代表行数
//分别在newindex[0]->newindex[max]的行数中用findmax就行了，我用的算法不好，主要是写起简单。。。。
//时间复杂度是n^2,肯定有nlog(n)的办法，要动脑筋了，最好改的是搜索，最不好改的是找最小值的下标那个
//more info:sonicisdreaming@gmail.com
//例子是5*5的矩阵，你可以自己去改这个
public class Matrix1{
	static int d=5;	//size
	static int[][] data={
			{1,2,3,4,5,},
			{3,0,4,5,7,},
			{5,0,9,0,7,},
			{5,6,7,3,4,},
			{4,0,0,0,3}};
	static int zeros[];
	static int newindex[];

	public static void prepare(){
		for(int i=0;i<d;i++){
			zeros[i]=0;			//init
			for(int j=0;j<d;j++){
				if(data[i][j]==0)
					zeros[i]++;	//i行有多少个0,预处理
//				System.out.println(zeros[i]);
			}
			System.out.println("\n");
		}
	}

	public static void findmin(){
		int min;
		int minindex;
		for(int k=0;k<d ;k++){
			minindex=0;
			min=zeros[0];
			for(int j=1;j<d ;j++){
					if(min>zeros[j]){
						min=zeros[j];
						minindex=j;
				}
			}
			System.out.println(minindex);
			newindex[k]=minindex;
			zeros[minindex]=1000;
//mark it big,不是个好方法,因为zeros被改了，但是这个方法很实用，只要你知道最大值不会超出多少，我再想个另外比较通用的方法
		}
	}
	
	//找出按0个数最小排出的行数的最大值
	public static void findmax(){
		int max;
		int current;
		for(int i=0;i<d;i++){
			current=newindex[i];
			max=data[current][0];
			for(int j=1;j<d;j++){
				if(max<data[current][j])
					max=data[current][j];
			}
			System.out.println("find the max element "+max+"\tin row\t"+(current+1));
		}
	}

	public static void showzeros(){
		for(int i=0;i<d;i++){
			System.out.println(i+":\t"+zeros[i]);
		}
		
	}
	public static void showindex(){
		for(int i=0;i<d;i++){
			System.out.println(i+":\t"+newindex[i]);
		}
		
	}
	public static void main(String[] args){
		zeros=new int[6];
		newindex=new int[6];
		prepare();
		showzeros();
		findmin();
//		showindex();
		findmax();
			
	}
} 
