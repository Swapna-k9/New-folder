package banking;


	class Solution implements Transaction
	{
	    int balance;
	    Solution(int balance)
	    {
	        this.balance=balance;
	    }
	    public int Withdraw(int bal,int amount)
	    {
	        balance=bal-amount;
	        return balance;
	    }
	    public int Deposit(int bal,int amount)
	    {
	        balance=bal+amount;
	        return balance;
	    }
	    public int CheckBalance()
	    {
	        return balance;
	    }
		
	}
