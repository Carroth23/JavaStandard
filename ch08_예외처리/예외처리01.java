package ch08_예외처리;

public class 예외처리01 {

	public static void main(String[] args) {
		// 컴파일 에러: javac.exe가 잡아낼 수 있는 에러
		// 런타임 에러: 실행중 발생하는 에러
		// 논리적 에러: 작성 의도와 다르게 동작
		// Exception - 빨간줄
		// RuntimeException - 실행하다 발생

		// 에러: 심각한 오류(코드에 의해 수습될 수 없음)
		// 예외: 다소 미약한 오류(코드에 의해 수습 가능)
		
		// 런타임에러
		// Error: 심각한 에러
		// Exception클래스들: 사용자의 실수와 같은 외적 요인에 의해 발생하는 예외(IO, ClassNotFound..)
		// RuntimeException클래스들: 프로그래머의 실수로 발생하는 예외(Arithmetic, ClassCast, NullPointer..)
		
		// 예외가 발생하면 예외 객체가 만들어진다. catch가 결국 if(instanceof)문인듯?
		// printStackTrace() 예외 발생시 호출스택에 있었던 메서드의 정보와 예외 메시지를 출력
		// getMessage() 발생한 예외클래스의 인스턴스에 저장된 메시지를 얻을 수 있다.
		
		System.out.println("1");
		try {
			System.out.println("2");
			System.out.println(0 / 0); // 0으로 나눠 에러발생 catch로 점프
			System.out.println("3"); // 실행되지않음
		} catch (ArithmeticException e) {
//		} catch (ArithmeticException | Exception e) { 멀티catch가 조상과 자손관계면 컴파일 에러
			// 멀티catch사용때는 두 클래스의 공통멤버만 실행가능
			System.out.println("4"); // 실행
			e.printStackTrace(); // 예외발생 당시 호출스택에 있던 메서드 정보와 예외메세지
			e.getMessage();
		}
		System.out.println("5");
	}

}
