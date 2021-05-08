import java.util.Scanner;
class Que13
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("For Calculating Area and Perimeter Of Rectangle :");
		
		System.out.println("Enter Width :");
		float width=sc.nextFloat();

		System.out.println("Enter Height :");
		float height=sc.nextFloat();
		
		float area = width*height;
		System.out.println("Area:" + area);
		
		float perimeter = 2*(width+height);
		System.out.println("perimeter:"+ perimeter);
		
		
		
	}
}