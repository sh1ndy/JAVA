package ch19;

public class MoneyTest {

	public static void main(String[] args) {

		MoneyFactory sinhanBank = MoneyFactory.getInstance();
		Money oManWon = sinhanBank.create();
		Money manWon = sinhanBank.create();
		Money oCheonWon = sinhanBank.create();
		Money cheonWon = sinhanBank.create();

		int oManWonSerialNum = oManWon.getMoneyNum();
		int manWonSerialNum = manWon.getMoneyNum();
		int oCheonWonSerialNum = oCheonWon.getMoneyNum();
		int cheonWonSerialNum = cheonWon.getMoneyNum();

		System.out.println(oManWonSerialNum);
		System.out.println(manWonSerialNum);
		System.out.println(oCheonWonSerialNum);
		System.out.println(cheonWonSerialNum);

	}

}
