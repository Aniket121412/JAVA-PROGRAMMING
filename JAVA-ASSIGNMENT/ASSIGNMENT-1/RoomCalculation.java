import java.util.Scanner;
	public class RoomCalculation{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Dimension of room");
	System.out.println("Enter the height :");
	double h = sc.nextDouble();
	System.out.println("Enter the width :");
	double w = sc.nextDouble();
	System.out.println("Enter the length :");
	double l = sc.nextDouble();

	System.out.println("Enter the Dimension of Door :");
	System.out.println("Enter the length :");
	double dl = sc.nextDouble();
	System.out.println("Enter the height :");
	double dh = sc.nextDouble();
	
	System.out.println("Enter the Dimension of Window :");
	System.out.println("Enter the length :");
	double wl = sc.nextDouble();
	System.out.println("Enter the height :");
	double wb = sc.nextDouble();

	double wallArea = 2 * (l + w) * h;
	double doorArea = dl * dh;
	double windowArea = 2 * wl * wb ;

	double paintArea = wallArea - (doorArea + windowArea);
	double whitewashed = l * w;
	
	System.out.println("painted Area :"+paintArea+" square units");
	System.out.println("whitewashed Area (roof) :"+whitewashed+" square units");
}
}

	

