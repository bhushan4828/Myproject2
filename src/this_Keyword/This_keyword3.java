package this_Keyword;

//this() : to invoke current class constructor


public class This_keyword3 {

	/*public This_keyword3() {
		System.out.println("I am default conmstructor");
	}
	
	public This_keyword3(int a,String name) {
		this();
		System.out.println(a+" "+name);
		
	}*/
	
	
   int a;
   String name;
   float f;
   char c;
	
	public This_keyword3(int a,String name,float f) {
		
		this.a=a;
		this.name=name;
		this.f=f;
		
	}
	
   public This_keyword3(int a,String name,float f,char c) {
	   
	  this(a, name, f);
	  this.c=c;
	   
   }
   
   public void Display() {
	   System.out.println(a+" "+name+" "+f+" "+c);
   }
   
   
	public static void main(String[] args) {
	//This_keyword3 obj=new This_keyword3(10, "Bhushan");
		This_keyword3 obj1=new This_keyword3(20, "Nishant", 99.99f);
		This_keyword3 obj2=new This_keyword3(30, "Bhushan", 20.25f, 'A');
		obj1.Display();
		obj2.Display();

	}

}
