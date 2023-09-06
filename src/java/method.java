package java;

public class method 
{    
	static int currentbalance=1000;
	public static void greetings()
	{
		System.out.println("wellcome to the banking application");
	}
	public void deposite(int amount)
	{
		currentbalance=currentbalance+amount;
		System.out.println("Amount deposite successfully");
	}
	public void withdrawel(int amount)
	{
		currentbalance=currentbalance-amount;
		System.out.println("Amount withdrawel successfully");
	}
	public int getbalance()
	{
		return currentbalance;
	}
	public static void main(String args[])
	{  
		method M=new method();
		greetings();
		M.deposite(1000);
		System.out.println("your balance is"+currentbalance);
		M.withdrawel(100);
		System.out.println("your balance is"+currentbalance);
		
		
		
		
		
	}
}