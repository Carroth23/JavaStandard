package 쓰레드;

public class 쓰레드01 {
	public static void main(String[] args) {
		// 프로세스 : 실행프로그램, 쓰레드 : 일꾼
		// 멀티쓰레딩의 장점 : CPU사용률 향상, 효율적 자원사용, 응답성 향상, 작업분리로 인한 코드간결
		// 멀트쓰레딩의 단점 : 동기화에 주의, 교착상태(데드락)발생 주의, 기아현상 주의
		// 교착상태 : 두 쓰레드가 자원을 점유한 상태에서 서로 상대편이 점유한 자원 사용하려고 기다리느라 진행이 멈춘상태
		
		// 쓰레드 사용
		MyThread t1 = new MyThread();
		t1.start();
		
//		Runnable r = new MyThread2();
//		Thread t2 = new Thread(r);
		Thread t2 = new Thread(new MyThread2());
		t2.start();
		
		// 쓰레드의 순서는 OS의 스케쥴러에 의해 결정된다.
		// start() 호출한 후에 다시 호출 불가. 한번 더 new해줘야함.
		// start() 메서드는 새로운 호출스택을 만들고 거기에 run()을 올린뒤 종료됨. (중요)
	}
}
//쓰레드 구현방법
// 1. Thread 클래스를 상속
class MyThread extends Thread{
	public void run() {
		System.out.println("Thread를 상속받은 클래스입니다.");
	}
}

// 2. Runnable 인터페이스를 구현 <- 추천
class MyThread2 implements Runnable{
	public void run() {
		System.out.println("Runnable를 구현한 클래스입니다.");
	}
}