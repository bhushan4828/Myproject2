package interface_Study;


class ABC{
	
	public void method1(int x,String name) {
		
		System.out.println("value of x is: "+x);
		System.out.println(name);
	}
	
}

 interface xyz{
	int y=40;
	
	void method2();
	 
}

interface kkr {
	
	int d=20;
	void method3();
}


public class Hybrid_Inheritance extends ABC implements xyz,kkr {

	public void method2() {
		
		System.out.println("this is method of xyz inteface");
		
	}
	
	
	public void method3() {
		
		System.out.println("this is method of inteface kkr");
	}
	
	
	public static void main(String[] args) {
	
		Hybrid_Inheritance obj=new Hybrid_Inheritance();
		obj.method1(10, "Bhushan");
		obj.method2();
		obj.method3();
		

	}

}
