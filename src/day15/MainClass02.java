package day15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class MainClass02 {
	public static void main(String[] args) throws Exception {
		// 파일 입력
		File path = new File("c:/test/test.txt");
		FileOutputStream fos = new FileOutputStream(path, true);
		
		fos.write(65);
		fos.write('B');
		
		fos.close();
		
		// 파일 출력
		FileInputStream fis = new FileInputStream(path);
		// read() : 하나씩가져와서 출력
		System.out.println(fis.read());
		System.out.println(fis.read());
		fis.close();
	}
}
