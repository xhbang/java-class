package ch01;

import javax.swing.*;

public class Proba{
	public static void main(String[] args){
		String input=JOptionPane.showInputDialog("��ϣ����ȡ���ٸ�����");
                int k=Integer.parseInt(input);

		input=JOptionPane.showInputDialog("һ���ж��ٸ�����");
		int n=Integer.parseInt(input);

		int result=1;
		for(int i=1;i<=k;i++)
		{
			result=result*(n-i+1)/i;
		}
                System.out.print("���н��ļ�����1/"+result+"");
	}
}

