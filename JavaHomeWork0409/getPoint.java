
public class getPoint {
	public static void main(String[] args) {
		//给PM的X作用了一个方法
		PointMove pmx=new PointMove(5,10);
		//给PM的Y作用了一个方法
		PointMove pmy=new PointMove(1,5);
		int getPoint=pmx.pointMove1(pmx);
		int getPoint1=pmy.pointMove2(pmy);
		System.out.println(getPoint);
		System.out.println(getPoint1);
	}
}
