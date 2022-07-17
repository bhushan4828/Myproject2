package abstraction_Java;

//Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
//Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
    //An abstract class can have both abstract and regular methods:

abstract class Secure{
     
	abstract void method1(int a,String b);
	
	public void method2() {
		System.out.println("We are learning abstraction");
	}
}


  class myClass extends Secure{
	  public void method1(int a,String b) {
		  System.out.println(a);
		  System.out.println(b);
	  }
	  
  }


public class Abstraction_throw_Inherirance {

	public static void main(String[] args) {
	
		myClass obj=new myClass();
		obj.method1(20, "Velocity");
		obj.method2();

	}

}
