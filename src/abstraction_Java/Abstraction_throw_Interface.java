package abstraction_Java;
//An interface is a completely "abstract class" that is used to group related methods with empty bodies:
//Interface methods are by default abstract and public
//Interface attributes are by default public, static and final
//An interface cannot contain a constructor (as it cannot be used to create objects)
//Like abstract classes, interfaces cannot be used to create objects
//Interface is used To achieve security - hide certain details and only show the important details of an object.

interface ABCD{
   	
  public void method1();   //Interface methods are by default abstract and public

  public void method2();
  
}

class myClass1 implements ABCD{
	
	public void method1() {
		System.out.println("Abstraction throw Interface");
	}
	
	public void method2() {
		System.out.println("learn more");
	}
	
}


public class Abstraction_throw_Interface {

	public static void main(String[] args) {
		
		myClass1 obj=new myClass1();
		obj.method1();
		obj.method2();
		
	}

}
