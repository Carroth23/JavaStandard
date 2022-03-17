package 유용한클래스;

public class JavaLang03 {

	public static void main(String[] args) {
		// Math
		double d = 10.32423;
		double c = -10.32423;
		System.out.println(Math.abs(c));		// 절대값
		System.out.println(Math.ceil(d));		// 올림
		System.out.println(Math.floor(d));		// 버림
		System.out.println(Math.max(10, 20));	// 큰수
		System.out.println(Math.min(10, 20));	// 작은수
		System.out.println(Math.round(d));		// 반올림(long 반환)
		
		// 기본형
		int q = Integer.parseInt("100");
		// wrapper클래스
		Integer q2 = Integer.valueOf("100");
		System.out.println(q + q2); // 오토박싱 & 언박싱
		// 기본형 -> 래퍼클래스 : 오토박싱
		// 래퍼클래스 -> 기본형 : 언박싱
	}

}
