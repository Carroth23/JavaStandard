package 스트림;

import java.util.Optional;
import java.util.OptionalInt;

public class 스트림04 {
	public static void main(String[] args) {
		// Optional<T> : T타입 객체의 래퍼클래스 (null을 직접다루면 위험해서 나온것) .filter이나 .map도 사용가능
		Optional<String> optVal = Optional.of("abc"); // Optional 생성
		String str = "abc";
		Optional<String> opVal2 = Optional.of(str);
		Optional<String> opVal3 = Optional.ofNullable(null); // null일 가능성이 있을경우
		Optional<String> opVal4 = Optional.empty(); // 빈객체로 초기화
		
		// Optional객체의 값 가져오기
		String str1 = optVal.get();			// null이면 예외발생
		String str2 = optVal.orElse("");	// null이면 ""을 반환(많이씀)
		String str3 = optVal.orElseGet(String::new); // 람다식 사용가능 () -> new String()
		
		// OptionalInt, OptionalLong, OptionalDouble 기본형 값을 감싸는 래퍼클래스(성능때문에 씀)
		OptionalInt opt = OptionalInt.of(1);
		int a = opt.getAsInt(); // 값 가져오기
		
		// 빈 Optional객체와의 비교
		OptionalInt opt2 = OptionalInt.of(0);	// 0을 저장
		OptionalInt opt3 = OptionalInt.empty();	// 0을 저장
		System.out.println(opt2.isPresent()); // 값이 저장되어 있으면 true
		System.out.println(opt3.isPresent()); // false
		System.out.println(opt2.equals(opt3)); // false
//		.ifPresent() : 값이 있을때만 실행
	}
}
