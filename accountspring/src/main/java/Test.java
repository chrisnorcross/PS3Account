

public class Test {
	public static void main(String[] args){
		Account account = new Account(1122,20000);
		account.setInterestRate(4.5);
		account.deposit(3000);
		try {
			account.withdraw(2500);
		} catch (InsufficientFundsException e1) {
			System.out.println("Sorry, but you are short $"+ e1.getAmount());
		}
		double monthlyInterest = account.getMonthlyInterestRate();
		System.out.println(account.getBalance());
		System.out.println(monthlyInterest);
		System.out.println(account.getDateCreated());
		try{
			System.out.println("\nWithdrawing 30000...");
			account.withdraw(30000);
		}catch(InsufficientFundsException e){
			System.out.println("Sorry, but you are short $" + e.getAmount());
		}
	}

}
