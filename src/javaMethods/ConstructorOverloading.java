package javaMethods;

public class ConstructorOverloading {

	public ConstructorOverloading(int x,int y) {
		
		System.out.println(x+y);
		
	}
	
	public ConstructorOverloading(int x,int y,double z) {
		
		System.out.println(x+y+z);
		
	}
	
	public ConstructorOverloading(double x,int y) {
		
		System.out.println(x+y);
		
	}
	
	public static void main(String[] args) {

		ConstructorOverloading obj=new ConstructorOverloading(10,20);
		ConstructorOverloading obj1=new ConstructorOverloading(10, 20,40.58);
		ConstructorOverloading obj2=new ConstructorOverloading(20.44,10);
		
	}
	
	
	
	
	
	
	
	
	
	
}
