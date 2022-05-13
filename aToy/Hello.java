package aToy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Hello {

	public static void main(String[] args) throws ParseException {
		Date today = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat df2 = new SimpleDateFormat("yyyy년 MM월 dd");
		Date d = df2.parse("2022년 12월 23");
//		String re = df.format(today);
		System.out.println(d);
//		System.out.println(re);
	}
}
