package ch12_지네릭스;

public class 지네릭스04 {
	public static void main(String[] args) {
		// 제네릭타입의 형변환
		Box3 box = null;
		Box3<Object> objBox = null;
		
		objBox = box;
		box = objBox;
		
		// 와일드 카드가 사용된 지네릭 타입으로는 형변환 가능
//		Box<Object> objBox2 = (Box<Object>)new Box<String>(); 에러. 형변환 불가능
		Box<? extends Object> wBow = new Box<String>(); // (Box<? extends Object>)가 생략됨
		
		// 컴파일시에는 제네릭타임이 제거됨.(하위호환때문에 지네릭타입 제거해버리는것)
		// 컴파일러가 제네릭타입을 제거하고 필요한곳에 형변환을 넣는다
	}
}

class Box3<T>{}
