package ch13;

import java.util.Comparator;

public class Member implements Comparator<Member> {

	int memberId;
	private String memberName;
	
	public Member() {
		
	}

	public Member(int memberId, String memberName) {
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
		return memberName + "���� ���̵�� " + memberId + "�Դϴ�.";
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

	@Override
	public int compare(Member member1, Member member2) {
		return (member1.memberId - member2.memberId);
	}
	

	// comparable ����
//	@Override
//	public int compareTo(Member member) {
//		
//		// �Ʒ� ���ϰ�2���� ������ �ڵ�
////		if (memberId > member.memberId) {
////			return 1;
////		} else if (memberId < member.memberId) {
////			return -1;
////		} else {
////			return 0;
////		}
//		
//		return (memberId - member.memberId); // ��������
////		return (memberId - member.memberId) * (-1); // ��������
//	}
	
}
