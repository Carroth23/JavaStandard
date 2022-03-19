package 컬렉션프레임웍;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrays_ {

	public static void main(String[] args) {
		// 배열을 다루는데 유용한 메서드가 많은 Arrays
		// toString()
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(arr)); // 배열 출력
		
		// copyOf
		int[] arr2 = Arrays.copyOf(arr, arr.length); // arr2 = [1, 2, 3, 4, 5]
		System.out.println(Arrays.toString(arr2));
		int[] arr3 = Arrays.copyOfRange(arr2, 2, 4); // 복사 시작위치 지정
		System.out.println(Arrays.toString(arr3));
		
		// fill()
		int[] arr4 = new int[5];
		Arrays.fill(arr4, 9);	// 9로 채우기
		System.out.println(Arrays.toString(arr4));
		
		// sort()
		int[] arr5 = {6, 5, 1, 3, 2, 4};
		Arrays.sort(arr5); // 정렬
		System.out.println(Arrays.toString(arr5));
		
		// 이진검색 : 범위를 절반씩 줄여나가면서 검색. (정렬이 필수며 검색속도가 빠름)
		int idx = Arrays.binarySearch(arr5, 3);
		System.out.println(idx);
		
		// equals() 요소비교
		System.out.println(Arrays.equals(arr4, arr5));
		
		// asList() 배열을 list로 변환
		List list = Arrays.asList(new Integer[] {1,2,3,4,5});
		List list2 = Arrays.asList(arr5);
		System.out.println(list.size());
		
		
	}

}
