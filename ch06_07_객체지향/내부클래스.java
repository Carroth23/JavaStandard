package ch06_07_객체지향;

class A {
	int i;
	private int y = 10;
	B b = new B();
	
	final static int CONST = 100; // 상수는 허용

	protected static class B { // A의 내부 클래스(내부클래스에는 접근제어자를 모두 사용 가능)
		void met() {
//			System.out.println("B메서드에서 A의 i 사용" + i); // 객체생성없이 외부클래스의 멤버 접근가능
		}
		
		static int cv = 200; // 스태틱 멤버를 가지려면 스태틱 내부클래스여야 함
	}
	
	class T {
		int qq = y; // 외부클래스 private에 접근가능
	}
	
	void methodd() {
		A.this.i = 10; // this로 외부클래스 iv 구분
		int lv = 0;			// JDK1.8부터 값이 안바뀌면 상수로 침(final)
		final int LV = 0;
//		lv = 3;		주석풀면 밑에서 에러
		class LocalInner {
			int liv = i;
			int liv2 = y;
			int liv3 = lv;	//원래는 지역변수 못쓴다. 내부클래스가 지역변수보다 더 오래 존재할 수 있기때문
			// 메서드가 있거나 쓰레드등의 이유로 더 오래 살수있음
			// 상수는 사용 가능한 이유는 constant pool? 이란곳에서 따로 관리해서 가능
		}
	}
	
	
}


public class 내부클래스 {
	public static void main(String[] args) {
		A a = new A();
		A.T t = a.new T(); // 내부클래스 객체 생성
		int s = A.B.cv;	// 스태틱 내부 클래스의 인스턴스 사용
		System.out.println(s);
	}
}