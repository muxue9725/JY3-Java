import java.util.Scanner;

public class RevisonMge {
	StudentClient sc = new StudentClient();
	public void rewriteStudentpage(Scanner scanner) {
		System.out.println("������ѧ��id��");
		int id = scanner.nextInt();
		System.out.println("������ѧ��������");
		String name = scanner.next();
		System.out.println("������ѧ���Ա�");
		char sex = scanner.next().charAt(0);
		System.out.println("������ѧ�����䣺");
		short age = scanner.nextShort();
		System.out.println("������ѧ���༶��");
		String grade = scanner.next();
		System.out.println("������ѧ����ַ��");
		String address = scanner.next();
		System.out.println("������ѧ���绰��");
		String tel = scanner.next();
		System.out.println("������ѧ�����䣺");
		String email = scanner.next();
		StudentManage studentManage = new StudentManage();
		Student stu5 = new Student(id, name, sex, age, grade,address, tel, email);
//		studentManage.rewriteStudent(stu5);
		System.out.println("���ݱ���ɹ��������ϼ�Ŀ¼������");
		sc.stuManagerIndex();
	}
}
