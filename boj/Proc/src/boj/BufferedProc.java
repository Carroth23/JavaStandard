package boj;
import java.io.*;

public class BufferedProc {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			int j = Integer.parseInt(br.readLine());
			for(int i = 0; i < j; i++) {
				String s = br.readLine();
				int a = Integer.parseInt(s.split(" ")[0]);
				int b = Integer.parseInt(s.split(" ")[1]);
				bw.write(a + b + "\n");
			}
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
