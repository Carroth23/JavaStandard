package 람다;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class 람다04 {
	public static void main(String[] args) {
		// java.util.function에 미리 정의된 함수형 인터페이스
		// 매번 만들어쓰기 귀찮으니까 자바에서 미리 만들어둔것. 되도록 이것들을 쓰자. (재사용성이나 유지보수 측면에서도 좋음)
//		java.lang.Runnable {void run()} 매개변수도 없고, 반환값도 없음
//		Supplier<T> {T get()} 			매개변수는 없고, 반환값만 있음.
//		Consumer<T> {void accept(T t)} 	매개변수만 있고, 반환값이 없음.
//		Function<T, R> {R apply(T t)}	하나의 매개변수를 받고 하나의 결과를 반환.(일반적인 함수)
//		Predicate<T> {boolean test(T t)}조건식 표현에 사용. 매개변수는 하나, 반환타입은 boolean
		Supplier<Integer> s = () -> (int)(Math.random() * 100) + 1;
		Consumer<Integer> c = i -> System.out.println(i);
		Predicate<Integer> p = i -> i%2==0; // 원래는 <Integer, Boolean>이지만 항상 boolean반환이라 생략
		Function<Integer, Integer> f = i -> i / 10 * 10;
		
		// 매개변수가 2개인 함수형 인터페이스(Supplier는 원래 매개변수 없음)
//		BiConsumer<T, U> {void accept(T t, U u}}	두개의 매개변수를 받고, 반환값이 없음
//		BiPredicate<T, U> {boolean test(T t, U u)}	조건식 표현에 사용. 매개변수 둘, 반환값은 boolean
//		BiFunction<T, U, R> {R apply(T t, U u)}		두 개의 매개변수를 받아 하나의 결과(R)을 반환
		// 3개부턴 걍 만들어쓰면됨
		
		// 매개변수의 타입과 반환타입이 모두 일치하는 Function의 변형
//		UnaryOperator<T> {T apply(T t)}			매개변수와 결과타입이 같음. Function의 자손
//		BinaryOperator<T> {T apply(T t, T t)}	BiFunction의 자손.
		
		// Predicate의 결합
		Predicate<Integer> p1 = i -> i < 100;
		Predicate<Integer> q = i -> i < 200;
		Predicate<Integer> r = i -> i % 2 == 0;
		Predicate<Integer> notP1 = p1.negate(); // i >= 100
		// 100 <= i && (i < 200 || i % 2 == 0)
		Predicate<Integer> all = notP1.and(q.or(r));
		System.out.println(all.test(150)); // true
		
		// andThen()과 compose로 Function()을 합칠 수 있음.
	}
}
