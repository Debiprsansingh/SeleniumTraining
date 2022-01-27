package javapractice_interview;

public class Pattern5 {
 /*
  * 1 2 3 4 5
  * 2 4 6 8 10
  * 3 6 9 12 15
  * 4 8 12 16 20
  */
	public static void main(String[] args) 
	{
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(i*j + " ");
				
				
			}
			
			System.out.println();
		}
		
		

	}

}