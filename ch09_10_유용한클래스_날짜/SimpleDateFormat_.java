package ch09_10_유용한클래스_날짜;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat_ {

	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		System.out.println(d);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-a-HH:mm");
		System.out.println(sdf.format(d));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일");
		String d2 = "2022년 3월 15일";
		System.out.println(sdf2.parse(d2)); // 문자열을 날짜데이터로 바꾸기
	}

}
