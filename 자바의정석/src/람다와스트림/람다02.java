package 람다와스트림;

public class 람다02 {
	public static void main(String[] args) {
//		Object obj = (a, b) -> a > b ? a : b; //람다식. 익명객체
//		MyFunction2 f = new MyFunction2() {
//			public int max2(int a, int b) { // 오버라이딩 - 접근제어자는 부모보다 좁게 못함
//				return a > b ? a : b;
//			}
//		}
		
		// 람다식(익명 객체)을 다루기 위한 참조변수의 타입은 함수형 인터페이스로 한다.
		// 위의 클래스 만들고 함수 만들고를 간략히 한게 이것.
		MyFunction2 f = (a, b) -> a > b ? a : b;
		
		int value = f.max(3, 5); // 함수형 인터페이스
		System.out.println("value= " + value);
	}
}

@FunctionalInterface // 함수형 인터페이스는 단 하나의 추상 메서드만 가져야 함.
interface MyFunction2 {
//	public abstract int max2(int a, int b);
	int max(int a, int b);
}