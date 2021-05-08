import java.util.Scanner;

class Que15
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("For Swapping of two nos. :");
		
		System.out.println("Enter First No. :");
		int fno=sc.nextInt();
		
		System.out.println("Enter Second No. :");
		int sno=sc.nextInt();
		
		System.out.println("Befor Swapping fno: "+ fno +" and sno: " + sno);
		
		int swap=fno;
		fno=sno;
		sno=swap;
		
		System.out.println("After Swapping fno: "+ fno +" and sno: " + sno);
		
		
	}
}