import java.util.*;
public class project01 {
	//建立项目1  书籍信息
	public static void main(String[] args) {
		 //b1 是新的book类 
		Scanner scanner = new Scanner(System.in);
		System.out.print("please input which you wanna:");
		String bookname = scanner.next();
		
		book b1=new book();
		//b1的各项数据
		 b1.bookname="千与千寻";
		 b1.bookstyle="故事书";
		 b1.IBNS="IBBD11110";
		 b1.page=100;
		 b1.press="新华出版社";
		// String 
		 //System.out.print("b1的书名是:"+b1.bookname);
		//System.out.println("b1的书名是"+b1.bookname);
		 //System.out.println("b1的书类是"+b1.bookstyle);
		// System.out.println("b1的IBNS是"+b1.IBNS);
		 //System.out.println("b1的页数是"+b1.page);
		// System.out.println("b1的出版社是"+b1.press);
		}
	
}
	
	class book
	{
		//成员变量
		String bookname;
		int page;
		double sell;
		String writer;
		String IBNS;
		String bookstyle;
		String press;
		
		
		
		//方法
		public int read(){
		
		System.out.println("这本书有："+page);
		return page;
		
		}
	
		public void IBNS(){
		System.out.println("这本书的IBNS是："+IBNS);
		
		}
	
	
	}

