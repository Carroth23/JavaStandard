package 입출력;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex04_BufferedIO {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader(".\\src\\입출력\\Ex04_BufferedIO.java");
		BufferedReader br = new BufferedReader(fr);
		
		String line = "";
		for(int i = 1; (line = br.readLine()) != null; i++) {
			if(line.indexOf(";") != -1) {
				System.out.println(i + ":" +line);
			}
		}
		br.close();
	}
}
