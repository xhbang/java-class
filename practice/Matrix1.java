//the basic part of aoglrithm
//��Ȼ�Ұ���д�ø����ˡ��������϶��и��õķ���
//˼·��
//zeros[i]�ǵ�i�е�0�ĸ���
//newindex��������zeros�ҳ�����Сֵ���±꣬��������
//�ֱ���newindex[0]->newindex[max]����������findmax�����ˣ����õ��㷨���ã���Ҫ��д��򵥡�������
//ʱ�临�Ӷ���n^2,�϶���nlog(n)�İ취��Ҫ���Խ��ˣ���øĵ�����������øĵ�������Сֵ���±��Ǹ�
//more info:sonicisdreaming@gmail.com
//������5*5�ľ���������Լ�ȥ�����
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
					zeros[i]++;	//i���ж��ٸ�0,Ԥ����
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
//mark it big,���Ǹ��÷���,��Ϊzeros�����ˣ��������������ʵ�ã�ֻҪ��֪�����ֵ���ᳬ�����٣������������Ƚ�ͨ�õķ���
		}
	}
	
	//�ҳ���0������С�ų������������ֵ
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
