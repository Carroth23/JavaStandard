package 컬렉션프레임웍;

import java.util.ArrayList;
import static java.util.Collections.*; // static메서드들을 클래스이름없이 쓰게해줌
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections_ {

	public static void main(String[] args) {
		// Arrays = 배열 관련 메서드 제공, Collections = 컬렉션 관련 메서드 제공
		// 동기화 컬렉션이 필요할땐
		List syncList = Collections.synchronizedList(new ArrayList());
		Set syncSet = Collections.synchronizedSet(new HashSet());
		Map syncMap = Collections.synchronizedMap(new HashMap());
		
		// 데이터의 손상을 막기위해 읽기전용으로 만드려면
		List udList = Collections.unmodifiableList(new ArrayList());
		
		// 단 하나의 객체만을 저장하는 컬렉션 만들떄(싱글톤)
		Set stSet = Collections.singleton(new HashSet());
		
		// 한종류의 객체만 저장하는 컬렉션(지네릭스 안쓸때)
		List chList = Collections.checkedList(new ArrayList(), String.class); // String만 가능
		
		// 각종 메서드
		List list = new ArrayList();
		addAll(list, 1, 2, 3, 4, 5); // static import로 인해 Collectios 안붙이고 사용
		System.out.println(list);
		
		rotate(list, 2); // 오른쪽으로 두 칸 이동
		System.out.println(list);
		
		swap(list, 0, 2); // 첫 번째와 세 번째 교환
		System.out.println(list);
		
		shuffle(list); // 임의로 섞기
		System.out.println(list);
		
		sort(list, reverseOrder()); // 역순 정렬
		System.out.println(list);
		
		sort(list); // 정렬
		System.out.println(list);
		
		System.out.println("max = " + max(list));
		System.out.println("min = " + min(list));
	}

}
