package 입출력;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex02_BufferedIO {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("123.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		for(int i = '1'; i < '9'; i++) {
			bos.write(i);
		}
		
		bos.close(); // fos도 close해줌
	}

}
