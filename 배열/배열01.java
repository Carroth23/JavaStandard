package 배열;

import java.util.Arrays;

public class 배열01 {

	public static void main(String[] args) {
		// 배열은 같은 타입으로 구성됨
		// 배열의 인덱스는 0 ~ 배결길이-1 까지
		int[] arr1;					// 배열을 다룰 참조변수 선언
		arr1 = new int[5];			// 실제 저장공간 생성
		int[] arr2 = new int[5];	// 한줄로
		System.out.println("arr2의 길이 : " + arr2.length + ", 인덱스 범위 : 0 ~ " + (arr2.length-1));
		
		// 배열의 초기화
		arr1[0] = 0;
		arr1[1] = 1;
		for(int i = 2; i < 5; i++) {
			arr1[i] = i;
		}
		
		// 선언과 동시에 초기화
		int[] arr3 = {1, 2, 3, 4, 5};
		
		// 출력
		for(int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i]);
		}
		System.out.printf("%n" + Arrays.toString(arr3) + "%n");
		
		// 2차원
		int[][] eArr = new int[4][3]; // 4행 3열
		int[][] eArr2 = { // 2행 3열
				{100, 100, 100},
				{70, 60, 80}
		};
		System.out.println(Arrays.deepToString(eArr2));
	}

}
