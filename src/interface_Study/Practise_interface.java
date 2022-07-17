package interface_Study;

interface A{

	int y=11; //in interface variables are by default and static
	
	 void method(int x,String name); //method is by default public  and abstract method
	 
 }


public class Practise_interface implements A {
	public void method(int x,String name) {
		
		System.out.println(y);
		System.out.println(x);
		System.out.println(name);
		
	}

	
	public static void main(String[] args) {
		
       /*Practise_interface obj=new Practise_interface();
       obj.method();*/
		
		A obj1=new Practise_interface(); // this is another way to create a object in interface.
		obj1.method(10, "Shubham");;

	}

}
