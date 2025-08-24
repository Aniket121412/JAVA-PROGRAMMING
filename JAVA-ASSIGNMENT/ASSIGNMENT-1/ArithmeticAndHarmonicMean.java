import java.util.Scanner;

	public class ArithmeticAndHarmonicMean{
	public static void main (String[] args){
	double num1, num2, AM, HM;

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Two NO :");

	num1 = sc.nextDouble();
	num2 = sc.nextDouble();
	
	AM = (num1 + num2) / 2;
	HM = (num1 * num2) / (num1 + num2);

	System.out.println("Arithmetic Mean is :"+ AM);	
	System.out.println("Harmonic Mean is :"+ HM);	
}
}