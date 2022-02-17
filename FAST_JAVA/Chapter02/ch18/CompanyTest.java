package ch18;

public class CompanyTest {

	public static void main(String[] args) {

		Company psCompany = Company.getInstance();
		Company eqCompany = Company.getInstance();
		
		System.out.println(psCompany);
		System.out.println(eqCompany);
		
	}

}
