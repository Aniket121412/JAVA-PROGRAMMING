import java.util.Scanner;
	public class  CheckTriangleValidOrNot{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first side of Triangle :");
	int ab = sc.nextInt();
	System.out.println("Enter second side of Triangle :");
	int bc = sc.nextInt();
	System.out.println("Enter third side of Triangle :");
	int ac = sc.nextInt();

	if((ab + bc) > ac && (ab + ac) > bc && (ab + bc) > ac)
		System.out.println("Triangle is valid !!");
	else 
		System.out.println("Triangle is not valid !!");
}
}