import java.util.Scanner;
	public class SwappingOfTwoNo{
	public static void main(String [] args){
	int a, b, temp;

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter A :");
	a = sc.nextInt();
	System.out.println("Enter B :"); 
	b = sc.nextInt();
	
	temp = a;
	a = b;
	b = temp;

	System.out.println("After Swapping using temporary variable A :"+a);
	System.out.println("After Swapping using temporary variable B :"+b);
	
	System.out.println("Enter A :");
	a = sc.nextInt();
	System.out.println("Enter B :"); 
	b = sc.nextInt();
	a = a + b;
	b = a - b;
	a = a - b;

	System.out.println("After Swapping using + and - Operator A :"+a);
	System.out.println("After Swapping using + and - Operator B :"+b);

	System.out.println("Enter A :");
	a = sc.nextInt();
	System.out.println("Enter B :"); 
	b = sc.nextInt();

	a = a * b;
	b = a / b;
	a = a / b;

	System.out.println("After Swapping using * and / Operator A :"+a);
	System.out.println("After Swapping using * and / Operator B :"+b);
}
}