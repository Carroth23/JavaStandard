package 스트림;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 스트림06 {
	public static void main(String[] args) {
		// collect() : Collector를 매개변수로 하는 최종연산
		// Collector : 인터페이스 , Collectors : 미리 작성된 Collector을 제공
		// 스트림을 컬렉션으로 변환 - toList(), toSet(), toMap(), toCollection()
//		List<String> names = stuStream.map(Student::getName)
//								.collect(Collectors.toList());
//		ArrayList<String> list = names.stream()
//								.collect(Collectors.toCollection(ArrayList::new));
//		Map<String, Person> map = personStream
//								.collect(Collectors.toMap(p -> p.getRegId(), p -> p));
		
		// 스트림을 배열로 변환 - toArray()
//		Student[] stuNames = studentStream.toArray(Student[]::new); // OK (많이씀)
//		Student[] stuNames = studentStream.toArray(); // 에러
//		Student[] stuNames = studentStream.toArray(); // OK
		
		// collect()를 이용한 스트림의 통계 (그룹별 통계가 가능)
	/*  long count = stuStream.count();
	 * 	long count = stuStream.collect(Collectors.counting());
	 * 	
	 * 	long totalScore = stuStream.mapToInt(Student::getTotalScore).sum();
	 * 	long totalScore = stuStream.collect(Collectors.summingInt(Student::getTotalScore));
	 * 
	 * 	Optional<Student> topStudent = stuStream
	 * 				.collect(Collectors.maxBy(Comparator.comparingInt(Student::getTotalScore)));
	 */
		// collect()를 이용한 리듀싱
		IntStream intStream = new Random().ints(1, 46).distinct().limit(6);
		OptionalInt max = intStream.reduce(Integer::max);
		Optional<Integer> max2 = intStream.boxed().collect(Collectors.reducing(Integer::max));
		
		// 스트림을 문자열로 결합
		// String studentNames = stuStream.map(Student::getName).collect(Collectors.joining());
		// String studentNames = stuStream.map(Student::getName).collect(Collectors.joining(","));
		
		// 스트림의 그룹화와 분할 (collect는 보통 분할해놓고 작업함)
		// partitioningBy() : 기본 2분할 (다중분할도 가능)
		// Map<boolean, List<Student>> stuBySex = stuStream
		// 			.collect(Collectors.partitioningBy(Student::isMale)); // 성별로 분할
		// groupingBy() : n분할
		// Map<Integer, List<Student>> stuByBan = stuStream
		// 			.collect(groupingBy(Student::getBan, toList())); // toList()생략가능
	}
}
