package ch11_컬렉션프레임웍;

import java.util.Arrays;
import java.util.Comparator;

public class Comparator_Comparable {
	public static void main(String[] args) {
		// 컬렉션을 정렬하는데 사용
		// Comparable(compareTo) : 기본정렬 구현에 사용(자신과 비교)
		// Comparator(compare) : 기본정렬 외 다른 정렬기준을 구현할때 사용(다른 두 대상 비교)
		
		String[] strArr = {"cat", "Dog", "lion", "tiger"};
		
		Arrays.sort(strArr); // String의 Comparable구현에 의한 정렬
		System.out.println("strArr = " + Arrays.toString(strArr));
		
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분X
		System.out.println("strArr = " + Arrays.toString(strArr));
		
		Arrays.sort(strArr, new Descending()); // 역순
		System.out.println("strArr = " + Arrays.toString(strArr));
	}
}

class Descending implements Comparator{
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			return c1.compareTo(c2) * -1; // -1을 곱해서 기본 정렬방식의 역순으로 변경
		}
		return -1;
	}
}
