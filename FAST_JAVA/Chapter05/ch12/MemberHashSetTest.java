package ch12;

public class MemberHashSetTest {

	public static void main(String[] args) {
		
		// 순서가 없고 중복이 안됨  -> HashSet
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(1001, "이순신");
		Member memberKim = new Member(1002, "김유신");
		Member memberKang = new Member(1003, "강감찬");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberKang);
		memberHashSet.showAllMember();
		
		Member memberHong = new Member(1003, "홍길동");
		memberHashSet.addMember(memberHong);
		memberHashSet.showAllMember();
		
	}

}
