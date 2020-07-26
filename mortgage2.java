
	import java.text.NumberFormat;
	import java.util.Scanner;
	public class mortgage {


		public static void main(String[] args) {
			 byte months=12;
			 byte percent=100;
			 double mortgage1;
			 int principal=0;
			 float monthlyInterst=0;
			 int numberOfPayments=0;
			 
			Scanner scanner=new Scanner(System.in);
			while(true)
				
				while (true) {
					System.out.print("Principal: ");
					principal = scanner.nextInt();
					if (principal >= 1000 && principal <= 1_000_000)
						break;
					System.out.println("Enter a value between 1000 and 1000000");
				}

				   while (true) {
				    	System.out.print("Rate: ");
					float annualInterest = scanner.nextFloat();
					if (annualInterest >= 1 && annualInterest <= 30) {
						monthlyInterst = annualInterest /percent / months;
						break;
					}
					System.out.println("Enter a value between 1 and 30");
				}

				while (true) {
					System.out.print("Period (Years): ");
					byte years = scanner.nextByte();
					if (years >= 1 && years <= 30) {
						numberOfPayments = years * months;
						break;
					}
					System.out.println("Enter a value between 1 and 30.");
				}


			
		
			double mortgage1=principal*(monthlyInterst*Math.pow(1+monthlyInterst,numberOfPayments))/(Math.pow(1+monthlyInterst,numberOfPayments)-1);
			String mortgageFormatted=NumberFormat.getCurrencyInstance().format(mortgage1);
			System.out.println("mortgage:" +mortgageFormatted);
		  }

	}


