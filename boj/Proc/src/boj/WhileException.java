package boj;

import java.util.Scanner;

public class WhileException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			while (true) { // hasNextInt()라는것도 있나봄
				int a = sc.nextInt();
				int b = sc.nextInt();
				System.out.println(a + b);
			}
		} catch (Exception e) {

		}
	}
}
