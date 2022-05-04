package toy1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Collectss {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		list1.add(new Integer(5));
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list1.get(4));
		
		Collections.sort(list1);
		System.out.println(list1);
		
		Map mmp = new HashMap();
		mmp.put("인사", "하이");
		mmp.put("하이", "인사");
		
		Set ss = mmp.keySet();
		
		System.out.println(ss);
	}

}
