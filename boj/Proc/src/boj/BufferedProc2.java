package boj;

import java.io.*;

public class BufferedProc2 {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
			int s = Integer.parseInt(br.readLine());
			for(int i = 1; i <= s; i++) {
				String beforeS = br.readLine();
				int a = Integer.parseInt(beforeS.split(" ")[0]);
				int b = Integer.parseInt(beforeS.split(" ")[1]);
				bw.write("Case #" + i + ": " + (a + b));
				bw.newLine();
			}
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
