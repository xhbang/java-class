class StringArray
{
    public static void main(String[] args) 
	{
    	//�����ַ�������
		String[] array = new String[]{"This is a test", 
			"Theo Washer",
            "the case is closed", 
			"tHe aLtErNaTiNg StRiNg"
		};
        System.out.println("����֮ǰ��"+"\n");
        //��ӡ������֮ǰ���ַ�������
		for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("����֮��"+"\n");
        //����Arrays����ķ������ַ��������������
        java.util.Arrays.sort(array, String.CASE_INSENSITIVE_ORDER);
        //��ӡ������֮����ַ�������
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
