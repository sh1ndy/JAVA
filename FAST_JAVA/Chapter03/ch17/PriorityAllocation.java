package ch17;

public class PriorityAllocation implements Scheduler {

	@Override
	public void sendCallToAgent() {
		System.out.println("VIP 고객님의 전용 상담원에게 배분합니다.");
	}

}
