
public class getPoint {
	public static void main(String[] args) {
		//��PM��X������һ������
		PointMove pmx=new PointMove(5,10);
		//��PM��Y������һ������
		PointMove pmy=new PointMove(1,5);
		int getPoint=pmx.pointMove1(pmx);
		int getPoint1=pmy.pointMove2(pmy);
		System.out.println(getPoint);
		System.out.println(getPoint1);
	}
}
