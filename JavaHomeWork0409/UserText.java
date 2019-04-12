import java.util.Scanner;


public class UserText {
	public static void main(String[] args) {
		//创建一个新的UserName的对象
		UserNameTest user=new UserNameTest();
		//键盘输入用户名&密码 进行判断
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入你的用户名");
		String username=scanner.next();
		System.out.println("输入你的密码");
		String password=scanner.next();
		boolean checkUser=UserNameTest.checkUser(username,password);
		System.out.println(checkUser==true ?"成功":"失败");
		scanner.close();
	}
}
