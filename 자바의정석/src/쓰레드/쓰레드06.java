package 쓰레드;

public class 쓰레드06 {
	public static void main(String[] args) {
		// 쓰레드 동기화(synchronization) : 한 쓰레드가 진행중인 작업을 다른 쓰레드가 간섭하지 못하게하는것.
		// synchronized로 임계영역 지정. (임계영역 : 다른 쓰레드가 간섭하지 못하는 영역. lock이 걸리는 영역)
		// 임계영역은 최소화 하는게 좋다 (사용되는 변수는 private로 해야 의미있음.)
		
		// wait() : 임계영역에서 코드를 실행하다 더이상 실행할 상황이 아니면 진행중이던 쓰레드를 락 반납하고 기다리게함.
		// notify() : 진행할 상황이 되면 다시 락을 얻어 진행할 수 있게 호출
		// 근데 뭔가 구별이 힘들듯.
	}
	
	public synchronized void calcSum() { // 동기화 메서드
		// 임계영역
	}
}
