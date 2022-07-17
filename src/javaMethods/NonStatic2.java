package javaMethods;

public class NonStatic2 {

	public static void main(String[] args) {
		
		NonStaticMethod object=new NonStaticMethod();
		
		object.myPublicMethod(10,20); // bMethod access from another class.

	}					
}
