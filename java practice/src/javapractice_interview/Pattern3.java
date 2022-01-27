package javapractice_interview;

public class Pattern3 {
/*
1 3 5 7
- - - -
- - - -
- - - -
- - - -
*/
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=1;
		int sum=2;
		for (int i=1;i<5;i++)
		{
			for(int j=1;j<5;j++)
			{
				System.out.print(k + " ");
				k=k+sum;
			}
			System.out.println();
		}
		
	}
	
}
