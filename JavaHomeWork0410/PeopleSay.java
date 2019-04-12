
public class PeopleSay extends People06{
	public PeopleSay() {
		
		
	}
	public PeopleSay(int height,int weight,String name) {
		this.height=height;
		this.weight=weight;
		this.name=name;	
	}
	public void SayMethod(String name,int height,int weight) {
		 System.out.println("你好我的名字是："+name);
		
	}
}
