

import java.util.Scanner;
import java.util.Arrays;
public class StudentClient {
	static String userName = "admin";
	static String passWord = "admin";
	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("*************��ӭ����ѧ������ϵ*************");
		System.out.println("1.��½                             2.�˳�");
		System.out.println("********************************************");
		StudentClient StudentClient = new StudentClient();
		StudentClient.welcomePage();
	}

	public void welcomePage() {
		System.out.println("��ѡ��");
		int c = scanner.nextInt();
		switch (c) {
		case 1:
			System.out.println("��ӭ��½");
			System.out.println("�������û���");
			String usn = scanner.next();
			System.out.println("����������");
			String psw = scanner.next();
			
			Admin admin = new Admin(usn, psw);
			boolean login = login(admin);
			if (login = true) {
				System.out.println("��ӭ����" + usn);
				stuManagerIndex();
			} else {
				welcomePage();
			}
			break;
		case 2:
			exit();
		default:
			System.out.println("��������������ѡ��");
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
		System.out.println("***************��ѡ����Ҫ��������Ϣ����Ӧ������  ***************");
		System.out.println("*1.�鿴ѧ����Ϣ   2.���ѧ����Ϣ    3.ɾ��ѧ����Ϣ    4.�޸�ѧ����Ϣ     5.�˳�*");
		System.out.println("****************************************************");
	    System.out.println("��ѡ��");
	    //����1 �����¼�ɹ� �˻��������Ϣ ����2 �˳� �������� ��������
	    int nextInt = scanner.nextInt();     
	    StudentManage sm =  new StudentManage();
	    switch (nextInt) {
	    
	    //����1ʱ ������ӹ�����Ϣ
	    case 1:
	    	//��ӡȫ����������
	    	
	    	//�û����� ��ѡ���Ƿ񷵻� 
	    	System.out.println("����1�鿴������Ϣ ����2����ID�鿴ѧ����Ϣ");
	    	int nextInt1 = scanner.nextInt(); 
	    	switch(nextInt1) {
	    		
	    	//����1�鿴������Ϣ
	    	case 1:	
	    		System.out.println(Arrays.toString(StudentManage.stus));
	    		//StudentClient.stuManagerIndex();	
	    		break;
	    	//����ID��ѯ������Ϣ
	    	case 2:	
	    		System.out.println("������Ҫ��ѯ��ID");
		    	int id1=scanner.nextInt();
		    	//�ж�����ID�Ƿ����ѧ��ID Ӧ����forѭ�� ����д��
//		    	System.out.println("������Ҫ�޸ĵ�ID");
		    	sm.inquiryMethod(id1);
//		    	System.out.println(Arrays.toString(StudentManage.stus));
//		    	System.out.println(xiba2);
	    		System.out.println("�㺦��ɹ���");
	    	
	    		break;
	    		
	    	}
	    //����2ʱ ���ѧ����Ϣ             
	    case 2:
	    	//����2 �����Ϣ
	    	sm.addStudentpage(scanner);
	    	break;
	    //����3ʱ ɾ��ѧ����Ϣ������ID�ҵ���ɾ����
	    case 3:
	    	System.out.println("����Ҫɾ����ID");
	    	int stuId=scanner.nextInt();
	    	
	    	//
	    	Student[] xiba=sm.del( stuId);
	    	System.out.println(Arrays.toString(xiba));
	    	//����ɾ����Ľ��� ���Զ��������˵�
	    	StudentClient.stuManagerIndex();
	    	break;
	    	
	    //����4ʱ ��1���� ��ʵ���޸Ĳ�����	
	    case 4:
	    	//������ �޸���Ϣ
	    	//��Ҫ�� �û�����ʲô  �û����޸�ʲô
	    	//�û���Ҫ����ID�޸� ����  ���� ���û�����������ָ�ֵ��������
	    	System.out.println("������Ҫ�޸ĵ�ID");
	    	int id=scanner.nextInt();
	    	System.out.println("������Ҫ�޸ĵ�NAME");
	    	String newname=scanner.next();
	    	String xiba1=sm.updatename(id, newname);
	    	System.out.println(xiba1);
	    	StudentClient.stuManagerIndex();
	    	//���÷���updatename
	    	//ud.update(StudentManage.stus);
	    	break;
	    default :
	    	//���ز˵�����
	    	StudentClient.stuManagerIndex();
	        break;
	    }
	}
}
