
public class RectangleTest extends RectangleMethod{
	public static void main(String[] args) {
		RectangleMethod r1=new RectangleMethod();
		//你这个R1是一个类，里面的方法要通过.操作
		double a=r1.getArea(12,10,5);
		double b=r1.getPer(10,5,1);
		//执行了这儿  覆盖了默认值
		System.out.println("面积为"+a);
		System.out.println("周长为"+b);
		//行了就这样
		r1.getShowAll(5,10,1,1);
		
		
	}
}
//这是 输出结果的那个类
