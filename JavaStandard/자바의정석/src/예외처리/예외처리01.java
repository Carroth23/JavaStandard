package 예외처리;

public class 예외처리01 {

	public static void main(String[] args) {
		// 컴파일 에러, 런타임 에러, 논리적 에러
		// Exception - 빨간줄 
		// RuntimeException - 실행하다 발생
		
		System.out.println("1");
		try {
			System.out.println("2");
			System.out.println(0 / 0); // 0으로 나눠 에러발생 catch로 점프
			System.out.println("3"); // 실행되지않음
		} catch (ArithmeticException e) {
//		} catch (ArithmeticException | Exception e) { 멀티catch가 조상과 자손관계면 컴파일 에러
			System.out.println("4"); // 실행
			e.printStackTrace(); // 예외발생 당시 호출스택에 있던 메서드 정보와 예외메세지
			e.getMessage();
		}
		System.out.println("5");
	}

}
