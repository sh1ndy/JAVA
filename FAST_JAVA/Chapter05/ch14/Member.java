package ch14;

public class Member {

	int memberId;
	private String memberName;

	public Member(int memberId, String memberName) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}
	
	public String getMemberName() {
		return memberName;
	}

	@Override
	public String toString() {
		return memberName + "님의 아이디는 " + memberId + "입니다.";
	}

	@Override
	public int hashCode() {
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Member) {
			Member member = (Member) obj;
			if(memberId == member.getMemberId()) {
				return true;
			} else {
				return false;
			}
		}
		
		return false;
	}
	
}
