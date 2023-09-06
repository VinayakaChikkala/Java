
public class methods {
	static int currentbalance = 1000;

	public static void greetcusttomar() {
		System.out.println("Hellow sir welcom to the bank");
	}

	void deposite(int amount) {
		currentbalance = currentbalance + amount;
		System.out.println("amount is deposite suscessfully");

	}

	void withdrawal(int amount) {
		currentbalance = currentbalance - amount;
		System.out.println("amount is withdrawal suscessfully");

	}

	public int getcurrentbalance() {
		return currentbalance;
	}

	public static void main(String args[]) {
		methods vinay = new methods();
		greetcusttomar();
		System.out.println("current balance is- " + vinay.getcurrentbalance());
		vinay.deposite(500);
		System.out.println("current balance is -  " + vinay.getcurrentbalance());
		vinay.withdrawal(1000);
		System.out.println("current balance is-  " + vinay.getcurrentbalance());

	}
}
