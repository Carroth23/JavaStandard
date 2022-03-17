package 객체지향;

public class OOP02 {

	public static void main(String[] args) {
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

