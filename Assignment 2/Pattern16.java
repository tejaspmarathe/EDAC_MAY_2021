class Pattern16
{
	public static void main(String args[])
	{
		
		for (int i=1; i<=5; i++)
		{
			for (int j=5; j>=i; j--)
			{
				if( j == 1 || j == i || i == 5)
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
	}
	
}