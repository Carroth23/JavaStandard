package ch09_10_유용한클래스_날짜;

public class String01 {

	public static void main(String[] args) {
		// String클래스 = 데이터(char[]) + 메서드(문자열 관련)
		
		// String = 내용을 변경할 수 없는 불변 클래스
		String a = "abcd";
		String b = "bacd";
		System.out.println(a.charAt(2));
		System.out.println(a.compareTo(b)); 	// 사전순 비교
		System.out.println(a.concat(b)); 		// 이어붙이기
		System.out.println(a.contains("c")); 	// 포함 검사
		System.out.println(a.endsWith("d"));	// "d"로 끝나는지
		System.out.println(a.indexOf("c"));		// 존재하는지와 index위치 (없으면 -1)
		System.out.println(a.lastIndexOf("c"));	// 뒤에서부터 찾기
		System.out.println(a.equalsIgnoreCase(b)); // 대소문자 구분없이 비교
		System.out.println(a.replace("d", "q"));// 문자바꾸기
		String[] strArr = new String("하이,바이,마마").split(",");
		System.out.println(strArr[0]);			// 잘라서 배열에담기
		System.out.println(a.substring(0, 3));	// 인덱스에 해당하는 문자열 얻기
		System.out.println(new String("   공 백    ").trim()); // 양쪽 공백제거
		int c = 123;
		System.out.println(String.valueOf(c) + 123); // 문자열로 변환(""이거보다 빠름)
		System.out.println(String.join("-", strArr));// 결합
		
		// 문자열 리터럴은 프로그램 실행시 자동으로 생성된다.(constant pool에 저장)
		
		// StringBuffer 가변가능 (StringBuilder는 동기화처리된 StringBuffer로 생각하면됨)
		// StringBuffer는 equals가 오버라이딩 되어있지않다
		StringBuffer sb = new StringBuffer("하이"); // "하이"+16길이의 배열이 만들어짐
		System.out.println(sb.append("바이").append("마마")); // 메서드 체이닝
		System.out.println(sb);
		sb.delete(1, 3);
		sb.insert(1, "넣음");
		sb.reverse();
		sb.setLength(20); // 길이 변경
		System.out.println("sb의 사이즈 = " + sb.capacity()); // sb의 전체 공간
		System.out.println(sb);
	}

}
