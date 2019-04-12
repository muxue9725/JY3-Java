
public class Qustest {
	public static void main(String[] args) {
		String[] options=new String[] {
			"A","B","C","D"	
		};
		SingleQus sq=new SingleQus(11, "谁帅？",options ,"C" );
		String[] ans=new String[] {
			"a"	
		};
		//不能直接输出类sq 不然会出现sq在内存的位置 
		//通过引用实现
		boolean checkMytext=sq.check(ans);
		System.out.println(checkMytext);
	}
}
