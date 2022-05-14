package ch11_컬렉션프레임웍;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Stack_Queue {

	public static void main(String[] args) {
		// Stack (클래스)
		// 마지막에 저장한 데이터를 가장 먼저꺼내게 되는 LIFO(Last In Fist Out)구조
		// 양 옆과 밑에가 막힌 박스에 순서대로 넣고 위에부터 꺼낸다고 생각
		// Stack는 ArrayList같은것이 적함.(어차피 뒤에서 부터 꺼내니까)
		// Stack의 Search는 인덱스가 1부터 시작
		Stack st = new Stack();
		st.push("0");
		st.push("1");
		st.push("2");
		System.out.println("== Stack ==");
		System.out.println(st);
		System.out.println(st.pop()); // 하나씩 꺼내기
		System.out.println(st.pop());
		System.out.println(st.peek()); // 꺼내지는 않고 보기만 하기
		System.out.println(st);
		System.out.println(st.pop());
		System.out.println(st.empty());
		
		// Queue (인터페이스)
		// 처음 저장한 데이터를 가장 먼저 꺼내제 되는 FIFO(First In First Out)구조
		// 양 옆이 막혀있고 위아래가 뚫린 박스에 넣은순서대로 밑으로 빠진다고 생각
		// Queue는 추가 / 삭제가 쉬운 LinkedList가 적함 (꺼낼때마다 당겨오면 비효율적)
		Queue q = new LinkedList(); // Queue 인터페이스의 구현체인 LinkedList사용
		q.offer("0");
		q.offer("1");
		q.offer("2");
		System.out.println("== Queue ==");
		System.out.println(q.poll()); // poll은 비어있으면 null(remove()는 비어있으면 예외발생)
		System.out.println(q.poll());
		System.out.println(q.peek()); // 꺼내지는 않고 보기만 하기
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q.isEmpty());
		
	}

}
