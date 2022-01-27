package javapractice;

public class NonStaticMembers1 {
	String name;
	int rollno;
	static char sec='c';
	 public void activity()
	 {
		 System.out.println("the student is studying");
	 }
	
	 public void DisplayInfo() {
		 System.out.println("name of the student is "+name );
		 System.out.println("roll no of the studengt is "+rollno);
		 System.out.println("sec of the student is "+sec);
	 }
	
	
	 public static void main(String[] args) 
	 {
		 NonStaticMembers1 obj= new NonStaticMembers1();
		 obj.name="AKASH";
		 obj.rollno=001;
		obj.DisplayInfo();
		obj.activity();
		System.out.println("---------------------------");
		NonStaticMembers1 n2= new NonStaticMembers1();
		n2.name="akash1";
		n2.rollno=002;
		//NonStaticMembers1.sec='d';
		n2.DisplayInfo();
		n2.activity();
		
		
		 
	 }

}
