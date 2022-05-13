package ch09_10_유용한클래스_날짜;

public class Math_Wrapper01 {

	public static void main(String[] args) {
		// Math 수학관련 static메서드의 집합
		double d = 10.32423;
		double c = -10.32423;
		System.out.println(Math.abs(c)); // 절대값
		System.out.println(Math.ceil(d)); // 올림
		System.out.println(Math.floor(d)); // 버림
		System.out.println(Math.max(10, 20)); // 큰수
		System.out.println(Math.min(10, 20)); // 작은수
		System.out.println(Math.round(d)); // 반올림(long 반환)
		System.out.println("반올림Math.round() " + Math.round(12.56));
		System.out.println("짝수일때만 올림?Math.rint() " + Math.rint(12.56));
		System.out.println("올림Math.ceil() " + Math.ceil(12.56));
		System.out.println("버림Math.floor() " + Math.floor(12.56));
		System.out.println("둘중에 큰수Math.max() " + Math.max(10, 20));
		System.out.println("둘중에 작은수Math.min() " + Math.min(10, 20));
		System.out.println("랜덤Math.random() " + Math.random());

		// Number클래스: 모든 숫자 래퍼클래스의 조상
		// Wrapper클래스: 8개의 기본형을 객체로 다뤄야할 때 사용하는 클래스
		// 자바에서 기본형이라는 객체지향에 반하는 예외를 둔 이유: 성능때문
		
		// 래퍼를 기본형으로 변경
		int i = new Integer(10).intValue();
		int q = Integer.parseInt("100");
		Integer q2 = Integer.valueOf("100");
		System.out.println(q + q2); // 오토박싱 & 언박싱
		// 기본형 -> 래퍼클래스 : 오토박싱
		// 래퍼클래스 -> 기본형 : 언박싱
	}

}
