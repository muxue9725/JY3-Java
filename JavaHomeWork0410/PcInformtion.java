
public class PcInformtion extends NotePc{
	//�޲η���
	public PcInformtion() {
		
	}
	//�вη���
	public PcInformtion(char color,int CPU) {
		this.color=color;
		this.CPU=CPU;
		
	}
	//����ʼǱ�������Ϣ�ķ�����
	//����ʱ 
	public void getInformtion(char color,int CPU) {
		System.out.println("��ɫ�ǣ�"+color+"CPU�ǣ�"+CPU);
		
	}
}
