
public class Qustest {
	public static void main(String[] args) {
		String[] options=new String[] {
			"A","B","C","D"	
		};
		SingleQus sq=new SingleQus(11, "˭˧��",options ,"C" );
		String[] ans=new String[] {
			"a"	
		};
		//����ֱ�������sq ��Ȼ�����sq���ڴ��λ�� 
		//ͨ������ʵ��
		boolean checkMytext=sq.check(ans);
		System.out.println(checkMytext);
	}
}
