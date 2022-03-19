package 쓰레드;

public class 쓰레드05 {
	public static void main(String[] args) {
		// suspend(), resume(), stop()는 Deprecated됨.(교착상태를 일으키기 쉬움)
		// join() : 다른 쓰레드의 작업을 기다림., yield() : 남은시간을 다른 쓰레드에게 양보
		Thread t1 = new Thread(new MyThread6());
		
		for(int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("메인 작업중");
				if(i == 2) {
					t1.start();
					t1.join();
				}
			} catch (Exception e) {}
		}
	}
}

class MyThread6 implements Runnable{
	public void run() {
		for(int i = 0; i < 3; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("T1 작업중");
			} catch (Exception e) {}
		}
	}
}
