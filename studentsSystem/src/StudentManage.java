

import java.util.Arrays;
import java.util.Scanner;
//学生信息 类
public class StudentManage {
	//创建学生数组
	static Student[] stus = new Student[0];
//	static Student[] stus1 = new Student[0];
	static Student[] newStus ;//;
    StudentClient sc = new StudentClient();
	//添加学生信息方法
	public void addStudent(Student student) {
		stus = Arrays.copyOf(stus, stus.length +1);
		stus[stus.length - 1] = student;
	}
//	public void rewriteStudent(Student student) {
//		 System.arraycopy(stus, 0,stus1,0,stus.length);
//		 System.out.println(stus1);
//		stus1[stus.length - 1] = student;
//	}
	
	public void addStudentpage(Scanner scanner) {
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
		studentManage.addStudent(stu5);
		System.out.println("数据保存成功，返回上级目录。。。");
		sc.stuManagerIndex();
	}
	//删除方法
	public Student[] del(int stuId) {
		
		int j = 0;
		for (int i = 0; i < stus.length; i++) 
		{//数组长度减一
		// 新数组 长度减一
		newStus = new Student[stus.length - 1];
			if (stuId != stus[i].id) {
				newStus[j] = stus[i];
				j++;
			}
			stus=newStus;
		}
		return stus;
//		System.out.println(Arrays.toString(newStus));
	}
	//按照ID 修改信息并保存
	public String updatename(int id,String newname) {
		for (int i = 0; i < stus.length; i++) 
		{//数组长度减一
		// 新数组 长度减一
		newStus = new Student[stus.length - 1];
			if (id == stus[i].id) {
				stus[i].stuName	= newname;
			}
		}
		return "成了";
	}
	//按照ID查询学生信息
	public static String inquiryMethod(int id) {
		for (int i = 0; i < stus.length; i++) 
		{//数组长度减一
		// 新数组 长度减一
		newStus = new Student[stus.length - 1];
			if (id == stus[i].id) {
//				stus[i].stuName	= ;
				System.out.println(stus[i]);
			}
		}
		return "成了";
	}
	public void update(Student student) {
		for (int i = 0; i < stus.length; i++) {
			if (stus[i].id == student.id) {
				stus[i] = student;
			}
		}
	}

	public static void main(String[] args) {
		StudentManage studentManage = new StudentManage();
		Student stu = new Student(1, "张三", '男', (short) 12, "高级", "天津", "123456", "123456@qq.com");
		studentManage.addStudent(stu);
		Student stu2 = new Student(2, "张三", '男', (short) 12, "高级", "天津", "123456", "123456@qq.com");
		studentManage.addStudent(stu2);
		Student stu3 = new Student(3, "张三", '男', (short) 12, "高级", "天津", "123456", "123456@qq.com");
		studentManage.addStudent(stu3);
		Student stu4 = new Student(4, "张三", '男', (short) 12, "高级", "天津","123456", "123456@qq.com");
		studentManage.addStudent(stu4);
		System.out.println(Arrays.toString(stus));
		studentManage.del(2);
	}
}
