package ch11_컬렉션프레임웍;

import java.util.*;

public class ArrayList_ {

	public static void main(String[] args) {
		// 가장 많이 사용되는 컬렉션
		// 기존의 Vector를 개선한 것(구현원리와 기능은 동일 Vector는 동기화처리가 되어있음.)
		// Object배열을 이용해 순차적으로 데이터를 저장. 배열길이가 모자른다면 새로운 배열을 만들고 기존껄 복사해서 늘림
		// ArrayList는 객체만 저장가능 하므로 기본형은 오토박싱되어 저장됨
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(2, new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4)); // 인덱스를 뽑아서 새로운 리스트 생성
		System.out.println(list1);
		System.out.println(list2);
		
		Collections.sort(list1);
		Collections.sort(list2);
		System.out.println("list1.containsAll(list2):" + list1.containsAll(list2)); // 포함되어 있는지
		System.out.println(list2);
		
		list2.add("B");
		list2.add("c");
		list2.add(3, "A"); // index가 3인곳에 A추가
		System.out.println(list2);
		// Collection은 인터페이스, Collections는 클래스
		list2.clear();
		System.out.println(list2);
		System.out.println(list2.isEmpty());
		
		ArrayList list3 = new ArrayList();
		list3.add(1);
		list3.add(2);
		list3.add(3);
		list3.add(4);
		list3.add(5);
		System.out.println("3의 위치" + list3.indexOf(3));
		list3.remove(2); // 중간에서 지우는건 연산 소요가 많음 뒤에껄 다 땡겨오기때문
		System.out.println(list3);
	}

}
