class StringArray
{
    public static void main(String[] args) 
	{
    	//定义字符串数组
		String[] array = new String[]{"This is a test", 
			"Theo Washer",
            "the case is closed", 
			"tHe aLtErNaTiNg StRiNg"
		};
        System.out.println("排序之前："+"\n");
        //打印出排序之前的字符串数组
		for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("排序之后："+"\n");
        //调用Arrays对象的方法对字符串数组进行排序
        java.util.Arrays.sort(array, String.CASE_INSENSITIVE_ORDER);
        //打印出排序之后的字符串数组
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
