package Exception_study;

public class Excemption_handling {

	public static void main(String[] args) {
		
		//1.Arithmetic Exception
		
		int a=100;
		System.out.println("Hello, we are learning exception handling");
		
		try                              
		{
		System.out.println(a/0);
		}
		catch(ArithmeticException e) // exception name with any object.
		{
			System.out.println("Enter in the catch box");
		}
		
		//we can enter here multiple catch box also if we don't know the exception type 
		int b=550;
		
		try {	
		System.out.println(b/0);
		}
		
		catch(NullPointerException r)
		{
			System.out.println("enter in to the catch box null point");
		}
		
		catch(ArithmeticException d) {
			System.out.println("Welcome to catch box");
		}
		
//2.Null point exception handling
		String s=null;
		
		try {
		System.out.println(s.length());
		}
		catch(NullPointerException l) {
			System.out.println("welcome to catch box for null point");
		}
		
		
//3.Array index out of bounds exception
		
		int arra[]=new int[5];
		
		arra[0]=100; arra[1]=200;

		try {
		System.out.println(arra[6]);
		}
		catch(Exception q) //this is a super exception type. if we didn't know the exception type then we can also use this. 
		{
			System.out.println("Enter in to the exception box array");
		}
		
		System.out.println("-----Program not terminated becuase we done excption handling--------");
		String name="Bhushan";
	 System.out.println(name);
		

	}
 
} 
