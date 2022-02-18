package ch13;

public class UserInfoOracleDao implements UserInfoDao {

	@Override
	public void insert(UserInfo u) {
		System.out.println("Insert into ORACLE DB user ID = " + u.getId());		
	}

	@Override
	public void delete(UserInfo u) {
		System.out.println("Delete into ORACLE DB user ID = " + u.getId());				
	}

	@Override
	public void update(UserInfo u) {
		System.out.println("Update into ORACLE DB user ID = " + u.getId());				
	}

}
