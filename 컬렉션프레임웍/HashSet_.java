package 컬렉션프레임웍;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashSet_ {

	public static void main(String[] args) {
		// HashSet : Set인터페이스를 구현한 대표적 컬렉션
		// 순서가 없이 중복을 허용하지 않음 (순서 유지하려면 LinkedHashSet)
		
		Object[] objArr = {"1", new Integer(1), "2", "2", "3", "3", "4", "4", "4"};
		Set set = new HashSet();
		
		for(int i = 0; i < objArr.length; i++) {
			set.add(objArr[i]); // HashSet에 요소를 저장
		}
		System.out.println(set); // 요소 출력(중복 제거됨)
		
		// Iterator이용한 출력
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println(set.contains(1)); // 지정된 객체를 포함하는지
		Object[] objArr2 = set.toArray(); // 객체배열로 반환
		List list = new LinkedList(set); // 리스트로 변환
	}

}
