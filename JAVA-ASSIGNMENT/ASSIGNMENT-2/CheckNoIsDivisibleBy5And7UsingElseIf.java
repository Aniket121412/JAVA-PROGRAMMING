import java.util.Scanner;
	public class CheckNoIsDivisibleBy5And7UsingElseIf{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter no :");
	int no = sc.nextInt();
	if(no % 5 == 0)
		System.out.println(no+" is Divisible by 5");
	else if(no % 7 == 0)
		System.out.println(no+" is Divisible by 7");
	else 
		System.out.println(no+" is not Divisible by 5 or 7");
}
}