

import java.util.Scanner; //����java.util���е�Scanner���������
//import java.util.*  ���Ե�����������࣬Ҳ���ԴﵽЧ������ʵ�ʿ����ж����á�importjava.util.Scanner;�������÷�����Ϊ������û�õ��İ�����Ļ�ֻ��Ӱ�����Ч�ʡ�
public class HomeWork13 
{
	public static void main (String[] args) 
	{
		System.out.println("������һ�����ٸ���:");
		Scanner input=  new Scanner(System.in);
		int n=input.nextInt();   // �������û��Լ�����������ֵ                
		found(n);
		System.out.println("�� "+n+" �������ӵĶ���Ϊ: "+found(n));
		input.close();           // �ر������ڴ�    
	}
	
	private static int found (int n) //�ݹ鷽��ʵ��
	{
		
		if(n==1 || n==2)  // || �� | ���Ǳ�ʾ���򡱣�������||ֻҪ�����һ������������������Ͳ����жϣ���|Ҫ�����е����������жϡ�
			return 1;
		else
			return(found(n-1)+found(n-2));
	}
}


