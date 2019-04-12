

import java.util.Scanner; //导入java.util包中的Scanner这个工具类
//import java.util.*  可以导入包中所有类，也可以达到效果。　实际开发中都采用“importjava.util.Scanner;”这种用法，因为程序中没用到的包导入的话只会影响程序效率。
public class HomeWork13 
{
	public static void main (String[] args) 
	{
		System.out.println("请输入一共多少个月:");
		Scanner input=  new Scanner(System.in);
		int n=input.nextInt();   // 用来让用户自己输入月数的值                
		found(n);
		System.out.println("第 "+n+" 个月兔子的对数为: "+found(n));
		input.close();           // 关闭配置内存    
	}
	
	private static int found (int n) //递归方法实现
	{
		
		if(n==1 || n==2)  // || 和 | 都是表示“或”，区别是||只要满足第一个条件，后面的条件就不再判断，而|要对所有的条件进行判断。
			return 1;
		else
			return(found(n-1)+found(n-2));
	}
}


