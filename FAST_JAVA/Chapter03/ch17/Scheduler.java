package ch17;

interface Scheduler {
	
	default void getNextCall() {
		System.out.println("���� ��ȭ�� ������� ��⿭���� �����ɴϴ�.");
	};
	
	void sendCallToAgent();

}
