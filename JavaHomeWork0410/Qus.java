
public class Qus {
	int ID;
	String content;
	//ѡ��������д
	String[] options= {};
	
	//���𰸷���
	public boolean CheckQus(String[] ans) {
		return false;
	}
	//��ӡ��Ŀ����
	public void Print() {
		//���ûɶ�� û��MAIN������ӡ������
		System.out.println("���:"+ID+",��Ŀ:"+content);
		//for��ǿѭ��
		for(String str:options) {
			
			System.out.println("/t"+str);
			
		}
		
	}
}
