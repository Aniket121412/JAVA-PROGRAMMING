import java.util.Scanner;
	public class CheckNoisPositive{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the No :");
	int no = sc.nextInt();

	if(no > 0)
		System.out.println(no+" no is positive");
	else
		System.out.println(no+" no is not positive");
}
}