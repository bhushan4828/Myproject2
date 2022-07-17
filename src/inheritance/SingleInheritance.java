package inheritance;

class Display{
	
	int a;
	
	public void abc() {
		
		System.out.println(a);
		
	}

}
class Display2 extends Display{
	
	int x;
	
	public void xyz() {
		
		System.out.println(x);
		
	}
	
}
		

public class SingleInheritance {
 
	public static void main(String[] args) {
		
	Display obj1=new Display();
	obj1.a=10;
	obj1.abc();
		
		
	Display2 obj2=new Display2();
	
	obj2.x=20;
	obj2.xyz();
	
	obj2.a=50;   // here we can assign a value to the variables of class Display using the object of class Display2
	obj2.abc();  // and alos we can call the method of first class using the object of another class. This is called as Inheritance.
	
	
}
	
	
	
	
	
	
	
	
}
