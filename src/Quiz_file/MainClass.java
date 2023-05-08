package Quiz_file;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String stuNum, name, grade;
		int num, kor, eng, mat, index = 0, result = 0;
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
				System.out.print("");
				break;
			case 2 : 
				
				break;
			case 3 : 
				
				break;
			case 4 : 
				System.out.println("=== 종료 ===");
				System.exit(1);
			}
		}
	}
}
