package super_keyword;
//1.super is used to invoke parent class constructor.

class vehicle{
	int a;
	String name;
	char c;		
	
	
	public vehicle(int a,String name,char c) {
		this.a=a;
		this.name=name;
		this.c=c;
	
	}
}

class Bike extends vehicle{
	
	float f;
	public Bike(int a,String name,char c,float f) {
    
	 super(a, name, c);
	
	this.f =f;
    
	}
  	
	public void method() {
		System.out.println(a);
		System.out.println(name);
		System.out.println(c);  System.out.println(f);
	}
	
	
}


public class Super_Keyword3 {

	public static void main(String[] args) {
		Bike obj=new Bike(10, "Velocity", 'A', 20.20f);
		obj.method();
	
	}

}
