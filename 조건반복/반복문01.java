package 조건반복;

public class 반복문01 {
	public static void main(String[] args) {
		// for 무한반복
//		for (;;) {
//			System.out.println("반복");
//		}

		// 기본 별
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 여러개 조건도 가능
		for (int i = 0, j = 0; i <10; i++, j*=3) {
			System.out.println("i=" + i);
			System.out.println("j=" + j);
		}

		// while
		int z = 0;
		while (true) {
			z++;
			if (z == 3)
				continue;
			if (z == 4)
				break;
			System.out.println("z : " + z);
		}

		// do-while
		do {
			System.out.println("하이");
			z++;
			if (z == 5)
				break;
		} while (true);
		
		// 이름붙은 반복
		Loop1 : for(int i = 0; i < 10; i++) {
			System.out.println("바이" + i);
			if(i == 4) {
				break Loop1;
			}
		}
	}
}
