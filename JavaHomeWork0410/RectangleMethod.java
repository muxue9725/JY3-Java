
public class RectangleMethod extends Rectangle{
	//声明这个类中独有的变量
	double length;
	double width;
	double Area=length*width;
	double Per=2*length+2*width;
	//在你创建类的时候，这个是默认存在的。但是你自己写了一个构造方法，这个方法就被覆盖了
	//所以你要自己手动再写一个
	
	public RectangleMethod() {}
	//这个构造方法是赋值方法，一旦你调用这个类的时候使用了这个方法，这两个的值就固定了
	//所以要用一个无参构造方法调用这个类
	public RectangleMethod(double length,double width, double Area) {
		//继承父类属性
		this.length=length;
		this.width=width;
		this.Area=Area;
		
	}
	//声明一个计算面积的方法
	public  double getArea(double length,double width,double Area) {
		Area=length*width;
		return Area;
	}
	public double getArea() {
		Area=this.length*this.width;
		return Area;
	}
	//声明一个计算周长的方法
	public double getPer(double length,double width,double Per) {
		
		Per=2*length+2*width;
		
		return Per;
	}
	public void getShowAll(double length,double width,double Area,double Per) {
		 Area=length*width;
		 Per=2*length+2*width;
		 System.out.println();
	}
	
}
