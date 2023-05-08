package Quiz;

public class MemberDTO {
	private String name, stuNum;
	private int kor, eng, mat;
	private String grade;
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	public String getStuNum() {return stuNum;}
	public void setStuNum(String stuNum) {this.stuNum = stuNum;}
	
	public int getKor() {return kor;}
	public void setKor(int kor) {this.kor = kor;}
	
	public int getEng() {return eng;}
	public void setEng(int eng) {this.eng = eng;}
	
	public int getMat() {return mat;}
	public void setMat(int mat) {this.mat = mat;}
	
	public String getGrade() {return grade;}
	public void setGrade(String grade) {this.grade = grade;}
}
