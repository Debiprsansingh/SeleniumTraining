package javapractice;

public class NonStaticMembers {
	
	int x=20;
	public void method1()
	{
		System.out.println("the value of x" +x);
}

	public void method2()
	{
		System.out.println("accessing method 2");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		NonStaticMembers n =new NonStaticMembers();
		n.method1();
		n.method2();
		
		

	}
}

