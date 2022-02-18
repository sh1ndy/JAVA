package ch17;

public class LeastJob implements Scheduler {

	@Override
	public void sendCallToAgent() {
		System.out.println("상담 진행하고 있지 않는 삼담원에게 배분합니다.");
	}

}
