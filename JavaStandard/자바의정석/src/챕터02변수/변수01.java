package 챕터02변수;

public class 변수01 {

	public static void main(String[] args) {
		// 기본형 크기
		// 1byte: boolean, byte
		// 2byte: char, short
		// 4byte: int, float
		// 8byte: long, double
		
		int num = 100_000_000;
		System.out.println("JDK1.7부터 정수형에 _로 구분 가능" + num);
		
		// 변수 값 바꾸기
		int x = 10;
		int y = 20;
		int tmp;
		tmp = x;
		x = y;
		y = x;
		System.out.println("x = " + x + ", y = " + y);
		
		// printf출력
		double d = 12.34567;
		System.out.printf("age : %d%n", x);
		System.out.printf("double : %.1f%n", d);
		System.out.printf("double : %.2f", d); // 반올림됨.
		
		// 오버플로우
		short beforeOver = 32767;
		short afterOver = (short) (beforeOver + 1);
		System.out.println("덧셈 전 over : " + beforeOver);
		System.out.println("덧셈 후 over : " + afterOver);
		
		// 문자를 숫자로 변환
		char c = '3';
		int c2 = c - '0';
	}

}
