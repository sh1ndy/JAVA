package ch14;

import java.util.HashMap;

public class MemberHashMapTest {
	

	public static void main(String[] args) {

		
		// ������ �����ϵ� �ߺ��� �ȵ� -> TreeSet
		// ������ �ɷ��� comparable implements �ؾ���
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberHong = new Member(1004, "ȫ�浿");
		Member memberLee = new Member(1001, "�̼���");
		Member memberKim = new Member(1002, "������");
		Member memberKang = new Member(1003, "������");
		
		
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberKim);
		memberHashMap.addMember(memberKang);
		memberHashMap.addMember(memberHong);
		
		memberHashMap.showAllMember();
		
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1001, "kim");
		hashMap.put(1002, "lee");
		hashMap.put(1003, "park");
		hashMap.put(1004, "hong");
		System.out.println(hashMap.toString());
		
 
		 
		
	}

}
