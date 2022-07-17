package inheritance;

 class A{
	

	 public void m1(int x) {

		 System.out.println("The value of x : "+ x);
	 }
	 	 
}

 class B extends A{

	 
	 public void m2(int y) {
		 
		 System.out.println("The value of y is: "+ y);
	 }
	 	 
	 }

  class C extends B{
	  
	  
	  public void m3(int z) {
		  
		  System.out.println("The value of z is: "+z);
		  
	  }
	  
  }


public class MiltilLevelInheritance {

	public static void main(String[] args) {
		
		A obj1=new A();
		
		B obj2=new B();
		
		C obj3=new C();
		/*obj3.z=40;   //here we have assign a value to the variabales of class A & B by using the object of class C
		obj3.y=50;
		obj3.x=60;*/
		
		obj3.m3(10);  //Here we have call the methods of class A & B by using the object of class C & also assigned the values.
		obj3.m1(40);
		obj3.m2(60);
		
		
	}
	
	
	
}
