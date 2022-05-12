package ch06_07_객체지향;

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
		
		// 기본형 매개변수: 변수의 값은 읽기만 가능
		// 참조형 매개변수: 변수의 값을 읽고 변경 할 수 있음
		// 참조형 반환타입: 객체의 주소를 반환
		
		// 인스턴스 멤버(iv)를 사용하지 않는 메서드에 static을 붙인다.
		
		// 오버로딩: 한 클래스 안에 같은 이름의 메서드 여러 개 정의하는 것(매개변수 타입이나 갯수로 구분)
		// 매개변수는 다르지만 같은 의미릐 기능 수행할때 오버로딩하는게 좋음
		
		// 생성자: 인스턴스가 생성될 때마다 호출되는 '인스턴스 초기화 메서드'
		// 1.이름이 클래스 이름과 같아야 함,
		// 2.리턴값이 없다.(void 안붙임)
		// 3.모든 클래스는 반드시 생성자를 가져야 한다.
		// 생성자가 하나도 없을때만 컴파일러가 기본생성자 자동추가
		
		// 생성자 this(): 같은 클래스안에 생성자에서 다른 생성자 호출할 때 사용(첫줄에서만 가능)
		// 참조변수 this: 인스턴스 자신을 가리키는 참조변수(인스턴스 메서드에서 사용가능). 인스턴스의 주소가 저장되어 있음
		// 참조변수 this: 모든 인스턴스메서드에 지역변수로 숨겨진 채로 존재함(static메서드에선 사용불가)
		
		// 지역변수는 사용하기 전에 수동초기화 해야함.
		// 멤버변수는 자동초기화 됨.
		// 지역변수는 생명주기가 짧아서 자동초기화시키면 성능이 떨어짐. 그래서 전에쓰던 값을 덮어씌우는데 이게 뭔지모름 
		
		// 초기화 순서:cv -> iv
		// 자동(0, null..) -> 간단(=명시적) -> 복잡(블럭, 생성자)
		
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