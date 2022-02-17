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
			System.out.println(name + "학생의 " + subjectList.get(i).getName() + " 점수는 " + subjectList.get(i).getScore() + "점 입니다.");
		}
		System.out.println(name + "학생의 총 점은 " + total + "점 입니다.");
	}

}
