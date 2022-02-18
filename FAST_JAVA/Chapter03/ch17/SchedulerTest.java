package ch17;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		
		System.out.println("��ȭ ��ٿ� �Ҵ� ����� �����ϼ���.");
		System.out.println("R : �Ѹ� ���ʴ��");
		System.out.println("L : ����� ���� ���� �켱");
		System.out.println("P : �켱������ ���� ���켱 ���õ� ���� ����");
		
		int ch = System.in.read();
		Scheduler scheduler = null;
		
		if (ch == 'R' || ch == 'r') {
			scheduler = new RoundRobin();
		} else if (ch == 'L' || ch == 'l') {
			scheduler = new LeastJob();
		} else if (ch == 'P' || ch == 'p') {
			scheduler = new PriorityAllocation();
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}

}
