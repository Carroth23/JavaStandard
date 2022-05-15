package ch12_지네릭스;

import java.util.ArrayList;
import java.util.HashSet;

class Product2{}
class Tv2 extends Product2{}
class Audio2 extends Product2{}
class Human{}

public class 지네릭스03 {
	public static void main(String[] args) {
		// 와일드카드 : 지네릭 타입에 다형성을 적용할 수 있는 방법
		// <? extends T> T와 그 자손들만 가능.(많이씀)
		// <? super T> T와 그 조상들만 가능
		// <?> 제한없음 <? extends Object>와 동일
	
		ArrayList<? extends Product2> list = new ArrayList<Tv2>(); // 자손이기에 가능
		HashSet<? extends Product2> set = new HashSet<Audio2>(); // 마찬가지
		ArrayList<? super Tv2> list2 = new ArrayList<Product2>(); // 조상
//		ArrayList<? extends Product> list3 = new ArrayList<Human>(); 에러
		HashSet<?> list3 = new HashSet<Human>();
	}
	
	public void proc(Proc<? extends Tv2> pro) { // 매개변수에도 적용가능(지네익타입클래스만)
		
	}
}
class Proc<T>{
	<T> void proc() { // 지네릭 메서드. 클래스의 타입변수와는 다른 타입변수다 메서드 T는 메서드 안에서만 사용가능
		// 제네릭 메서드는 보통 제네릭 타입을 매개변수나 리턴타입에서 다 씀
	}
}
class Proc2<String>{ // 타입이 달라도 가능
	<Integer> void proc2() {
		
	}
}