import java.util.Scanner;
class Que11
{
	public static void main(String args[])
	{
		System.out.println("For Calculating Area and Perimeter Enter Radius value");
		Scanner sc = new Scanner(System.in);
		double r = sc.nextFloat();
		double a = (22*r*r)/7;
		System.out.println("Area of Circle :"+ a);
		double p =  (2*22*r)/7;
		System.out.println("Perimeter of Circle :"+ p);
	}
}