
public class RectangleTest extends RectangleMethod{
	public static void main(String[] args) {
		RectangleMethod r1=new RectangleMethod();
		//�����R1��һ���࣬����ķ���Ҫͨ��.����
		double a=r1.getArea(12,10,5);
		double b=r1.getPer(10,5,1);
		//ִ�������  ������Ĭ��ֵ
		System.out.println("���Ϊ"+a);
		System.out.println("�ܳ�Ϊ"+b);
		//���˾�����
		r1.getShowAll(5,10,1,1);
		
		
	}
}
//���� ���������Ǹ���
