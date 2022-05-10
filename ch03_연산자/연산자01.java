package ch03_연산자;

public class 연산자01 {

	public static void main(String[] args) {
		// 삼항연산자
		System.out.println("삼항 연산자 : " + (3 > 5 ? true : false));
		
		// 대입연산자는 오른쪽에서 왼쪽으로
		
		// 증감연산자 전위형, 후위형
		int i = 5, j =5;
		System.out.println("전위형 : " + ++i);
		System.out.println("후위형 : " + j++ + ", 후위 후 j : " + j);
		// 증감연산자는 일반 산술 변환에 의한 자동 형변환이 발생하지 않으며 연산 결과의 타입은 피연산자의 타입과 일치함
		
		// 형변환 연산자
		double d = 85.4;
		int score = (int) d;
		System.out.println("형변환된 score : " + score + " , d : " + d);
		
		byte b = (byte)1000; // 형변환 명시 필수
		System.out.println("값손실된 b : " + b);
		
		// 자동 형변환
		int a = 10;
		int c = 4;
		System.out.printf("%d / %d = %d%n", a, c, a / c);
		System.out.printf("%d / %d = %f%n", a, c, (float)a / c);
		
		// 산술변환
		// 이항 연산자는 두 피연산자의 타입이 일치해야 하므로 형변환 연산자로 (큰쪽으로)타입을 일치시킨 후 연산.
		// long + int -> long + long = long
		// float + in -> float + float = float
		// 피연산자의 타입이 int보다 작은 타입이면 int로 변환
		// byte + short -> int + int = int
		// char + short -> int + int = int
		int aa = 1_000_000;
		int bb = 2_000_000;
		long cc = (long)aa * bb; // int * int = int이기 때문에 오버플로우 발생(형변환 사용)
		
		// Math.round()
		float pi = 3.141592f;
		System.out.println("소수점 셋째자리 반올림된 s : " + Math.round((pi * 1000)) / 1000.0);
		
		// 나머지 연산자 %
		System.out.println("부호는 무시된다 " + -10 % 8);
		
		// 비교 (기본형은 값비교, 참조형은 객체의 주소값을 비교)
		String str1 = "하이";
		String str2 = "하이";
		String str3 = new String("하이");
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str3));
		
		// 논리 연산지 && ||
		// ||(OR)
		// &&(AND)
		// &&가 ||보다 우선순위가 높다. ()로 순서정해야함
		// 문자 ch는 숫자('0' ~ '9')이다.
		// '0' <= ch && ch <= '9' (유니코드로 변환되어 계산.)
		
		// 숏컷연산
		int z = 10;
		int y = 20;
		System.out.println((++z == 11 || ++y == 30) + "z : " + z + ", y : " + y);
		
		// 논리 부정 연산자 !
		boolean g = true;
		boolean g1 = !g; // false
		boolean g2 = !!g; // true
		System.out.println("g1 = " + g1 + ", g2 = " + g2);
		
		// 복합 대입 연산자
		// i = i + 3; -> i += 3;
		// i = i * (10 + j); -> i *= 10 + j;
	}

}
