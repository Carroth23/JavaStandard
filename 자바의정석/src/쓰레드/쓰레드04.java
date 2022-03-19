package 쓰레드;

import javax.swing.JOptionPane;

public class 쓰레드04 {
	public static void main(String[] args) {
		/*
		 * 쓰레드의 상태 	NEW : 쓰레드가 생성되고 아직 start()가 호출되지 않은상태 
		 * 				RUNNABLE : 실행중 또는 실행가능 상태
		 * 				BLOCKED : 동기화블럭에 의해서 일시정지된 상태(lock이 풀리길 기다리는)
		 * 				WAITING : 쓰레드 작업이 종료되지않았지만 실행가능하지 않은(일시정지) 상태
		 * 				TERMINATED : 쓰레드의 작업이 종료된 상태(소멸)
		 */
		
		// sleep() : "현재" 쓰레드를 지정된 시간동안 멈추게함. (static메서드. yield도 있다)
		// Thread.sleep(1000); 1초 동안 슬립. 예외처리 필수.
		// 특정 쓰레드를 지정해서 멈추게 하는것은 불가능. t1.sleep를 해도 결국 (실행한)자기가 잔다.
		
		// interrupt() : 대기상태(WAITING)인 쓰레드를 실행대기(RUNNABLE)로 만든다.
		MyThread5 th1 = new MyThread5();
		System.out.println(th1.isInterrupted());
		th1.start();
		
		String input = JOptionPane.showInputDialog("아무값 입력 ㄱ");
		th1.interrupt();
		System.out.println("입력하신 값은 " + input + "입니다.");
		System.out.println(th1.isInterrupted());
	}
}

class MyThread5 extends Thread{
	public void run() {
		int i = 10;
		while(i != 0 && !isInterrupted()) { // 인터럽트가 되기 전까지
			System.out.println(i--);
			for(long x = 0; x < 2500000000L; x++); // 시간 지연?
		}
		System.out.println("카운트가 종료되었습니다.");
	}
}