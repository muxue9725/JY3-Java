

import java.util.Arrays;
import java.util.Scanner;
//ѧ����Ϣ ��
public class StudentManage {
	//����ѧ������
	static Student[] stus = new Student[0];
//	static Student[] stus1 = new Student[0];
	static Student[] newStus ;//;
    StudentClient sc = new StudentClient();
	//���ѧ����Ϣ����
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
		studentManage.addStudent(stu5);
		System.out.println("���ݱ���ɹ��������ϼ�Ŀ¼������");
		sc.stuManagerIndex();
	}
	//ɾ������
	public Student[] del(int stuId) {
		
		int j = 0;
		for (int i = 0; i < stus.length; i++) 
		{//���鳤�ȼ�һ
		// ������ ���ȼ�һ
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
	//����ID �޸���Ϣ������
	public String updatename(int id,String newname) {
		for (int i = 0; i < stus.length; i++) 
		{//���鳤�ȼ�һ
		// ������ ���ȼ�һ
		newStus = new Student[stus.length - 1];
			if (id == stus[i].id) {
				stus[i].stuName	= newname;
			}
		}
		return "����";
	}
	//����ID��ѯѧ����Ϣ
	public static String inquiryMethod(int id) {
		for (int i = 0; i < stus.length; i++) 
		{//���鳤�ȼ�һ
		// ������ ���ȼ�һ
		newStus = new Student[stus.length - 1];
			if (id == stus[i].id) {
//				stus[i].stuName	= ;
				System.out.println(stus[i]);
			}
		}
		return "����";
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
		Student stu = new Student(1, "����", '��', (short) 12, "�߼�", "���", "123456", "123456@qq.com");
		studentManage.addStudent(stu);
		Student stu2 = new Student(2, "����", '��', (short) 12, "�߼�", "���", "123456", "123456@qq.com");
		studentManage.addStudent(stu2);
		Student stu3 = new Student(3, "����", '��', (short) 12, "�߼�", "���", "123456", "123456@qq.com");
		studentManage.addStudent(stu3);
		Student stu4 = new Student(4, "����", '��', (short) 12, "�߼�", "���","123456", "123456@qq.com");
		studentManage.addStudent(stu4);
		System.out.println(Arrays.toString(stus));
		studentManage.del(2);
	}
}
