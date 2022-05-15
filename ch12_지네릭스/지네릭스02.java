package ch12_지네릭스;

import java.util.ArrayList;

class Fruit implements Eatable {
	public String toString() {return "Fruit";}
}
class Apple extends Fruit { public String toString() {return "Apple";}}
class Grape extends Fruit { public String toString() {return "Grape";}}
class Toy { public String toString() {return "Toy";}}

interface Eatable {
}

public class 지네릭스02 {
	public static void main(String[] args) {
		// 제한된 지네릭스
		// 제약 : static멤버에는 타입 변수 사용 불가, new 다음 T가 올 수 없음(new는 타입 확정되어있어야 가능)
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
//		FruitBox<Grape> grapeBox = new FruitBox<Apple>(); 제네릭타입 불일치
//		FruitBox<Toy> toyBox = new FruitBox<Toy>(); 에러 Fruit구현 타입제한에 걸림
//		Box<Toy> toyBox = new Box<Toy>(); 이건 가능. Box는 제약이 없기때문 <T>
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
//		appleBox.add(new Grape()); appleBox에서 Box의 <T>가 Apple로 바뀌었는데 Grape는 상속관계가 아니기때문
		grapeBox.add(new Grape());
	}
}

					// Fruit의 자손이면서 Eatable를 구현한 객체만.
class FruitBox<T extends Fruit & Eatable> extends Box<T> {}

class Box<T> {
	ArrayList<T> list = new ArrayList<>();
	void add(T item) {list.add(item);}
	T get(int i) {return list.get(i);}
	int size() {return list.size();}
	public String toString() {return list.toString();}
}
