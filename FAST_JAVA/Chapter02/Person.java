package ch08;

public class Person {
	
	int height;
	int weight;
	String gender;
	String name;
	int age;
	
	Person() {
		
	}
	
	Person(int height, int weight, String gender, String name, int age) {
		this.height = height;
		this.weight = weight;
		this.gender = gender;
		this.name = name;
		this.age = age;
	}
	
	String personShowInfo() {
		String info = "Ű��" + height + "�̰� �����԰�" + weight + " ų���� " + gender + "�� �ֽ��ϴ�. �̸��� " + name + " �̰� ���̴� " + age + "���Դϴ�." ;
		return info;
	}

}
