

public class Student {
	int id;
	String stuName;
	char stuSex;
	short stuAge;
	String stuGrade;
	String stuAddress;
	String stuTel;
	String stuEmail;

	@Override
	public String toString() {
		return "Student [id=" + id + ", stuName=" + stuName + ", stuSex=" + stuSex + ", stuAge=" + stuAge
				+ ", stuGrade=" + stuGrade + ", stuAddress=" + stuAddress + ", stuTel=" + stuTel + ", stuEmail="
				+ stuEmail + "]";
	}

//	//public Student(int id, String name, char sex, short age, String grade, String address, String tel, String email) {
//		this.id = id;
//		this.stuName = name;
//		this.stuSex = sex;
//		this.stuAge = age;
//		this.stuGrade = grade;
//		this.stuAddress = address;
//		this.stuTel = tel;
//		this.stuEmail = email;
//	}

	public Student(int id, String name, char sex, short age, String grade, String address, String tel, String email) {
		this.id = id;
		this.stuName = name;
	this.stuSex = sex;
		this.stuAge = age;
		this.stuGrade = grade;
		this.stuAddress = address;
		this.stuTel = tel;
		this.stuEmail = email;
	}
}
