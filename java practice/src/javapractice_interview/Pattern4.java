package javapractice_interview;

public class Pattern4
{
/*	
2 4 6 8
- - - -	
- - - -	
- - - -	
- - - -	
*/
	static int k=2;
	static int sum=2;
	


	public static void main(String[] args) {
		
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(Pattern4.k + "      ");
				Pattern4.k=Pattern4.k+sum;
			}
			System.out.println();
		}
		

}
}
