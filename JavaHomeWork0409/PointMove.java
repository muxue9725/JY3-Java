
public class PointMove extends Pointclass{
	//PointMove��ΪPoin2tclass�������
		public PointMove(int x ,int y) {
			this.x=x;
			this.y=y;
		}
	
	//�����ƶ�����
	// ���巵��ֵ���� ������ �������ö���
	public   int pointMove1(Pointclass p1){
		//����class Point�еĹ���������������ݣ����ԣ�
		int x2=p1.x+5;
		
		
		return x2;
		
		}
	//���� ��֪��զ������X Y�ĸı�дһ��Ȼ�󰴵��������ʽ���
	public int pointMove2(Pointclass p1) {
		int y2=p1.y+5;
		return y2;
	}
}
