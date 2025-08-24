import java.util.Scanner;

	public class SurfaceAreaAndVolumeOfCylinder{
	public static void main(String[] args){
	float r,h;
	double surfaceArea,volume;

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the Radius :");
	r = sc.nextFloat();

	System.out.println("Enter the Height :");
	h = sc.nextFloat();

	surfaceArea = 2 * Math.PI * r * r + 2 * Math.PI * r * h;

	volume = Math.PI * r * r * h;

	System.out.println("Surface Area Of Cylinder = "+ surfaceArea);
	System.out.println("Volume Of Cylinder = "+ volume);
}	
}