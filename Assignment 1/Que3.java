import java.util.Scanner;
class Que3
{
	public static void main(String args[])
	{
 		Scanner sc = new Scanner(System.in);
 		System.out.println("Enter Two Nos for Division");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int div = num1 / num2;
		System.out.println("Division :" +div);
	}


}