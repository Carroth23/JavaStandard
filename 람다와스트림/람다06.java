package 람다와스트림;

import java.util.function.Function;
import java.util.function.Supplier;

public class 람다06 {
	public static void main(String[] args) {
		// 메서드 참조 = 하나의 메서드만 호출하는 람다식은 "메서드 참조"로 간단히 가능
		// 1. static메서드 참조 (x) -> ClassName.method(x) 를 ClassName::method 로
		// 2. 인스턴스메서드 참조 (obj, x) -> obj.method(x) 를 ClassName::method 로
		
		Function<String, Integer> f = s -> Integer.parseInt(s);
//		Function<String, Integer> f = 클래스이름::메서드이름;
		Function<String, Integer> f2 = Integer::parseInt; // wow...
		// 메서드들의 선언부 매개변수나 리턴값들을 보면서 바꿔가면 이해하기 쉬울것.
		
		// 생성자의 메서드 참조
		Supplier<MyClass> s = () -> new MyClass(); // Supplier은 주기만 함.
		Supplier<MyClass> s2 = MyClass::new;
		Function<Integer, MyClass> z = (i) -> new MyClass(i);
		Function<Integer, MyClass> z2 = MyClass::new; // 어차피 Function이 매개변수를 알고있음.

		MyClass mc = s.get(); // MyClass객체 반환
		System.out.println(mc);
		MyClass mc2 = z.apply(100);
		System.out.println(mc2.i);
		
		// 배열과 메서드 참조
		Function<Integer, int[]> a = x -> new int[x]; // 람다식
		Function<Integer, int[]> a2 = int[]::new; // 이거 많이씀
		int[] arr = a.apply(50);
		System.out.println(arr.length);
	}
}
class MyClass{
	int i;
	MyClass() {}
	MyClass(int i) {this.i = i;}
}
