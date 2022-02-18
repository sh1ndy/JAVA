package ch17;

interface Scheduler {
	
	default void getNextCall() {
		System.out.println("상담원 전화를 순서대로 대기열에서 가져옵니다.");
	};
	
	void sendCallToAgent();

}
