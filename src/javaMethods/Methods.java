/*Method is block of code which only runs when it is called
 * you can pass the data, known as parameters, in to a method.
 * Methods are use to perform certain action and they are also known as functions.
 * why us methods: To re use code, define the code once and use it many times.
 * Method must be declared within a class 
 */

package javaMethods;

public class Methods {
//Call a method
	
   /*static void myMethod() {
	    System.out.println("This is my first method creation");
   }
	
   public static void main(String[] args) {
	  
	   myMethod(); //Calling a method

	}*/

	//Information can be pass to a method as a parameter.Pamater act as a variable inside the method
	//Parameters are specified after the method name, inside the parentheses. You can add as many parameters as you want, just separate them with a comma.
	
	/*static void newMethod(String Firstname, int age) {
		System.out.println("My first name and age is: "+Firstname+ ", " +age);
	}
	
	   public static void main(String[] args)
	   {
		   newMethod("Bhushan",26);
	       newMethod("Nishant",27);
	       newMethod("Priyanka",28);
		   
		   }*/

	   //The void keyword, used in the examples above, indicates that the method should not return a value. 
	   //If you want the method to return a value, you can use a primitive data type (such as int, char, etc.) instead of void, and use the return keyword inside the method:
	   
	  /*static int mybestMethod(int x)
	  {
		  return 10+x;
	  }
	   
	  public static void main(String[] args) {
		  
		  System.out.println(mybestMethod(5));
	  
	  }*/

	//the sum of a method's two parameters:
	
	 /*static int myMethod1(int x,int y)
	 {
		return x+y;
		 
	 }
     	  
	 public static void main(String[] args) {
		 
		 System.out.println(myMethod1(10,20));
	 }*/
	 
	
	//A method with if else statement
	
	static void checkage(int age)
	{
	   if(age>18)
	   {
		   System.out.println("Eligible for vote");
	   }
	   
	   else {
		   System.out.println("Not eligible for vote");
	   }
	   
	}
	   public static void main(String[] args)
	   {
		   
	   checkage(26);
	
	   
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	  
}
