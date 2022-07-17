package super_keyword;
//1.  super is used to refer immediate parent class instance variable.
  
class parent{
	
	String color="Black";
	
  public static void method() {
	  int a=10;
	  System.out.println("We are learning super keyword");
  }
		
}

class child extends parent{
	
	String color="White";
	public  void method1() {
		System.out.println("welcome");
		super.color="yellow";
		System.out.println(super.color);
	}
}



public class SuperKeyword1 {

	public static void main(String[] args) {
	 child obj=new child();
	 obj.method1();
	 obj.method();

	}

}
