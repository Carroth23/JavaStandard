package 람다;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class 람다05 {
	public static void main(String[] args) {
		// 컬렉션프레임웍과 함수형 인터페이스(컬렉션쓸때 람다 편하게사용)
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < 10; i++)
			list.add(i);
		
		// list의 모든 요소 출력 Consumer를 넣음
		list.forEach(i -> System.out.println(i + ", "));
		System.out.println(list);
//		Iterator it = list.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		System.out.println();
		
		// list에서 2 또는 3의 배수를 제거한다. Predicate를 넣음
		list.removeIf(x -> x % 2 == 0 || x % 3 == 0);
		System.out.println(list);
		
		// list의 각 요소에 10을 곱한다. UnaryOperator를 넣음
		list.replaceAll(i -> i * 10);
		System.out.println(list);
		
		Map<String, String> map = new HashMap<>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");
		
		// map의 모든 요소를 {k, v}의 형식으로 출력 (Iterator 안써도 된당)
		map.forEach((k, v) -> System.out.print("{" + k + ", " + v + "}"));
	}
}
