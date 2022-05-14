package ch11_컬렉션프레임웍;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Iterator_ {

	public static void main(String[] args) {
		// Iterator
		// 컬렉션 프레임웍에서 컬렉션 요소를 읽어오는 방법을 표준화한것.
		// Iterator는 일회용이라 다 쓰고나면 다시 얻어와야 함.(포인터가 끝까지 가서 다시 리셋하는 느낌)
		List list = new ArrayList();
		list.add("안녕");
		list.add("하세요");
		list.add("ㅎㅎ");
		Iterator it = list.iterator();
		while(it.hasNext()) { // 읽어올 요소가 있다면 true
			System.out.println(it.next()); // 다음요소를 읽어옴
		}
		
		// Map에서의 Iterator
		// Map을 구현한 컬렉션 클래스는 key와 value를 가지고 있어 iterator을 바로 쓸 수 없다.
		// entrySet이나 keySet으로 가져와야함.
		Map map = new HashMap();
		map.put(1, "하이");
		map.put(2, "헬로우");
		map.put(3, "바이");
		Iterator it2 = map.entrySet().iterator(); // entrySet: 키와 값 한 쌍
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
	}

}
