package logical;

public class Swapping {
	
	public static void main(String[] args) {

	      int a=10;
	      int b=20;
	      
	      System.out.println(a +" "+ b);
	      
	      //by using third variable
		      
	      int t=a;
	      a=b;
	      b=t;
	      
	     System.out.println("--by using third variable--"); 
	      System.out.println(a+" "+b);

	      
//Without using third variable	      
	      
	  //without using third variable in a single statment
	      int p=20; int q=10;
	      
		   q=p+q -(p=q);
		   System.out.println("In a single statment");
		   System.out.println(p+" "+q);
		
	// without using third variable with div and multiplication
		   
		   int g=10; int h=20;
		   
		   g=g*h;
		   h=g/h;
		   g=g/h;  
		   System.out.println("with multipication and division");
		   System.out.println(g+" "+h);
		   
     		   
	 //by using add and substraction	
		   
		   int c=10; int d=20;
				   c=c+d;
		           d=c-d;
		           c=c-d;
		           
		      System.out.println("by using add and substraction");     
		           System.out.println(c+" "+d);
				    
	
		
		
		
		

	}

}
