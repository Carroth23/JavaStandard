package boj;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.nextLine());
		String b = sc.nextLine();
		int c = 0;
		for (int i = 0; i < a; i++) {
			c += Integer.parseInt(b.substring(i, i+1));
		}
		System.out.println(c);
		
		}
	}
