package Quiz;

import java.util.ArrayList;

public class MemberService {
	private ArrayList<MemberDTO> list = new ArrayList<>();
	
	public ArrayList<MemberDTO> getList() {
		if(list.size()==0) { return null; }
		return list;
	}
	
	public String setGrade(int k, int e, int m) {
		int ave = (k + e + m) / 3;
		String grade = null;
		if(ave>=90) { grade = "A"; }
		else if(ave>=80) { grade = "B"; }
		else if(ave>=70) { grade = "C"; }
		else { grade = "F"; }
		return grade;
	}
	
	public void inputList(MemberDTO dto) {
		String grade = setGrade(dto.getKor(), dto.getEng(), dto.getMat());
		dto.setGrade(grade);
		list.add(dto);
	}
	
	public int checkStuNum(String stuNum) {
		if(list.size()!=0) {
			for(int i = 0; i<list.size(); i++) {
				if(stuNum.equals(list.get(i).getStuNum())) {
					return i;
				}
			}
		} return -1;
	}
	
	public MemberDTO getMemberDTO(int index) {
		 return list.get(index);
	}
}
