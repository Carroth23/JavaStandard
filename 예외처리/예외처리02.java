package 예외처리;

public class 예외처리02 {
	public static void main(String[] args) {
		Exception e = new Exception("고의 에러ㅋ"); // 예외클래스 객체 생성(checked 예외)
		try {
			System.out.println(1);
			throw e;
		} catch (Exception ee) {
			System.out.println(ee.getMessage());
			System.out.println(2);
		} finally { // 예외에 상관없이 수행되어야 하는작업을 적는다
			System.out.println("덤프 파일을 지웁니다.");
		}
		throw new RuntimeException(); // unchecked 예외
	}
	
	public void reException() throws Exception {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("절반 처리");
			throw e; // 다시 던지기
		}
	}
	
	// 연결된 예외
	public void chainedException() throws Exception {
		try {
			System.out.println("SpaceException 발생");
		} catch (NullPointerException ne) {
			Exception e = new Exception("예외발생");
			e.initCause(ne);
			throw e;
		}
	}
	
	public void proc () throws ClassCastException, ArithmeticException{ // 메서드 예외선언()
		
	}
	
//	Exception in thread "main" java.lang.Exception
//		at Ex8_9.method2(Ex8_9.java:11)		발생	
//		at Ex8_9.method1(Ex8_9.java:7)		호출
//		at Ex8_9.main(Ex8_9.java:3)			호출
}

class MyException extends Exception { // 내가 만드는 예외
	MyException(String msg){
		super(msg);
	}
}
