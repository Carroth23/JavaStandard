package ch06_객체지향;

public class OOP01 {
	public static void main(String[] args) {
		// OOP의 주요 특징
		// 1. 코드 재사용성이 높음
		// 2. 코드의 관리가 용이
		// 3. 신뢰성 높은 프로그래밍 가능
		
		// OOP의 4대 핵심개녕
		// 캡슐화, 상속, 추상화, 다형성
		
		// 클래스 -> 설계도
		// 객체(인스턴스) -> 제품
		
		// 한개의 클래스파일에는 public class가 두개이상 존재불가
		
		// 객체의 생성
		Tv tv; // Tv클래스 타입의 참조변수 tv선언
		tv = new Tv(); // Tv인스턴스를 생성한 후, 생성된 Tv인스턴스의 주소를 tv에 저장
		
		// 객체의 사용
		tv.channel = 7; // Tv인스턴스의 멤버변수 channel의 값을 7로 한다.
		tv.channelDown1(); // Tv인스턴스의 메서드 channelDown()을 호출
		
		// 객체 배열(참조변수 배열)
		Tv[] tvArr = new Tv[3]; // Tv들을 다루기 위한 참조변수들만 만들어짐
		tvArr[0] = new Tv(); // 실제 객체 생성
		
		// 클래스의 발전과정
		// 변수 -> 배열 -> 구조체 -> 클래스
		
		// 클래스영역에선 선언문만 가능 y=1+10; 이런거 불가
		
		// static은 클래스가 메모리에 올라갈때 생성됨(Hdd에서 Ram으로 올라가는. 그래서 실행시점에 생성)
		Tv.channelDown1(); // static 사용
		
		// 메서드는 하나의 기능만 담당하도록 구현
		// return: 실행중인 메서드를 종료하고 호출한 곳으로 되돌아감
		// 리턴타입이 void여도 return은 있는데 컴파일러가 자동추가해줘서 생략가능
		
		// 생성자 테스트
		Tv t = new Tv("", true);
		System.out.println(t.power);
		System.out.println(t.color);
	}

}

class Tv {
	// private으로 감추고 get, set으로 조작(캡슐화)
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
	
	static void channelDown1() {}
}