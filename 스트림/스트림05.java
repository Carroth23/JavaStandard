package 스트림;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class 스트림05 {
	public static void main(String[] args) {
		// 스트림의 최종연산 : 연산의 결과값이 Stream이 아님
		
		// forEach : 스트림의 모든 요소에 지정된 작업을 수행
		IntStream.range(1, 10).forEach(System.out::print);			// 병렬스트림일경우 순서보장X
		IntStream.range(1, 10).forEachOrdered(System.out::print);	// 병렬스트림일경우 순서보장O
		IntStream.range(1, 10).parallel().forEach(System.out::print); // 병렬스트림
		IntStream.range(1, 10).parallel().forEachOrdered(System.out::print);
		
		// 조건검사
//		boolean allMatch (Predicate<? super T> predicate)	모든 요소가 일치하면 true
//		boolean anyMatch (Predicate<? super T> predicate)	하나의 요소라도 일치하면 true
//		boolean noneMatch (Predicate<? super T> predicate)	모든 요소가 불일치하면 true
//		boolean hasFailedStu = stuStream.anyMatch(s -> s.getTotalScore() <= 100) 낙제자가 있는지?
//		Optional<T> findFirst() // 조건에 일치하는 첫 번째 요소를 반환
//		Optional<T> findAny()	// 조건에 일치하는 요소를 하나 반환(병렬 스트림)
		
		// reduce : 스트림의 요소를 하나씩 줄여가며 누적연상 수행
		IntStream intStream = IntStream.range(1, 6);
		int count = intStream.reduce(0, (a, b) -> a + 1); // 0은 초기값 a는 identity
		intStream = IntStream.range(1, 6);
		int sum = intStream.reduce(0, (a, b) -> a + b);
		// reduce의 이해 :
		// int a = identity; 초기값을 a에 저장한다.
		// for(int a : stream)
		//  	a = a + b; 모든 요소의 값을 a에 누적한다
	}
}
