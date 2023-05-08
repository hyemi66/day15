package day15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MainClass03 {
	public static void main(String[] args) throws Exception {
		File path = new File("C:/test/test.txt");
		FileInputStream fis = new FileInputStream(path);
		while(true) {
			int ch = fis.read();
			if(ch == -1) { // 문자열의 끝에는 자동으로 -1이 저장됨
				System.out.println("ch : " + ch);
				break;
			}
			System.out.println((char)ch); // int로 받아오니 마지막에 형변환
		}
	}
}
