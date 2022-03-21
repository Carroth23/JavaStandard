package 스트림;

public class 스트림02 {
	public static void main(String[] args) {
		// 스트림의 중간연산 - 연산 결과가 스트림인 연산. 반복적으로 적용가능
//		stream.distinct().limit(5).sorted()...
		// distinct() 						중복을 제거
		// filter(Predicate<T> predicate)	조건에 안 맞는 요소 제외
		// limit(long maxSize)				스트림의 일부를 잘라냄
		// skip(long n) 					스트림의 일부를 건너뜀
		// peek(Consumer<T> action)			스트림의 요소에 작업 수행
		// sorted()							스트림의 요소를 정렬
		
		// 중간연산의 핵심
		// map(Function<T, R> mapper) 				스트림의 요소를 변환, 추출
		// flatMap(Function<T, Stream<R>> mapper)	스트림의 요소를 변환
		
		// 스트림의 최종연산 - 연산 결과가 스트림이 아닌 연산. 스트림의 요소를 소모
		// forEach(Consumer<? super T> action)		각 요소에 지정된 작업 수행(병렬은 Ordered)
		// count()									스트림 요소의 개수 반환
		// Optional<T> max(Comparator<? super T> comparator), min()	스트림의 최대/최소값 반환
		// Optional<T> findyAny()					아무거나 하나 반환(filter랑 같이씀)
		// allMatch(Predicate<T> p), anyMatch()...  조건을 만족하는지 확인
		// Object[] toArray()						스트림의 모든 요소를 배열로 반환
		
		// 최종연산의 핵심
		// Optional<T> reduce(BinaryOperator<T> accumulator) 스트림의 요소를 하나씩 줄여가면서 계산
		// R collect(Collector<T, A, R) collector)			 스트림의 요소를 수집.
	}
}
