package ch13;

public class UserInfoMysqlDao implements UserInfoDao {

	@Override
	public void insert(UserInfo u) {
		System.out.println("Insert into MY-SQL DB user ID = " + u.getId());
	}

	@Override
	public void delete(UserInfo u) {
		System.out.println("Delete into MY-SQL DB user ID = " + u.getId());		
	}

	@Override
	public void update(UserInfo u) {
		System.out.println("Update into MY-SQL DB user ID = " + u.getId());		
	}
	
}
