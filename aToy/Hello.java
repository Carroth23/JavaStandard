package aToy;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Hello {

	public static void main(String[] args) throws ParseException {
		Set set = new HashSet();
		
		for(int i = 0; set.size() < 6; i++) {
			set.add((int)(Math.random() * 45) + 1);
		}
		System.out.println(set);
		List list = new ArrayList(set);
		Collections.sort(list);
		System.out.println(list);
	}
}
