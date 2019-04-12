
public class Qus {
	int ID;
	String content;
	//选项用数组写
	String[] options= {};
	
	//检查答案方法
	public boolean CheckQus(String[] ans) {
		return false;
	}
	//打印题目方法
	public void Print() {
		//这句没啥用 没有MAIN方法打印不出来
		System.out.println("题号:"+ID+",题目:"+content);
		//for增强循环
		for(String str:options) {
			
			System.out.println("/t"+str);
			
		}
		
	}
}
