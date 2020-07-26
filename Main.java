package banking;
    import java.util.Scanner;
	
	public class Main
	{
		public static void main(String[] args) {
		    int balance=10000;
			Scanner sc=new Scanner(System.in);
			Solution s=new Solution(balance);
			String op="y";
			while(true)
			{
				
			    System.out.println("Enter your choice-1.Withdraw");
			    System.out.println("2.deposit");
			    System.out.println("3.Check balance");
			    int ch=sc.nextInt();
			    switch(ch)
			    {
			        case 1:
			        	
			            System.out.println("enter amount");
			            int amt=sc.nextInt();
			          
			            
			            if(amt<=5000)
			            {
			                int o=s.Withdraw(balance,amt);
			                balance=o;
			               
			            }
			            else{
			                System.out.println("The limit is 5000, Withdraw attempt failed");
			            }
			            
			            
			            break;
			        case 2:
			            System.out.println("enter the amount t deposit");
			            int a=sc.nextInt();
			            int o=s.Deposit(balance,a);
			            balance=o;
			          
			            break;
			        case 3:
			            int b=s.CheckBalance();
			            System.out.println("Your account balance:"+b);
			            break;
			        
			    }
			  
			    System.out.println("enter c to continue, e to exit");
			    String c=sc.next();
			    if(c.equals("n"))
			    break;
			    
			}
		}
	}

