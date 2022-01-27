package javapractice;

public class Run2 {
	static int x;
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("the value of x is "+x);
		Run3.method1();
		Run3.method2();
	}
	public static  class Run3
	{
		public static void method1()
		{
			int x=20;
			System.out.println("the value of x in method1 is " +x);
		}
		public static void method2()
		{
			System.out.println("the value of x is "+x);
		}
	}

}
