import java.util.Scanner;

	public class FinalVelocityAndDistanceTravelled{
	public static void main(String [] args){
	
	double velocity, acceleration, time, finalVelocity, distance;
	
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Enter the Velocity (u) :");
	velocity = sc.nextDouble();

	System.out.println("Enter the Acceleration (a) :");
	acceleration = sc.nextDouble();

	System.out.println("Enter the Time (t) :");
	time = sc.nextDouble();

	finalVelocity = velocity + (acceleration * time);
	distance = (velocity * time) + (1.0 / 2.0) * (acceleration * time * time);

	System.out.println("Final Velocity(v) =" +finalVelocity);
	System.out.println("Distance Travelled(s) =" +finalVelocity);
}
}