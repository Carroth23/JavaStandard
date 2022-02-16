package boj;

import java.util.Scanner;

public class StarZzic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		String star = "";
		for (int i = 1; i <= a; i++) {
			System.out.println(star += "*");
		}
	}

}
