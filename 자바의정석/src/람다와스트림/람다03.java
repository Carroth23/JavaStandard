package 람다와스트림;

@FunctionalInterface // 함수형 인터페이스어노테이션
interface MyFunction3{
	void run(); // public abstract void run();
}
// 람다식 별로 안편한데?
public class 람다03 {
	static void execute3(MyFunction3 f) { // 매개변수 타입이 MyFunction3인 메서드
		f.run();
	}
	
	static MyFunction3 getMyFunction3() { //반환타입이 MyFunction3인 메서드
//		MyFunction3 f = () -> System.out.println("f3.run()");
//		return f;
		return () -> System.out.println("f3.run()");
	}
	
	public static void main(String[] args) {
		// 람다식으로 MyFunction3의 run()을 구현 (매개변수와 반환타입이 일치해야함)
		MyFunction3 f1 = () -> System.out.println("f1.run()"); // 결국 인터페이스를 구현한 객체네
		
		MyFunction3 f2 = new MyFunction3() { // 익명클래스로 run()을 구현
			public void run() { // public
				System.out.println("f2.run()");
			}
		};
		
		MyFunction3 f3 = getMyFunction3();
		
		f1.run();
		f2.run();
		f3.run();
		
		execute3(f1);
		execute3(() -> System.out.println("run()"));
	}
}
