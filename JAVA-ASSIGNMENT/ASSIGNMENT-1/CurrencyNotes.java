import java.util.Scanner;
public class CurrencyNotes{
public static void main(String [] args){
	int amount, fiveRupee, tenRupee, oneRupee;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the amount to withdraw :");
	amount = sc.nextInt();

	tenRupee = amount / 10;
	amount = amount % 10;
	fiveRupee = amount / 5;
	amount = amount % 5;
	oneRupee = amount;

	System.out.println("10 Rupee Notes :"+tenRupee);
	System.out.println("5 Rupee Notes  :"+fiveRupee);
	System.out.println("1 Rupee Notes  :"+oneRupee);
}
}