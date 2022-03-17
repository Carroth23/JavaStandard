package 객체지향;

public class OOP01 {

	public static void main(String[] args) {
		// OOP의 주요 특징
		// 1. 코드 재사용성이 높음, 2.코드의 관리가 용이, 3. 신뢰성 높은 프로그래밍 가능
		
		// 객체 배열
		Tv[] tvArr = new Tv[3]; // Tv들을 다루기 위한 참조변수들만 만들어짐
		tvArr[0] = new Tv(); // 실제 객체 생성
		
		// 생성자 테스트
		Tv t = new Tv("", true);
		System.out.println(t.power);
		System.out.println(t.color);
	}

}

class Tv {
	// private로 감추고 get, set으로 조작(캡슐화)
//	private String color;
	String color = "레드";
	boolean power;	// 멤버변수는 자동초기화가 됨.(지역변수는 안됨)
	int channel;	// 인스턴스 변수
	static int a;	// 클래스 변수
	
	Tv(){} // 기본생성자
	Tv(String color){ // 매개변수가 있는 생성자
		this.color = color;
	}
	
	Tv(String color, boolean power){
		this("블랙"); // 다른 생성자 호출 첫줄에서만 가능
		this.power = power;
	}
	
	public void channelUp() {
		channel++;
	}
	
	public void channelUp(int i) { // 오버로딩
		channel += i;
	}
}