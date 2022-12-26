package lamp;

/**
 * 전원 끄기 예약이 가능한 책상 조명
 */
public class TimerDeskLamp extends DeskLamp implements Runnable{

    final static int DELAY_MILLISECOND = 5000;

    private Thread offDelayThread; // 전원 끄기 예약 쓰레드
    private Thread previousThread;

    // TODO - TimerDeskLamp 클래스의 나머지 코드를 구현해 주세요.
    public void offDelay() {
    	if(previousThread != null) {
    		previousThread.interrupt();
    	}
    	offDelayThread = new Thread(this);
    	offDelayThread.start();
    	previousThread = offDelayThread;
    }
    
    @Override
    public void run() {
//    	예약 여부 확인
    	while(true) {
    		try {
				Thread.sleep(DELAY_MILLISECOND);
			} catch (InterruptedException e) {
				System.out.println("타이머 리셋");
				break;
			}
    		turnOff();
    		previousThread = null;
    		break;
    	}
    }
}




