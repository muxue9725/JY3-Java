
public class RectangleMethod extends Rectangle{
	//����������ж��еı���
	double length;
	double width;
	double Area=length*width;
	double Per=2*length+2*width;
	//���㴴�����ʱ�������Ĭ�ϴ��ڵġ��������Լ�д��һ�����췽������������ͱ�������
	//������Ҫ�Լ��ֶ���дһ��
	
	public RectangleMethod() {}
	//������췽���Ǹ�ֵ������һ�������������ʱ��ʹ���������������������ֵ�͹̶���
	//����Ҫ��һ���޲ι��췽�����������
	public RectangleMethod(double length,double width, double Area) {
		//�̳и�������
		this.length=length;
		this.width=width;
		this.Area=Area;
		
	}
	//����һ����������ķ���
	public  double getArea(double length,double width,double Area) {
		Area=length*width;
		return Area;
	}
	public double getArea() {
		Area=this.length*this.width;
		return Area;
	}
	//����һ�������ܳ��ķ���
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
