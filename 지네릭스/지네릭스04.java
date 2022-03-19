package 지네릭스;

public class 지네릭스04 {
	public static void main(String[] args) {
		// 제네릭타입의 형변환
		Box3 box = null;
		Box3<Object> objBox = null;
		
		objBox = box;
		box = objBox;
		
		// 컴파일시에는 제네릭타임이 제거됨.
		// 컴파일러가 제네릭타입을 제거하고 필요한곳에 형변환을 넣는다
	}
}

class Box3<T>{}
