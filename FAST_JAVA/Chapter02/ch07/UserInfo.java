package ch07;

public class UserInfo {
	
	String userId;
	String userPassword;
	String userName;
	String userAddress;
	String phoneNumber;
	
	UserInfo() {
		
	}
	
	UserInfo(String userId, String userPassword, String userName, String userAddress, String phoneNumber) {
		this.userId = userId;
		this.userPassword = userPassword;
		this.userName = userName;
		this.userAddress = userAddress;
		this.phoneNumber = phoneNumber;
	}
	
	public String userShowInfo() {
		String showInfo = userName + "���� ���̵�� " + userId + "�̰�, ��й�ȣ�� " + userPassword + "�Դϴ�. \n" + "�ּҴ� " + userAddress + "�̰�, �޴��� ��ȣ�� " + phoneNumber; 
		return showInfo;
	}
	
	public void userShowInfoReturnVoid() {
		System.out.println(userName + "���� ���̵�� " + userId + "�̰�, ��й�ȣ�� " + userPassword + "�Դϴ�.\n" + "�ּҴ� " + userAddress + "�̰�, �޴��� ��ȣ�� " + phoneNumber);
	}

}
