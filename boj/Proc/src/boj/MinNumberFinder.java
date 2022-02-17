package boj;

import java.io.IOException;
import java.util.Scanner;

public class MinNumberFinder {
	public static void main(String[] args) throws IOException {
//		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			String beforeSplit = br.readLine();
//			int n = Integer.parseInt(st.nextToken());
//			int x = Integer.parseInt(st.nextToken());
//			for(int i = 0; i < n; i++) {
//				if((Integer.parseInt(beforeSplit.split(" ")[i]) < x)) {
//					bw.write(Integer.parseInt(beforeSplit.split(" ")[i]) + " ");
//				}
//			}
//			bw.flush();
//		} 시간초과뜨네
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] < x) {
				System.out.print(arr[i] + " ");
			}
		}
		sc.close();
	}
}
