import java.util.Scanner;
	public class CheckNoIsPositiveOrNegative{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no :");
	int no = sc.nextInt();
	
	if(no > 0)
		System.out.println(no+" is Positive");
	else if (no < 0)
		System.out.println(no+" is Negative");
	else 
		System.out.println(no+" no is Zero");
}
}