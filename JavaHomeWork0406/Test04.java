public class Test04 {  
	public static void main(String[] args) {
		int i =56123;
		int a = intreverse( i);
		System.out.println(a);
	}
	public static int intreverse(int x) {  
		  long tmp = x; // ��ֹ������  
		  long result = 0;  
		  while (tmp != 0) {  
		     result = result *10 + tmp % 10;  
		     tmp = tmp /10; }  
		    // ����ж�  
		    if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE)
		    {  
		     result =0; }  
		     return (int) result;   
		   }
}

