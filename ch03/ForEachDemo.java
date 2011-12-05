public class ForEachDemo {

	public static void main(String[] args) {
		int sum = 0;
		int a[] = new int[100];
		for (int i = 0; i < 100; i++)
			a[i] = 101 + i;
		// for-eachÓï¾äµÄÊ¹ÓÃ
		for (int e : a)
			sum = sum + e;
		System.out.println("the sum is " + sum);
	}

}
