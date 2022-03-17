package 유용한클래스;

public class JavaLang01 {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		// equals는 주소값으로 비교함
		if(v1.equals(v2)) {
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");
		}
		System.out.println(v1.toString());
		
		// String클래스는 문자열이 같으면 동일한 해시코드를 뱉는다
		String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println("str1 해시코드 : " + str1.hashCode());
		System.out.println("str2 해시코드 : " + str2.hashCode());
		
		// String
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("zxc");
		String s4 = new String("zxc");
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		String emptyStr = "";
		char emptyChar = ' ';
	}
}

class Value {
	int value;

	Value(int value) {
		this.value = value;
	}
	
	public boolean equals(Object obj) { // 내용을 비교할 수 있게 오버라이딩
		if(obj instanceof Value) {
			return value == ((Value)obj).value;
		} else {
			return false;
		}
	}
	
	public String toString() {
		return "vavlue : " + value;
	}
}
