package javapractice;

import javapractice.NonStaticMembers2.Run1.customer;

public  class NonStaticMembers2 {
	public static void main(String[]args) 
	{
		//customer cus=new customer();
		
		
	}
	static class Run1
	{
	static double branchbal=100000;
	String Bankname="SBI";
	
		class customer
	{
	String custname;
	String accno;
	double accn_bal;
	public void balance(double deposit)
	{
		accn_bal=accn_bal + deposit;
		branchbal=Run1.branchbal+accn_bal;	
		
	}
	public void withdraw(double amt)
	
	{
		
		accn_bal= accn_bal - amt;
		branchbal=Run1.branchbal -accn_bal;
		
		
	}
			public void Display()
			{
				System.out.println("accn bal is "+accn_bal);
				System.out.println("branch bal is "+branchbal);
			}
			
		
	}

}
}