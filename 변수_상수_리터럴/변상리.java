package 변수_상수_리터럴;

public class 변상리 {

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
		System.out.printf("double : %.2f%n", d); // 반올림됨
		
		// 오버플로우
		short beforeOver = 32767;
		short afterOver = (short) (beforeOver + 1);
		System.out.println("덧셈 전 over : " + beforeOver);
		System.out.println("덧셈 후 over : " + afterOver);
		
		// 문자를 숫자로 변환
		char c = '3';
		int c2 = c - '0';
		
		//상수는 한번 값을 저장하면 다른값으로 변경 불가.
		final int MAX_SPEED = 10; //상수는 대문자로 하고 단어의 구분은_로 한다.
		
		//리터럴은 그 자체로 값을 의미함.
		int year = 2014; //리터럴 = 2014
	}

}
