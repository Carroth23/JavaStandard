package ch04_조건반복;

public class 조건문01 {
	public static void main(String[] args) {
		if(10 > 11 ? false : true) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		// else블럭은 되도록 사용 안하는 방향으로 리팩토링
		
		int x = 10;
		double d = 10.0;
		switch (x) { // 조건식 결과는 정수 또는 문자열만 가능
		case 7:// 정수, 상수(변수 안됨), 문자열만 가능
		case 8:
			System.out.println("x는 8입니다.");
			break;
		case 9:
			System.out.println("x는 9입니다.");
			break;
		case 11:
			System.out.println("x는 11입니다.");
			break;
		default:
			System.out.println("x는 10입니다.");
		}
		
		// 0.0 <= Math.random() < 1.0
		// 1~10 임의의 정수
		System.out.println((int) (Math.random() * 10) + 1);
	}
}
