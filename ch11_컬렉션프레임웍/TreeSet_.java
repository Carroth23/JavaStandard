package ch11_컬렉션프레임웍;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet_ {

	public static void main(String[] args) {
		// TreeSet : 이진 탐색 트리(정렬, 범위검색에 유리)
		// 데이터가 많아질수록 추가, 삭제에 시간이 더 걸림.
//		class TreeNode{
//			TreeNode left; // 자신보다 작은 자식노드를 가르킴
//			Object element;
//			TreeNode right; // 자신보다 큰 자식노드를 가르킴
//		}
		
		Set set = new TreeSet();
		for(int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random() * 45) + 1;
			set.add(num);
		}
		System.out.println(set); // HashSet과는 다르게 정렬이 필요없다
		
		TreeSet set2 = new TreeSet();
		int[] score = {80, 95, 35, 45, 65, 10, 100};
		for(int i = 0; i < score.length; i++) {
			set2.add(score[i]);
		}
		System.out.println("50보다 작은 값 : " + set2.headSet(new Integer(50)));
		System.out.println("50보다 큰 값 : " + set2.tailSet(new Integer(50)));
		
	}

}
