import java.text.NumberFormat;
import java.util.Scanner;

public class Activitymortgage1 {

	public static void main(String[] args) {
		 byte months=12;
		 byte percent=100;
		 double mortgage;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Principal:");
		int principal=scanner.nextInt();
		System.out.print("Rate :");
		
		
		float annualInterst =scanner.nextFloat();
		float monthlyInterst=annualInterst/percent/months;
		System.out.print("period :");
		byte years =scanner.nextByte();
		int numberofpayments=years*months;
		mortgage=principal*(monthlyInterst*Math.pow(1+monthlyInterst,numberofpayments))/(Math.pow(1+monthlyInterst,numberofpayments)-1);
		String mortgageFormatted=NumberFormat.getCurrencyInstance().format(mortgage);
		System.out.println("Mortgage:" +mortgageFormatted);
	  }

}
