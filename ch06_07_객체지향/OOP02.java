package ch06_07_객체지향;

public class OOP02 {

	public static void main(String[] args) {
		// 상속: 기존의 클래스로 새로운 클래스를 작성하는 것.(코드의 재사용) 부모와 자식관계
		// 자손은 조상의 모든 멤버를 상속받음(생성자, 초기화블럭 제외)
		// 자손의 변경은 조상에 영향을 미치지 않음
		// JAVA는 단일상속만을 허용함(이름같은 메서드가 부모들한테 있으면 충돌남)
		// ~은 ~이다(is-a)
		
		// 포함: 클래스의 멤버로 참조변수를 선언하는 것
		// 작은 단위의 클래스를 만들고, 이 들을 조합해서 클래스를 만듬
		// ~은 ~을 가지고 있다(has-a)
		
		// Object클래스 - 모든 클래스의 조상. 조상이 없는 클래스는 자동으로 Object클래스를 상속받음
		
		// 오버라이딩: 조상의 메서드를 자신에 맞게 변경하는 것(선언부 변경불가 내용만 변경가능)
		// 오버라이딩의 조건 1.선언부가 조상 클래스의 메서드와 일치
		// 오버라이딩의 조건 2.접근제어자를 조상클래스 메서드보다 좁은범위로 변경 불가
		// 오버라이딩의 조건 3.예외는 조상 클래스의 메서드보다 많이 선언할 수 없다.
		
		// 참조변수 super: 객체 자신을 가리키는 참조변수.(인스턴스 메서드내에만 존재)
		// 조상의 멤버를 자신의 멤버와 구별할 때 사용
		
		// super(): 조상의 생성자.
		// 생성자의 첫 줄에 반드시 생성자를 호출해야한다.☆
		// 그렇지 않으면 컴파일러가 생성자의 첫 줄에 super();를 삽입(이거때문에 기본생성자 필수)
		
		// static import문: static멤버를 사용할 때 클래스 이름을 생략할 수 있게해줌
		
		// 접근 제어자 사용이유 1.외부로부터 데이터 보호, 2.내부적으로만 사용되는 부분을 감춤
		// public 접근 제한 없음
		// protected 같은 패키지 내에서, 다른패키지의 자손클래스에서 접근가능
		// default 같은 패키지 내에서만
		// private 같은 클래스 내에서만
		// 접근제어자 범위는 되도록 좁히는게 좋음
		
		// 그 외 제어자
		// static: 클래스의, 공통적인(멤버변수, 메서드에 적용가능[클래스에도 되지않나?])
		// abstract: 추상의, 미완성의(클래스, 메서드에 적용가능)
		// final: 마지막의, 변경될 수 없는
		final class FinalTest{			// 조상이 될 수 없는 클래스(부모 못됨)
			final int MAX_SIZE = 10;	// 값을 변경할 수 없는 멤버변수(상수)
			
			final void getMaxSize() {	// 오버라이딩할 수 없는 메서드(변경불가)
				final int LV = MAX_SIZE;// 값을 변경할 수 없는 지역변수(상수)
			}
		}
		
		// 다형성: 조상타입 참조 변수로 자손 타입 객체를 다루는 것
		// 참조변수의 형변환: 사용할 수 있는 멤버의 갯수를 조절하는 것
		// 자손타입으로 조상가르키면 컴파일되지만 런타임 에러남
		
		// 추상클래스: 미완성 설계도. abstract메서드(미완성메서드)를 갖고있는 클래스
		
		// 인터페이스: 추상메서드의 집합 (구현된게 아무것도 없음, 모든 멤버가 public), 두 대상(객체)간의 중간역할
		// 인터페이스의 조상은 인터페이스만 가능(extends 사용)
		// 다중 상속 가능(추상메서드니까 충돌해도 문제없음)
		// implements키워드를 사용하여 내려받아 몸통을 만듬.(구현)
		// 장점 1.개발시간 단축 2.변경에 유리한 설계가능 3.표준화 가능 4.관계없는 클래스들을 관계를 맺어줄 수 있음
		// 새로운 메서드 추가시에 파장을 줄이기 위해 default메서드(몸통이 있는 메서드) 추가
		
		// 내부클래스
		
		// 익명 클래스: 이름이 없는 일회용 클래스. 정의와 생성을 동시에
		// new 조상클래스이름(){}, 혹은 new 구현인터페이스이름() {}
		
		SmartTv t = new SmartTv();
		System.out.println(t.power);
		t.channelUp();
		System.out.println(t.color);
		
		if(t instanceof Tv) {
			System.out.println("형변환 가능");
		}
		
		tmp(t);
		
		AAA s = new AAA();
		AAA.QQQ ss = s.new QQQ(); // 내부클래스 만들기
		ss.ttt();
		
		// 익명클래스?
		System.out.println(new Tv() {
			void repair() {}
		});
	}
	
	public static void tmp(Tv t) {
		t.channelUp();
	}
}

class SmartTv extends Tv { // 상속, 상속은 단일상속만 가능
	String color;
	
	public void channelUp() { // 오버라이딩 (접근제어자, 예외를 조장보다 좁거나 많게 불가)
		channel++;
		System.out.println(super.color); // 조상의 멤버 참조
		this.color = "옐로우";  // 자신의 멤버
	}
	
	public void channelDown() {
		channel--;
	}
}

// 인터페이스 기본
interface Proc{
	int X = 10;	 // public static final int X = 10;
	void porc(); // public abstract void proc();
	default void prro() {}; // 구현 안해도 되는 메서드
	static void proos() {};
}

// 내부클래스
class AAA{
	private int i = 100;
	BBB b = new BBB();
	
	private class BBB{ // 멤버처럼 접근제어자 사용가능
		int qq = 10;
//		static int ww = 10; static클래스만 static멤버를 가질 수 있다.
		final static int ww = 10; // static 상수는 가능
		void proc2() {
			System.out.println(i); // 바로 접근 가능
		}
	}
	
	static class CCC{
		int dd = 10;
		static int cc = 10;
	}
	
	class QQQ{
		public void ttt() {System.out.println("하이");}
	}
}

