
public class Test03 {
	public static void main(String[] args)
	{
		String str="123456789012";
		
		//System.out.print(str.length());
		int oddNum=0;
		for(int i=1;i<str.length();i+=2){
			char c=str.charAt(i);
			 oddNum +=(int)c-48;
			
			
			
			
		}
		System.out.println(oddNum);
		
	}
}
