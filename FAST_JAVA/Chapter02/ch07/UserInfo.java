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
		String showInfo = userName + "님의 아이디는 " + userId + "이고, 비밀번호는 " + userPassword + "입니다. \n" + "주소는 " + userAddress + "이고, 휴대폰 번호는 " + phoneNumber; 
		return showInfo;
	}
	
	public void userShowInfoReturnVoid() {
		System.out.println(userName + "님의 아이디는 " + userId + "이고, 비밀번호는 " + userPassword + "입니다.\n" + "주소는 " + userAddress + "이고, 휴대폰 번호는 " + phoneNumber);
	}

}
