package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			String a = br.readLine();
			String b = a.split(" ")[0];
			String c = a.split(" ")[1];
			String bTmp = "" + b.charAt(2) + b.charAt(1) + b.charAt(0);
			String cTmp = "" + c.charAt(2) + c.charAt(1) + c.charAt(0);
			if(Integer.parseInt(bTmp) > Integer.parseInt(cTmp)) {
				bw.write(bTmp);
			} else {
				bw.write(cTmp);
			}
			bw.flush();
		}
	}
}
