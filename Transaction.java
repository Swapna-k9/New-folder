package banking;


	public interface Transaction
	{
		
		   abstract int Withdraw(int bal,int amount);
		    abstract int Deposit(int bal,int amount);
		    abstract int CheckBalance();
	}
	    