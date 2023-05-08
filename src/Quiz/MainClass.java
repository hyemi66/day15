package Quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MemberService ms = new MemberService();
		MemberDTO dto = null;
		String name,stuNum;
		int num;
		int kor, eng, mat, index=0, result=0;
		double ave;
		String grade;
		while(true) {
			System.out.println("1. 학생등록");
			System.out.println("2. 학생검색");
			System.out.println("3. 모든학생보기");
			System.out.println("4. 종료");
			System.out.print(">>> ");
			num = sc.nextInt();
			switch(num) {
			case 1 : 
				System.out.println("=== 학생등록 ===");
				while (true) {
					System.out.print("학번 : ");
					stuNum = sc.next();
					result = ms.checkStuNum(stuNum);
					if(result==-1) {
						break;
					}
					System.out.println("존재하는 학번입니다 다시 입력해주세요");
				}
				System.out.print("이름 : ");
				name = sc.next();
				System.out.print("국어 : ");
				kor = sc.nextInt();
				System.out.print("영어 : ");
				eng = sc.nextInt();
				System.out.print("수학 : ");
				mat = sc.nextInt();
				dto = new MemberDTO();
				dto.setStuNum(stuNum); dto.setName(name);
				dto.setKor(kor); dto.setEng(eng); dto.setMat(mat);
				ms.inputList(dto);
				System.out.println("등록완료");
				break;
			case 2 : 
				System.out.println("=== 학생검색 ===");
				System.out.print("학번 : ");
				stuNum = sc.next();
				result = ms.checkStuNum(stuNum);
				if(result==-1) { System.out.println("없는 학번입니다"); }
				else {
					MemberDTO d = ms.getMemberDTO(result);
					System.out.println("=== 학생정보 ===");
					System.out.println("학번 : " + d.getStuNum());
					System.out.println("이름 : " + d.getName());
					System.out.println("국어 : " + d.getKor() + "점");
					System.out.println("영어 : " + d.getEng() + "점");
					System.out.println("수학 : " + d.getMat() + "점");
					System.out.println("등급 : " + d.getGrade() + "등급");
				}
				break;
			case 3 : 
				ArrayList<MemberDTO> list = ms.getList();
				if(list != null) {
					for(MemberDTO dd : list) {
						System.out.println("학번 : " + dd.getStuNum());
						System.out.println("이름 : " + dd.getName());
						System.out.println("국어 : " + dd.getKor() + "점");
						System.out.println("영어 : " + dd.getEng() + "점");
						System.out.println("수학 : " + dd.getMat() + "점");
						System.out.println("등급 : " + dd.getGrade() + "등급");
						System.out.println("=========");
					}
				} else { System.out.println("등록먼저해주세요"); }
				break;
			case 4 : 
				System.out.println("=== 종료 ===");
				System.exit(1);
			}
		}
	}
}
