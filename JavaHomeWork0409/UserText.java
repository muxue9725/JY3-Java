import java.util.Scanner;


public class UserText {
	public static void main(String[] args) {
		//����һ���µ�UserName�Ķ���
		UserNameTest user=new UserNameTest();
		//���������û���&���� �����ж�
		Scanner scanner=new Scanner(System.in);
		System.out.println("��������û���");
		String username=scanner.next();
		System.out.println("�����������");
		String password=scanner.next();
		boolean checkUser=UserNameTest.checkUser(username,password);
		System.out.println(checkUser==true ?"�ɹ�":"ʧ��");
		scanner.close();
	}
}
