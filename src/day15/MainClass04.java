package day15;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class MainClass04 {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("c:/test/test.txt");
		// 보조 스트림
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		for(char i = 'A'; i<='D'; i++) {
			Thread.sleep(2000);
			//fos.write(i);
			bos.write(i);
		}
		bos.flush(); // flush() : 해당보조스트림의 값을 모두 비움
		bos.write("안녕하세요".getBytes()); // flush()다음으로 write() 가능
		bos.close(); 
		//bos.write("안녕하세요".getBytes()); // close()다음으로 write() 불가능
		fos.close();
	}
}
