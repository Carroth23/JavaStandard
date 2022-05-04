package 연산자;

public class 연산자01 {

	public static void main(String[] args) {
		// 삼항연산자
		System.out.println("삼항 연산자 : " + (3 > 5 ? true : false));
		
		// 전위형, 후위형
		int i = 5, j =5;
		System.out.println("전위형 : " + ++i);
		System.out.println("후위형 : " + j++ + ", 후위 후 j : " + j);
		
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
		// 이항 연산자는 두 피연산자의 타입이 일치해야 하므로 형변환 연산자로 타입을 일치시킨 후 연산.
		// long + int -> long + long = long
		// float + in -> float + float = float
		// 피연산자의 타입이 int보다 작은 타입이면 int로 변환
		// byte + short -> int + int = int
		// char + short -> int + int = int
		
		// Math.round()
		float pi = 3.141592f;
		System.out.println("소수점 셋째자리 반올림된 s : " + Math.round((pi * 1000)) / 1000.0);
		
		// 나머지 연산자 %
		System.out.println("부호는 무시된다 " + -10 % 8);
		
		// 비교 (기본형은 값비교)
		String str1 = "하이";
		String str2 = "하이";
		String str3 = new String("하이");
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str3));
		
		// 숏컷연산
		int z = 10;
		int y = 20;
		System.out.println((++z == 11 || ++y == 30) + "z : " + z + ", y : " + y);
	}

}
