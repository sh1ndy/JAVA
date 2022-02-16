package ch07;

public class UserInfoTest {

	public static void main(String[] args) {

		UserInfo userKim = new UserInfo("1000", "1q2w3e", "Kim", "Republic Korea", "+82 0000-1111");
		String userKimInfo = userKim.userShowInfo();
		System.out.println(userKimInfo);
		
		UserInfo userLee = new UserInfo("1001", "asdf123", "Lee", "United Stats", "+12 1111-2222");
		userLee.userShowInfoReturnVoid();
		
	}

}
