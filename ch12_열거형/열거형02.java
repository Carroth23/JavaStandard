package ch12_열거형;

public class 열거형02 {

	// 열거형에 원하는 값(멤버) 넣기
//	enum Direction{ EAST(10), SOUTH(5), WEST(10), NORTH(20/*, "하이" 두개넣기도 가능*/) }
	enum Direction {
		EAST(10), SOUTH(5), WEST(10), NORTH(20/* , "하이" 두개넣기도 가능 */); // ; 추가
		// EAST(10) <- 사실 생성자 호출임
		// 원하는 값을 넣으려면 괄호에 값을 넣고, 지정된 값을 저장할 수 있는 변수와 생성자를 추가해줘야함.
		
		private final int value; // private 이어야한다. 상수이므로 final붙여봄
		Direction(int value){this.value = value;} // 생성자.(열거형의 생성자는 private이 붙어있다)
		
		public int getValue() {return value;} // 값 가져오는 메서드
	}

	public static void main(String[] args) {
		System.out.println(Direction.EAST.getValue());
	}
}
