
public class people {
	//�޲�������
	public people(){
		
	}
	//�в������� ���������ó�Ա����
	
	public people(String nums,String name,int age,String sex,
			String married,String IDnums,String address
			,String mate,boolean ismarry){
		this.nums=nums;
		this.address=address;
		this.ismarry=ismarry;
		this.IDnums=IDnums;
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
	
	
	String nums;
	String name;
	int age;
	String sex;
	String married;
	String IDnums;
	String address;
	String mate;
	
	public boolean ismarry;
	

	

	public  boolean marry(people apeople){
		
		//������������
		MarryHouse marryHouse=new MarryHouse();
		MarryHouse.marryrules(this,apeople);
		return true;
	}	
}
