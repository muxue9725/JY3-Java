
public class PointMove extends Pointclass{
	//PointMove类为Poin2tclass类的子类
		public PointMove(int x ,int y) {
			this.x=x;
			this.y=y;
		}
	
	//创建移动方法
	// 定义返回值类型 方法名 （＋作用对象）
	public   int pointMove1(Pointclass p1){
		//引用class Point中的构造器定义出的数据（属性）
		int x2=p1.x+5;
		
		
		return x2;
		
		}
	//问题 不知道咋把两个X Y的改变写一起然后按点坐标的形式输出
	public int pointMove2(Pointclass p1) {
		int y2=p1.y+5;
		return y2;
	}
}
