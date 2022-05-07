package 실습;

import java.util.ArrayList;

public class 컬렉션01 {

	public static void main(String[] args) {
		// 기본길이(용량)가 10인 ArrayList를 생성
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
	}

}
