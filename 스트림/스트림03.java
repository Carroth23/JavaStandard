package 스트림;

import java.io.File;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class 스트림03 {
	public static void main(String[] args) {
		// 스트림의 중간연산 예시
		// skip, limit
		IntStream intStream = IntStream.rangeClosed(1, 10);
		intStream.skip(3).limit(5).forEach(System.out::print); // 3개 건너뛰고 5개출력
		System.out.println();
		
		// distinct
		intStream = IntStream.of(1, 2, 2, 3, 3, 3, 4, 4);
		intStream.distinct().forEach(System.out::print); // 중복 제거
		System.out.println();
		
		// filter
		intStream = IntStream.rangeClosed(1, 10);
		intStream.filter(i -> i % 2 == 0).forEach(System.out::print); // 2의 배수가 아닌것 걸러내기
		System.out.println();
		
		// sorted
		intStream = IntStream.of(3, 2, 5, 4, 7, 8, 1, 6);
		intStream.sorted().forEach(System.out::print); // 스트림 기본정렬
//		studentStream.sorted(Comparator.comparing(Student::getBan)) // 반별로 정렬
//		studentStream.sorted(Comparator.comparing(Student::getBan).thenComparing(정렬기중)) // 기준추가
		System.out.println();
		
		// map, peek
		File[] fileArr = {new File("Ex1.java"), new File("Ex1.bak"), new File("Ex2.java")};
		Stream<File> fileStream = Stream.of(fileArr); // 파일스트림 생성
		// map()으로 Stream<File>을 Stream<String>으로 변환
//		Stream<String> fileNameStream = fileStream.map((f) -> f.getName());
		Stream<String> fileNameStream = fileStream.map(File::getName);
		fileNameStream.filter(s -> s.indexOf('.') != 1) // 확장자가 없는것은 제외
		.peek(s -> System.out.printf("filename=%s%n", s)) // 중간확인
		.map(String::toUpperCase) // 모두 대문자로 변환
		.distinct() // 중복 제거
		.forEach(System.out::println);
		
		// flatMap
		// 각각의 배열들 혹은 Stream<T[]>을 Stream<T>로 변환할때 사용(맵으로 변환하면 스트림의 스트림이 됨)
		Stream<String[]> strArrStrm = Stream.of(
				new String[] {"abc", "def", "asd"},
				new String[] {"ewq", "zxc", "tyu"}
		); // 이걸 맵으로 바꾸면
		Stream<Stream<String>> strStrStrm = strArrStrm.map(Arrays::stream); //이런느낌이 됨
		Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream); // 이렇게 해야 하나의 스트림
	}
}
