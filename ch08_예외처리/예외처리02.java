package ch08_예외처리;

public class 예외처리02 {
	public static void main(String[] args) {
		Exception e = new Exception("고의 에러ㅋ"); // 예외클래스 객체 생성(checked 예외)
//		throw new Exception("생성 후 예외발생 한줄로");

		// checked예외: 컴파일러가 예외처리 여부를 체크(익셉션과 자손)
		// unchecked예외: 컴파일러가 예외 처리여부를 체크 안함(런타임익셉션과 자손)

		try {
			System.out.println(1);
			throw e; // 예외 발생시키기
		} catch (Exception ee) {
			System.out.println(ee.getMessage());
			System.out.println(2);
		} finally { // 예외에 상관없이 수행되어야 하는작업을 적는다
			System.out.println("덤프 파일을 지웁니다.");
		}
		throw new RuntimeException(); // unchecked 예외
	}

	public void reException() throws Exception { // 예외 떠넘기기
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
			throw new SpaceException("발생");
		} catch (NullPointerException ne) {
			Exception e = new Exception("예외발생");
			e.initCause(ne); // 지정한 예외(ne)를 원인 예외로 등록
			throw e;
		} catch (SpaceException nne) {
			Exception e = new Exception("연결예외발생");
			e.initCause(nne);
			throw e;
		}
	}
	// 연결된 예외 사용 이유
	// 1.여러 예외를 하나로 묶어서 다루기 위해서
	// 2.checked예외를 unchecked예외로 변경하려 할 때

	public void proc() throws ClassCastException, ArithmeticException { // 메서드 예외선언
		// 필수처리를 선택처리로 바꾸기(initCause 안씀)
		throw new RuntimeException(new MyException("메모리 부족"));
	}

//	Exception in thread "main" java.lang.Exception
//		at Ex8_9.method2(Ex8_9.java:11)		발생	
//		at Ex8_9.method1(Ex8_9.java:7)		호출
//		at Ex8_9.main(Ex8_9.java:3)			호출
}

class MyException extends Exception { // 내가 만드는 예외
	MyException(String msg) {
		super(msg);
	}
}

class MyException2 extends RuntimeException { // 내가 만드는 런타임 예외
	MyException2(String msg) {
		super(msg);
	}
}

class SpaceException extends Exception {
	SpaceException(String msg) {
		super(msg);
	}
}
