import java.util.Scanner;

	public class TemperatureConversion{
	public static void main(String [] args){
	double fahrenheit,kelvin,celsius;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Temperature in Fahrenheit :");
	fahrenheit = sc.nextDouble();
	
	celsius = (5.0/9.0)*(fahrenheit-32);
	kelvin = celsius + 273.15;

	System.out.println("Temperature in Celsius(C) is :"+ celsius);
	System.out.println("Temperature in kelvin(C) is :"+ kelvin);
}
}