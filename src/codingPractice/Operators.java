package codingPractice;

public class Operators {

	public static void main(String[] args) {
		// These are the Arithmetic operators

		int a=10;
		a+=5;
		int b=20;
		int c=a+b;
		int d1= b+30;
		
		System.out.println("---------Arithmetic Operators--------");
		System.out.println("addition of a & b is:" +(a+b));	
		System.out.println("sub of a & b is:" +(a-b));
		System.out.println("multiplication of a & b is:" +(a*b));
		System.out.println("div of a & b is:" +(a/b));
		System.out.println("mod div of a & b is:" +(a%b));
	    System.out.println("the value of d1 is: "+d1); 
		
		System.out.println(a+b);
		System.out.println(c);
		
		
		//Relational operators(comparision operators)
		//always return bollean value

		System.out.println("------Relational operators-------");
		System.out.println(a==b);
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		System.out.println(a<b);
		
		
		//Logical operators   &&  ||  !
		// works between two boolean
		
		boolean x=true;
		boolean y=false;
		
		System.out.println("-----Logical operators-------");
		
		System.out.println(x&&y);
		System.out.println(x||y);
		System.out.println(!x);
		System.out.println(!y);
		
		
		///Increment and Decrement operator
		System.out.println("Increment and Decrement operator");
		
	        a=10;
	        b=20;
	        
	        a++;                  //a=a+1;
	       System.out.println(a);
	       
	        b--;                     //b=b-1;
	    
	      System.out.println(b);
	      
		
	      //Assignment
	      //1.write a java program to print hello on screen and then print your name on a separate line.
	      
	      System.out.println("---------Assignment--------");
		
		String name="Bhushan";
		
		System.out.println("Hello " +name);
		
		//2.write a java program to print the sum of two numbers
        // test data: 74+36 expected output 110.
		
		int d=74;
		int h=36;
		
		System.out.println(d+h);
		
		/* 3. write a java program to swap two numbers.
		 * before swap x1=10  y1=20
		 * after swap  x1=20  y1=10
		 */
		
		int x1=10;
		int y1=20;
		
		int z = x1;  //i.e z=10
		x1=y1;    //i.e x1=20
		y1=z;     //i.e y1=10
		
		System.out.println("the swap value of x1 is: " +x1);
		System.out.println("the swap value of y1 is: " +y1);
		
		
	}

}
