import java.util.Scanner;

class Que6
{
	public static void main(String args[])
	{   
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First No :");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Second No :");
		int num2 = sc.nextInt();
		
		int add = num1 + num2;
		System.out.println(add);
		
		int sub = num1 - num2;
		System.out.println(sub);
		
		int mul = num1 * num2;
		System.out.println(mul);
		
		int div = num1 / num2;
		System.out.println(div);
		
		int rem = num1 % num2;
		System.out.println(rem);
		
		
		
	
	}
}