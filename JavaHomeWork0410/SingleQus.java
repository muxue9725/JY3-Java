
public class SingleQus extends Qus{
	String answer;//��׼��
	public SingleQus(int ID,String content,
			String[] options,String answer) {
		this.ID=ID;
		this.content=content;
		this.options=options;
		this.answer=answer;
		
	}
	//�������ǣ����¸�����check��Ϊ
	public boolean check(String[] ans) {
		if(ans==null || ans.length!=1)
			return false;
		return this.answer.equals(ans[0]);
		
	}
}
