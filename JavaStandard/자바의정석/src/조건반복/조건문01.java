package 조건반복;

public class 조건문01 {
	public static void main(String[] args) {
		if(10 > 11 ? false : true) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		int x = 10;
		double d = 10.0;
		switch (x) { // 정수, 상수, 문자열만 가능
		case 7:
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
	}
}
