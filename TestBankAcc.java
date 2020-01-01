public class TestBankAcc
{
	public static void main(String args[])
	{
		BankAccount ba = new BankAccount();
		BankAccount ba1 = new BankAccount();
		ba.deposite(1500);
		ba.deposite(1000);
		ba1.deposite(1000);	
		
		System.out.println("Balance = "+ba.getBalance());
		System.out.println("Balance = "+ba1.getBalance());
		System.out.println("Amount = "+ba.getAmount());
		ba.withdraw(500);
		System.out.println("Balance = "+ba.getBalance());
		System.out.println("Amount = "+ba.getAmount());
		
	}
}