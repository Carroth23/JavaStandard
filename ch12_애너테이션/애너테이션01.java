package ch12_애너테이션;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class 애너테이션01 {
	public static void main(String[] args) {
		// 애너테이션의 뜻: 주석, 주해, 메모
		// 주석처럼 프로그래밍 언어에 영향을 미치지 않으며, 유용한 정보를 제공
	}
}

class Parent{
	void parentMethod() {}
}

@FunctionalInterface // 함수형 인터페이스는 하나의 추상 메서드만 가능
interface Testtt {
	void testT(); // 추상메서드
//	void testT1();
}

class Child extends Parent{
//	void parentmethod() {} // 오버라이딩할 생각이었지만 오타로 새로운 메서드가 만들어진 경우
	@Override
//	void parentmethod() {} // @Override 애너테이션을 붙이면 오버라이딩 검사를 해준다
	void parentMethod() {}
	
	// @Deprecated : 쓰지마라.더이상 사용하지마라 라는 뜻
	// @FunctionalInterface : 함수형 인터페이스 선언
	// @SuppressWarnings("경고내용") : 컴파일 경고메세지 안나오게 해줌
	
	// 메타애너테이션 : 애너테이션을 만들때 사용하는 애너테이션
	// @Inherited 애너테이션을 자손클래스에 상속
	// @Target 애너테이션 적용가능 대상 지정
	// @Retention 애너테이션이 유지되는 범위 지정
	// SOURCE : 소스파일에만 존재. 클래스파일에는 존재하지 않음
	// CLASS : 클래스 파일에 존재. 실행시에 사용불가 (기본값)
	// RUNTIME : 클래스 파일에 존재. 실행시에 사용가능.
	
	
	// 새로운 애너테이션 만들기
	// 애너테이션 메서드는 추상메서드이다. (애너테이션을 적용할때 지정 순서X)
	@interface TestInfo{ // @안붙이면 인터페이스되버림
		int count();
//		int count() default 1; 디폴트값 가능 그럼 밑에선 안적어줘도 됨
		String testedBy();
		String[] testTools();
		TestType testType(); // enum
		DateTime testDate(); // 자신이 아닌 다른 애너테이션(@DateTime)을 포함 가능
	}
	
	@interface DateTime{
		String yymmdd();
		String hhmmss();
	}
	
	// 만든 애너테이션의 요소가 하나이고 이름이 value면 애너테이션 붙일때 요소 이름 생략 가능
	
	// 만든 애너테이션 사용
	@TestInfo(
		count=3, testedBy="kim",
		testTools= {"JUnit", "AutoTester"},
		testType=TestType.FIRST,
		testDate=@DateTime(yymmdd="220318", hhmmss="152050")
	)
	public void proc() {
		
	}
	
}

@Retention(RetentionPolicy.RUNTIME)
@interface TestInfo2{ // @안붙이면 인터페이스되버림
	int count();
//	int count() default 1; 디폴트값 가능 그럼 밑에선 안적어줘도 됨
	String testedBy();
	String[] testTools();
	TestType testType(); // enum
}

// 이런식으로 사용
@TestInfo2(
		count=1, testedBy="테스트", testTools= {"테스트1", "테스트2"}, testType=TestType.FIRST
)
class EE{
	void ww() {
		Class<EE> cls = EE.class;
		TestInfo2 anno = cls.getAnnotation(TestInfo2.class);
		System.out.println("anno.testedBy()=" + anno.count());
	}
}

enum TestType { FIRST, FINAL}

// 모든 애너테이션의 조상 : Annotation <- 인터페이스임
// 마커애너테이션 : 요소가 하나도 정의되지않은 애너테이션
/* 
 * 애너테이션 요소 규칙 : 요소타입은 기본형, String, enum, 내어테이션, class만 허용됨
 * () 안에 매개변수 선언 불가
 * 예외 선언 불가
 * 요소를 타입매개변수로 정의 불가
 */