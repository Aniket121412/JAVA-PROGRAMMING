import java.util.Scanner;
	public class SalaryCalculationOfemp{
	public static void main(String [] args){
	int id;
	double basicSalary, hra, da, tax, homeSalary; 
	
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Emp ID :");
	id = sc.nextInt();

	System.out.println("Enter Basic Salary :");
	basicSalary = sc.nextDouble();

	hra = 10.0 /100.0 * basicSalary;
	da =  30.0 /100.0 * basicSalary;
	tax = 5.0 /100.0 * basicSalary;
	homeSalary = basicSalary + hra + da - tax;

	System.out.println("\n----- Emp Salary Details -----");
	System.out.println("EMP ID       :"+id);
	System.out.println("BASIC SALARY :"+basicSalary);
	System.out.println("HRA (10%)    :"+hra);
	System.out.println("DA (30%)     :"+da);
	System.out.println("TAX (5%)     :"+tax);
	System.out.println("HOME SALARY  :"+homeSalary);
	
}
}