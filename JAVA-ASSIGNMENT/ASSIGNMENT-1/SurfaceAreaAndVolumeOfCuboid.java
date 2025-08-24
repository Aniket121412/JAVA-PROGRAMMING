import java.util.Scanner;

	public class SurfaceAreaAndVolumeOfCuboid{
	public static void main(String [] args){
	double l, b, h, surfaceArea, volume;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Length(l) :");
	l = sc.nextDouble();

	System.out.println("Enter the Breadth(b) :");
	b = sc.nextDouble();


	System.out.println("Enter the Height(h) :");
	h = sc.nextDouble();
	
	surfaceArea = 2 * (l * b + l * h + b * h);
	volume = l * b * h;

	System.out.println("Surface Area of Cuboid is :"+surfaceArea);
	System.out.println("Volume of Cuboid is :"+volume);
}
}