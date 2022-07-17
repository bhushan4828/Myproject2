package javaMethods;

public class StaticNonStaticVariable {

	static int a=10; // static variable
	int b=20;   // non static variable
	
	public static void m1() // this a static method
	{
			
		System.out.println(a); //we can access only static variable here & for non static we have to create object
   
		
	}
	
	public static void main(String[] args) {
		
		StaticNonStaticVariable obj=new StaticNonStaticVariable();
		
		System.out.println(obj.b);
				m1();
				
		obj.m2();		
				
	}
	
	 
	public void m2() // this a non static method
	{
		
	    System.out.println(a);   //here we can access both static and  non static variable directly
	    System.out.println(b);
		
	}
	
	 

/*	int empno;
	String ename;
	static int deptNo;
	
	public void bonus() {
		
		System.out.println(empno);
		System.out.println(ename);
		System.out.println(deptNo);
	}
	
	public static void main(String[] args) {
		
		StaticNonStaticVariable obj=new StaticNonStaticVariable();
		
		obj.empno=1;
		obj.ename="Bhushan";
	    obj.deptNo=20;
		obj.bonus();
	StaticNonStaticVariable obj1=new StaticNonStaticVariable();
	obj1.empno=2;
	obj1.ename="Nishant";
    obj1.bonus();
	
	}*/
	
	
	
	
	
	
	
	
	
	
}
