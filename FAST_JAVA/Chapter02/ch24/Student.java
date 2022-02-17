package ch24;

import java.util.ArrayList;

public class Student {
	
	private String name;
	private int number;
	ArrayList<Subject> subjectList;
	Subject subject;
	
	public Student(int number, String name) {
		this.number = number;
		this.name = name;
		
		subjectList = new ArrayList<>();
	}
	
	public void addSubject(String name, int score) {
		subject = new Subject();
		subject.setName(name);
		subject.setScore(score);
		subjectList.add(subject);
	}
	
	public void showScoreInfo() {
		int total = 0;
		
		for(int i = 0; i < subjectList.size(); i++) {
			total += subjectList.get(i).getScore();
			System.out.println(name + "�л��� " + subjectList.get(i).getName() + " ������ " + subjectList.get(i).getScore() + "�� �Դϴ�.");
		}
		System.out.println(name + "�л��� �� ���� " + total + "�� �Դϴ�.");
	}

}
