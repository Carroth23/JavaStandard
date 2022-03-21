package 입출력;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class 입출력01 {

	public static void main(String[] args) throws IOException {
		// 입출력(I/O) : Input / Output
		// 입출력에서의 스트림 : 데이터를 운반하는데 사용되는 연결통로.(단방향통신만 가능 FIFO구조)
		// Byte기반 스트림 
		// FileInputStream, ByteArrayInputStream, AudioOutputStream...
		
		// 보조 스트림 : 기본스트림의 성능을 향상시키거나 기능을 추가할 수 있다.
		FileInputStream fis = new FileInputStream("test.txt"); // 기반 스트림 생성
		BufferedInputStream bis = new BufferedInputStream(fis); // 기반스트림을 이용, 보조스트림 생성
		bis.read(); // 데이터 읽기
		
		// 문자 기반 스트림 : Reader, Writer
		// FileReader, FileWriter, CharArrayReader... 바이트기반에서 이름만 Reader로 바꾸면 됨
		// 문자 기반 보조스트림 : BufferedReader, FilterReader...
		
	}

}
