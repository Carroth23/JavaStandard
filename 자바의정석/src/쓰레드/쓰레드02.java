package 쓰레드;

import javax.swing.JOptionPane;

public class 쓰레드02 {
	public static void main(String[] args) { // main 얘도 쓰레드다
		// 프로그램이 종료되는 시점 : 실행중인 쓰레드가 하나도 없을때
		// 멀티쓰레드로 수행한 작업이 싱글쓰레드사용보다 오래걸릴수도 있는데, 이건 컨텍스트 스위칭때문(쓰레드간의 작업전환)
		
		// 쓰레드의 I/O블락킹 : 입출력시 작업중단(멀티쓰레드로 해결)
		Thread t1 = new Thread(new ThreadProc());
		t1.start();
		
		String input = JOptionPane.showInputDialog("I/O 블락킹중..");
		System.out.println("입력값 : " + input);
		
		// 쓰레드의 우선순위 : 1 ~ 10
		System.out.println("t1쓰레드의 우선순위 : " + t1.getPriority());
		t1.setPriority(10); //우선순위 설정
		
		// 쓰레드그룹 : 서로 관련된 쓰레드를 그룹으로 묶어서 관리하는것.
		// 모든 쓰레드는 반드시 하나 이상의 쓰레드 그룹에 속함.
		// 지정없이 생성하면 main쓰레드그룹에 속한다. 
		// 자신을 생성한 쓰레드(부모 쓰레드)의 그룹과 우선순위를 상속받는다.
	}
}

class ThreadProc implements Runnable{
	public void run() {
		for(int i = 5; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch(Exception e) {}
		}
	}
}