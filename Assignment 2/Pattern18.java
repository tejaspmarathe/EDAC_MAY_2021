class Pattern18
{
	public static void main(String args[])
	{
		
		for(int i=1;i<=5;i++)
		{
			char alpha=64;
			for(int j=5;j>=i;j--)
			{
				alpha++;
				System.out.print(alpha + " ");
			}
			
			System.out.println();
			
		}
	}
}