package 유용한클래스;

public class JavaLang02 {

	public static void main(String[] args) {
		// String 불변
		String a = "abcd";
		String b = "bacd";
		System.out.println(a.charAt(2));
		System.out.println(a.compareTo(b)); 	// 사전순 비교
		System.out.println(a.concat(b)); 		// 이어붙이기
		System.out.println(a.contains("c")); 	// 포함 검사
		System.out.println(a.endsWith("d"));	// "d"로 끝나는지
		System.out.println(a.indexOf("c"));		// 존재하는지와 index위치 (없으면 -1)
		System.out.println(a.lastIndexOf("c"));	// 뒤에서부터 찾기
		System.out.println(a.replace("d", "q"));// 문자바꾸기
		String[] strArr = new String("하이,바이,마마").split(",");
		System.out.println(strArr[0]);			// 잘라서 배열에담기
		System.out.println(a.substring(0, 3));	// 인덱스에 해당하는 문자열 얻기
		System.out.println(new String("   공 백    ").trim()); // 양쪽 공백제거
		int c = 123;
		System.out.println(String.valueOf(c) + 123); // 문자열로 변환
		System.out.println(String.join("-", strArr));// 결합
		
		// StringBuffer 가변 (StringBuilder는 동기화처리된 StringBuffer로 생각하면됨)
		StringBuffer sb = new StringBuffer("하이");
		System.out.println(sb.append("바이"));
		System.out.println(sb);
		sb.delete(1, 3);
		sb.reverse();
		System.out.println(sb);
		
	}

}
