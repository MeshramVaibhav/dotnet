public class BankAccount
{
	static double amount;
	int accno;
	String Name;
	double balance;
	
	public void withdraw(double a)
	{
		amount = amount-a;
		balance = balance-a;		
	}
	public void deposite(double a)
	{
		amount=amount+a;
		balance = balance+a;	
				
	}
	public double getBalance()
	{
		return balance;		
	}
	public static double getAmount()
	{
		return amount;		
	}
}