package ch11_컬렉션프레임웍;

import java.util.LinkedList;

public class LinkedList_ {

	public static void main(String[] args) {
		// 배열은 구조가 간단하고 데이터를 읽는 데 걸리는 시간(접근시간)이 짧다
		// 배열의 단점인 크기변경 불가와 비순차적 데이터 추가or삭제에 시간이 많이걸리는걸 해결하기위해 등장한 LinkedList
		
//		 class Node{
//			 Node next;		다음요소(노드)의 주소를 저장
//			 Object obj;	데이터를 저장
//		 }
		// 링크드리스트에서 삭제는 참조만 변경하면되서 빠름
		// 추가는 두번의 참조변경만으로 가능
		// 대신 저장하는 데이터개수가 많아질수록 접근시간이 길어짐.
		
		// 더블리 링크드 리스트 - 이중연결리스트, 접근성 향상
		// 노드가 두개있는것
		// 더블리 써큘러 링크드 리스트 - 이중 원형 연결리스트
		// 더블리를 개선한것 맨 끝과 맨 앞을 연결(오버플로우느낌?)
		
		LinkedList list1 = new LinkedList();
		list1.addFirst(1); // 가장 앞에 데이터 추가
		list1.addLast(2); // 가장 뒤에 데이터 추가
		list1.add(3); // 데이터 추가
		list1.add(3, 4);
		System.out.println(list1);
		list1.removeFirst(); //가장 앞의 데이터 삭제
		list1.removeLast();
		list1.remove(); // 0번째 index제거
		System.out.println(list1);
		System.out.println(list1.get(0));
	}

}
