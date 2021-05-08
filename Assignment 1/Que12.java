import java.util.Scanner;
class Que12
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Three Nos :");
		float num1 = sc.nextFloat();
		float num2 = sc.nextFloat();
		float num3 = sc.nextFloat();
		double avg = (num1+num2+num3)/3.0;
		System.out.println("Average :" + avg);
	}
}