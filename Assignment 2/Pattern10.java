class Pattern10
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			char alpha='E';
			for(int k=1;k<=i;k++)
			{
				System.out.print(" "+alpha);
				alpha--;
			}
			System.out.println();
			
		}
	}
}