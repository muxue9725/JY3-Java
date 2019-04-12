
public class SingleQus extends Qus{
	String answer;//标准答案
	public SingleQus(int ID,String content,
			String[] options,String answer) {
		this.ID=ID;
		this.content=content;
		this.options=options;
		this.answer=answer;
		
	}
	//方法覆盖，更新父类型check行为
	public boolean check(String[] ans) {
		if(ans==null || ans.length!=1)
			return false;
		return this.answer.equals(ans[0]);
		
	}
}
