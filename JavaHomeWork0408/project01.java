import java.util.*;
public class project01 {
	//������Ŀ1  �鼮��Ϣ
	public static void main(String[] args) {
		 //b1 ���µ�book�� 
		Scanner scanner = new Scanner(System.in);
		System.out.print("please input which you wanna:");
		String bookname = scanner.next();
		
		book b1=new book();
		//b1�ĸ�������
		 b1.bookname="ǧ��ǧѰ";
		 b1.bookstyle="������";
		 b1.IBNS="IBBD11110";
		 b1.page=100;
		 b1.press="�»�������";
		// String 
		 //System.out.print("b1��������:"+b1.bookname);
		//System.out.println("b1��������"+b1.bookname);
		 //System.out.println("b1��������"+b1.bookstyle);
		// System.out.println("b1��IBNS��"+b1.IBNS);
		 //System.out.println("b1��ҳ����"+b1.page);
		// System.out.println("b1�ĳ�������"+b1.press);
		}
	
}
	
	class book
	{
		//��Ա����
		String bookname;
		int page;
		double sell;
		String writer;
		String IBNS;
		String bookstyle;
		String press;
		
		
		
		//����
		public int read(){
		
		System.out.println("�Ȿ���У�"+page);
		return page;
		
		}
	
		public void IBNS(){
		System.out.println("�Ȿ���IBNS�ǣ�"+IBNS);
		
		}
	
	
	}

