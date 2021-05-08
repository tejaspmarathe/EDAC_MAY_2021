class PyramidPattern
{
	public static void main(String args[])
	{
		//Pyramid Pattern 1
		/*for(int i=1;i<=9;i++)
		{
			for(int j=8;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(" "+ i);
			}
			System.out.println();
		}*/
		
		/*//Pyramid Pattern 2
		for(int i=1;i<=9;i++)
		{
			for(int j=8;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(" "+ k);
			}
			System.out.println();
		}*/
		
		/*//Pyramid Pattern 3
		for(int i=1;i<=9;i++)
		{
			for(int j=8;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(" "+ "*");
			}
			System.out.println();
		}*/
		
		//Pyramid Pattern 4
		
		/*for(int i=1;i<=9;i++)
		{
			for(int j=9;j>=i;j--)
			{
				System.out.print("  ");
			}

			for(int k=1;k<=i;k++)
			{
				System.out.print(k+" ");
			}

			for(int j=i;j>=2;j--)
			{
				System.out.print((j-1)+" ");
			}
			System.out.println();
		}*/
		
		
		/*//Pyramid Pattern 5
		
		int n=9;
		for (int i = n; i >= 1; i--)
        {
            for (int j = 1; j <= i*2; j++)
            {
                System.out.print(" ");
            }

            for ( int j = i; j <= n; j++)          
            {
                System.out.print(j+" ");
            }
			
            for (int j = n-1; j >= i; j--)
            {               
                System.out.print(j+" ");            
            }
             
			 System.out.println();
		}*/
		
		
		/*//Inverted Pyramid Pattern 6
		for(int i=1;i<=9;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=9;k>=i;k--)
			{
				System.out.print(" "+ "*");
			}
			System.out.println();
		}*/
		
		
		//Inverted Pyramid Pattern 7
			
		/*int num =10;
		for(int i=1;i<=9;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			num--;
			for(int k=9;k>=i;k--)
			{
				System.out.print(" "+ num);
			}
			System.out.println();
		}*/
		
		
		
	}


}