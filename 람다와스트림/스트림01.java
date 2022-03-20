package 람다와스트림;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class 스트림01 {

	public static void main(String[] args) {
		// 스트림 : 다양한 데이터 소스(컬렉션, 배열)를 표준화된 방법으로 다루기 위한 것.
		// 스트림의 3단계 작업 : 스트림 생성 -> 중간연산(0~n번) -> 최종연산(0번~1번)
		// 스트림의 특징 1. 데이터 소스로부터 데이터를 읽기만 할뿐, 변경하지 않는다.(원본 안건드림.)
		// 스트림의 특징 2. Iterator처럼 일회용이다.(필요하면 다시 생성해야함. 최종연산 후에 스트림은 닫힌다)
		// 스트림의 특징 3. 지연된 연산(최종 연산 전까지 중간연산이 수행되지 않음)
		// 스트림의 특징 4. 작업을 내부 반복으로 처리한다.
		// 스트림의 특징 5. 병렬스트림 지원(parallel() 메서드호출하면 병렬 연산 가능)
		// 스트림의 특징 6. 기본형 스트림(Stream<Integer>대신 IntStream사용. 박싱 비효율 제거)
		
		// 스트림 만들기 - 컬렉션
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		Stream<Integer> intStream = list.stream(); // list를 스트림으로 변환
		intStream.forEach(System.out::print); // 스트림의 모든 요소를 출력
//		intStream.forEach(System.out::print); // 최종연산으로 인해 스트림 닫힘. 에러

		// 스트림 만들기 - 배열
		Stream<String> strStream = Stream.of("a", "b", "c");
		Stream<String> strStream2 = Arrays.stream(new String[] {"a", "b", "c"});
		IntStream intStream2 = Arrays.stream(new int[] {1, 2, 3, 4});
		
		// 스트림 만들기 - 임의의 수
		IntStream intStream3 = new Random().ints(); // 무한스트림
		IntStream intStream4 = new Random().ints(5, 10); // 5 ~ 9 무한스트림
		intStream3.limit(5).forEach(System.out::println); // 5개만 자르기
		
		// 스트림 만들기 - 특정 범위의 정수
		IntStream intStream5 = IntStream.range(1, 5); // 1, 2, 3, 4
		IntStream intStream6 = IntStream.rangeClosed(1, 5); // 1, 2, 3, 4, 5
		
		
		
	}

}
