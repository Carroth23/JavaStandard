package 열거형;

public class 열거형01 {
	// 열거형: 관련된 상수들을 같이 묶어 놓은것.(객체임)
	enum Direction {EAST, SOUTH, WEST, NORTH};
	enum Direction2 {EAST, SOUTH, WEST, NORTH};
		// 열거형 이름   o,     1,    2,     3 자동초기화
	
	public static void main(String[] args) {
//		if(Direction.EAST == Direction2.EAST) 타입을 먼저체크. 컴파일 에러
		System.out.println(Direction.EAST);
		Direction dir; //열거형 변수 선언
		dir = Direction.NORTH; // dir에는 해당 열거형 상수만 들어올 수 있음
		System.out.println(dir);
		
		// == 열거형 상수의 비교에 == 사용 가능
		System.out.println(dir == Direction.NORTH);
		System.out.println(Direction.NORTH == Direction.EAST);
		
		// >< 비교연산자는 불가능. compareTo로 사용.
//		System.out.println(dir > Direction.EAST); 에러
		System.out.println(dir.compareTo(Direction.EAST)); // NORTH=3 - EAST=0 = 3
		
		// 모든 열거형의 조상 Enum
		
		switch(dir) {
		case EAST: // Direction.EAST라고 쓰면 안된다. 
			System.out.println("EAST");
			break;
		case NORTH:
			System.out.println("NORTH");
			break;
		}
		
		Direction[] dArr = Direction.values(); // 열거형의 모든 상수를 배열로 반환
		for(Direction d : dArr) {
			System.out.println(d.name() + ", " + d.ordinal()); // ordinal은 값이 아니라 순서
		}
	}

}
