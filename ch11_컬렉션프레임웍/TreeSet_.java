package ch11_컬렉션프레임웍;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_ {

	public static void main(String[] args) {
		// TreeSet : 이진 탐색 트리로 구현(정렬, 범위검색에 유리)
		// 이진 트리는 모든 노드가 최대 2개의 하위 노드를 갖음
		// 데이터가 많아질수록 추가, 삭제에 시간이 더 걸림.
		// 이진 트리의 모든 노드를 한번씩 읽는 것을 트리 순회라고 함.
		// 전위, 중위, 후위순회법이 있고 중위 순회하면 오름차순 정렬됨
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
		System.out.println("35보다 크고 95보다 작은 값 : " + set2.subSet(35, 95));
		
	}

}

class Test {} // 비교 기준이 없음.(Comparable 구현하면 비교기준 조건 충족)

class TestComp implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0; // 0이면 같음, 왼쪽이 크면 양수, 오른쪽이 크면 음수
	}
	
}