package 람다와스트림;

public class 람다01 {

	public static void main(String[] args) {
		// 함수 = 클래스에 독립적, 메서드 = 클래스에 종속적
		// 람다식 = 메서드를 하나의 식으로 표현한것. (반환타입과 메서드이름을 지우는게 기본인 느낌)
		// 자바에서 람다식은 익명함수? No, 익명 객체임.
	}

//	이 메서드를
	int max2(int a, int b) {
		return a > b ? a : b;
	}
/*
 * 람다식으로 표현하면
 * (int a, int b) -> {return a > b ? a : b;} 이렇게 된다.
 * 
 * 반환값이 있을 경우 return삭제가능 ;을 붙이지 않는다.
 * (int a, int b) -> a > b ? a : b
 * 
 * 매개변수 타입의 추론이 가능하면 생략가능.(대부분 생략가능)
 * (a, b) -> a > b ? a : b
 * 
 * 매개변수가 하나인 경우 ()괄호 생략가능
 * a -> a * a
 * 
 * {}블록안의 문장이 하나일 경우 {}생략가능 ;도 함꼐생략
 * (i) -> System.out.println(i)
 * 
 * 매개변수가 없을땐 빈괄호 사용
 * () -> (int)(Math.random() * 6)
 */
	
}
