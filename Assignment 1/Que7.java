import java.util.Scanner;

class Que7
{
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a No:");
			int num = sc.nextInt();
			int ans;
			for(int i=1;i<=10;i++)
			{    
				ans = num * i;
				System.out.println(num + "*" + i + "=" + ans);
			}
		
		}
}