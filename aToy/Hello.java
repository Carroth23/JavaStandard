package aToy;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hello {

	public static void main(String[] args) throws ParseException {
		String[] data = {"A", "K", "A", "K", "B", "C", "A", "Z", "D", "D"};
		System.out.println("data 사이즈 : " + data.length);
		HashMap map = new HashMap();
		
		for (int i = 0; i < data.length; i++) {
			if(map.containsKey(data[i])) {
				int num = (int) map.get(data[i]);
				map.put(data[i], num + 1);
			} else {
				map.put(data[i], 1);
			}
		}
		
		Iterator it = map.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry entry = (Map.Entry)it.next();
			int value = (int) entry.getValue();
			String key = (String) entry.getKey();
			System.out.println(key + value);
		}
	}
}
