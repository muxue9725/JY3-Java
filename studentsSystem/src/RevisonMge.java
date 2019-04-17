import java.util.Scanner;

public class RevisonMge {
	StudentClient sc = new StudentClient();
	public void rewriteStudentpage(Scanner scanner) {
		System.out.println("请输入学生id：");
		int id = scanner.nextInt();
		System.out.println("请输入学生姓名：");
		String name = scanner.next();
		System.out.println("请输入学生性别：");
		char sex = scanner.next().charAt(0);
		System.out.println("请输入学生年龄：");
		short age = scanner.nextShort();
		System.out.println("请输入学生班级：");
		String grade = scanner.next();
		System.out.println("请输入学生地址：");
		String address = scanner.next();
		System.out.println("请输入学生电话：");
		String tel = scanner.next();
		System.out.println("请输入学生邮箱：");
		String email = scanner.next();
		StudentManage studentManage = new StudentManage();
		Student stu5 = new Student(id, name, sex, age, grade,address, tel, email);
//		studentManage.rewriteStudent(stu5);
		System.out.println("数据保存成功，返回上级目录。。。");
		sc.stuManagerIndex();
	}
}
