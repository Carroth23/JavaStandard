package ch02_변수;

public class 변수_상수_리터럴 {

	public static void main(String[] args) {
		// 변수: 하나의 값을 저장하기 위한 메모리 공간(RAM)
		// 변수의 선언 이유: 값을 저장할 "공간"을 마련하기 위해
		int q = 0, w = 1; // 타입이 같으면 ,로 구분
		
		// 변수의 종류: 클래스변수, 인스턴스변수, 지역변수(지역변수는 초기화 필수)
		
		// 기본형 크기
		// 1byte: boolean, byte
		// 2byte: char, short
		// 4byte: int, float
		// 8byte: long, double
		
		// 기본형 타입은 실제 값을 저장
		// 참조형 타입은 메모리 주소를 저장
		
		int num = 100_000_000;
		System.out.println("JDK1.7부터 정수형에 _로 구분 가능" + num);
		
		String s = ""; // 빈 문자열
//		char ch = ''; //에러
		// "" + 7 + 7 = "77"
		// 7 + 7 + "" = "14"
		
		// 변수 값 바꾸기
		int x = 10;
		int y = 20;
		int tmp;
		tmp = x;
		x = y;
		y = tmp;
		System.out.println("x = " + x + ", y = " + y);
		
		// printf출력
		double d = 12.34567;
		System.out.printf("age : %3d%n", x); // 3칸
		System.out.printf("%.2s%n", "qwertyuiop"); // 2개만출력
		System.out.printf("double : %.1f%n", d);
		System.out.printf("double : %.2f%n", d); // 반올림됨
		System.out.printf("%s%n", Integer.toBinaryString(15)); // 2진 문자열
		
		// 오버플로우
		short beforeOver = 32767;
		short afterOver = (short) (beforeOver + 1);
		System.out.println("덧셈 전 over : " + beforeOver);
		System.out.println("덧셈 후 over : " + afterOver);
		
		// 문자를 숫자로 변환
		char c = '3';
		int c2 = c - '0';
		
		// 상수는 한번 값을 저장하면 다른값으로 변경 불가.(값을 변경 할 수 없는 변수)
		final int MAX_SPEED = 10; //상수는 대문자로 하고 단어의 구분은_로 한다.
		
		// 리터럴은 그 자체로 값을 의미함.
		int year = 2014; //리터럴 = 2014
		
		// 접미사
		// L과 f만 주의.
		// 실수형 float은 f, double는 b를 붙여야 하지만 타입이 두개이다보니 d는 생략 가능
	}

}
