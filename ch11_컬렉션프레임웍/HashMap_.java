package ch11_컬렉션프레임웍;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMap_ {

	public static void main(String[] args) {
		// HashMap = key : value 한 쌍으로 데이터를 다룸 (해싱기능 사용)
		// 순서를 유지하려면 LinkedHashMap 사용,
		// TreeMap: 범위 검색과 정렬에 유리
		// key값은 중복불가, value값은 중복 허용
		
		// 해싱: 해시함수로 해시테이블에 데이터를 저장, 검색(키를 넣으면 저장 위치를 줌)
		// 해시테이블은 배열(접근성)과 링크드리스트(변경유리)가 조합된 형태
		
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1111"); // 이미 존재하는 키를 추가 가능하지만 기존 값은 사라진다.
		
		if(map.containsKey("asdf")) {
			System.out.println("비밀번호는 " + map.get("asdf"));
		} else {
			System.out.println("아이디가 없습니다.");
		}
		System.out.println(map.getOrDefault("asdd", "없음")); // 키값이 없을때 대체반환
		
		Set mapList = map.entrySet();
		Iterator it = mapList.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println(map);
	}

}
