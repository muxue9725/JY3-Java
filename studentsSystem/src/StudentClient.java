

import java.util.Scanner;
import java.util.Arrays;
public class StudentClient {
	static String userName = "admin";
	static String passWord = "admin";
	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("*************欢迎来到学生管理系*************");
		System.out.println("1.登陆                             2.退出");
		System.out.println("********************************************");
		StudentClient StudentClient = new StudentClient();
		StudentClient.welcomePage();
	}

	public void welcomePage() {
		System.out.println("请选择");
		int c = scanner.nextInt();
		switch (c) {
		case 1:
			System.out.println("欢迎登陆");
			System.out.println("请输入用户名");
			String usn = scanner.next();
			System.out.println("请输入密码");
			String psw = scanner.next();
			
			Admin admin = new Admin(usn, psw);
			boolean login = login(admin);
			if (login = true) {
				System.out.println("欢迎您，" + usn);
				stuManagerIndex();
			} else {
				welcomePage();
			}
			break;
		case 2:
			exit();
		default:
			System.out.println("输入有误，请重新选择");
			welcomePage();
		}
	}

	public boolean login(Admin a) {
		if (userName.equals(a.username) && passWord.equals(a.password)) {
			return true;
		}
		return false;
	}

	public void exit() {
		System.exit(0);
	}
	
	public void stuManagerIndex() {
		StudentClient StudentClient = new StudentClient();
		System.out.println("***************请选择需要操作的信息所对应的数字  ***************");
		System.out.println("*1.查看学生信息   2.添加学生信息    3.删除学生信息    4.修改学生信息     5.退出*");
		System.out.println("****************************************************");
	    System.out.println("请选择：");
	    //输入1 输出登录成功 账户密码等信息 输入2 退出 输入其他 重新输入
	    int nextInt = scanner.nextInt();     
	    StudentManage sm =  new StudentManage();
	    switch (nextInt) {
	    
	    //输入1时 调用添加过的信息
	    case 1:
	    	//打印全部数组内容
	    	
	    	//用户输入 来选择是否返回 
	    	System.out.println("输入1查看所有信息 输入2根据ID查看学生信息");
	    	int nextInt1 = scanner.nextInt(); 
	    	switch(nextInt1) {
	    		
	    	//输入1查看所有信息
	    	case 1:	
	    		System.out.println(Arrays.toString(StudentManage.stus));
	    		//StudentClient.stuManagerIndex();	
	    		break;
	    	//根据ID查询部分信息
	    	case 2:	
	    		System.out.println("输入你要查询的ID");
		    	int id1=scanner.nextInt();
		    	//判断输入ID是否等于学生ID 应该用for循环 不能写死
//		    	System.out.println("输入你要修改的ID");
		    	sm.inquiryMethod(id1);
//		    	System.out.println(Arrays.toString(StudentManage.stus));
//		    	System.out.println(xiba2);
	    		System.out.println("你害想干哈？");
	    	
	    		break;
	    		
	    	}
	    //输入2时 添加学生信息             
	    case 2:
	    	//输入2 添加信息
	    	sm.addStudentpage(scanner);
	    	break;
	    //输入3时 删除学生信息（根据ID找到并删除）
	    case 3:
	    	System.out.println("输入要删除的ID");
	    	int stuId=scanner.nextInt();
	    	
	    	//
	    	Student[] xiba=sm.del( stuId);
	    	System.out.println(Arrays.toString(xiba));
	    	//返回删除后的界面 并自动返回主菜单
	    	StudentClient.stuManagerIndex();
	    	break;
	    	
	    //输入4时 打开1界面 并实现修改并保存	
	    case 4:
	    	//引用类 修改信息
	    	//先要想 用户输入什么  用户想修改什么
	    	//用户需要根据ID修改 名字  并且 把用户输入的新名字赋值给旧名字
	    	System.out.println("输入你要修改的ID");
	    	int id=scanner.nextInt();
	    	System.out.println("输入你要修改的NAME");
	    	String newname=scanner.next();
	    	String xiba1=sm.updatename(id, newname);
	    	System.out.println(xiba1);
	    	StudentClient.stuManagerIndex();
	    	//引用方法updatename
	    	//ud.update(StudentManage.stus);
	    	break;
	    default :
	    	//返回菜单界面
	    	StudentClient.stuManagerIndex();
	        break;
	    }
	}
}
