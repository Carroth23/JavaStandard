package ch05_배열;

public class String클래스 {
	public static void main(String[] args) {
		// String클래스는 char[]과 메서드를 결합한 것
		// String클래스는 내용을 변경할 수 없다(Read only)
		
		String str = "abcd";
		String str2 = "abcb";
		
		boolean b = str.equals(str2);
		char ch = str.charAt(3);
		System.out.println(str.length());
		String substr = str.substring(1, 3);
		char[] charr = str.toCharArray();
	}
}
