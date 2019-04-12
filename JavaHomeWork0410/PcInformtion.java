
public class PcInformtion extends NotePc{
	//无参方法
	public PcInformtion() {
		
	}
	//有参方法
	public PcInformtion(char color,int CPU) {
		this.color=color;
		this.CPU=CPU;
		
	}
	//输出笔记本电脑信息的方法？
	//调用时 
	public void getInformtion(char color,int CPU) {
		System.out.println("颜色是："+color+"CPU是："+CPU);
		
	}
}
