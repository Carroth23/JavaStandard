package ch12_지네릭스;

import java.util.ArrayList;

public class 지네릭스01 {

	public static void main(String[] args) {
		// 지네릭스 : 컴파일시 타입체크를 해주는 기능
		// 장점 : 타입 안정성을 높이고, 형변환의 번거로움이 사라짐.
		// 타입 안정성 : 의도치않은 타입객체 저장을 막고, 꺼낼때 다른타입으로 형변환 될 수 있는 오류를 줄여줌
//		ArrayList<Tv> tvList = new ArrayList<>(); Tv객체만 저장가능한 리스트
		// <> 안에 있는것이 타입변수.
		
		// Box<T> 	지네릭 클래스, 'T의 Box'또는 'T Box'라고 읽는다
		// T		타입 변수 또는 타입 매개변수.(T는 타입 문자)
		// Box 		원시 타입(raw type)
		
		// 제네릭과 다형성
		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayList<Tv> tvList = new ArrayList<Tv>();
//		ArrayList<Product> tvList2 = new ArrayList<Tv>(); 에러. 지네릭타입 다름
//		List<Tv> tvList3 = new ArrayList<Tv>(); OK.
		
		productList.add(new Tv());	// public boolean add(E e)
		productList.add(new Audio());
		
		tvList.add(new Tv());
//		tvList.add(new Audio()); 에러 다형성
		
		printAll2(productList);
//		printAll2(tvList); 에러. ArrayList<Tv>가 ArrayList<Product>에 들어갈 수 없기때문
	}
	public static void printAll2(ArrayList<Product> list) {
		for (Product p : list)
			System.out.println(p);
	}

}

class Product {}
class Tv extends Product {}
class Audio extends Product {}
