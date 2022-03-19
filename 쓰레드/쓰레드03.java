package 쓰레드;

public class 쓰레드03 {
	public static void main(String[] args) {
		// 데몬쓰레드 : 일반쓰레드의 작업을 돕는 보조쓰레드.(일반쓰레드가 아닌 쓰레드는 모두 데몬쓰레드)
		// 일반쓰레드가 모두 종료되면 자동적으로 종료됨.
		Thread t1 = new Thread(new NomalThread());
		Thread t2 = new Thread(new DThread());
		
		t2.setDaemon(true); // 데몬쓰레드로 만드는것. start 전에 해줘야함.
		
		t1.start();
		t2.start();
		
		System.out.println("t2는 데몬입니까? " + t2.isDaemon());
		
		for(int i = 10; i > 0; i--) {
			try {
				Thread.sleep(1000);
				System.out.println("폭탄해제 남은 예상 시간 : " + i + "초");
			} catch (Exception e) {}
		}
	}
}

class NomalThread implements Runnable{
	public void run() {
		for(int i = 7; i > 0; i--) {
			try {
				Thread.sleep(1000);
				System.out.println(i + "초 후 폭발");
			} catch (Exception e) {}
		}
	}
}

class DThread implements Runnable{
	public void run() {
		for(int i = 7; i > 0; i--) {
			try {
				Thread.sleep(1000);
				if(i == 2) {
					System.out.println("해제 성공");
				}
			} catch (Exception e) {}
		}
	}
}
