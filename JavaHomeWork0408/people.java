
public class people {
	//无参数方法
	public people(){
		
	}
	//有参数方法 （）内引用成员变量
	
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
		
		//调用民政局类
		MarryHouse marryHouse=new MarryHouse();
		MarryHouse.marryrules(this,apeople);
		return true;
	}	
}
