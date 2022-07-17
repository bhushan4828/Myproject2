package javaMethods;

class Animal{
	
	String color="White";
	
	public void Dog() {
		
		System.out.println("Dog is a cute animal");
	
	}
	
	//constructor
	/*public Animal() {
		
		System.out.println("All animals are cute");
	}*/
	
	
	
}

   class Pets extends Animal{
	   
	   String Color="Black";	   
	
	   public void Cat() {
		
		System.out.println("CAT is also cute");
		System.out.println(super.color); //here we use super to refer immediate parent class instance variable.
		
		super.Dog(); //here we use super to invoke immediate parent class method.
		 
	
		
	}
	   
	  /*public Pets() {
		  
		  super(); // invoked immediate parent class constructor
		  System.out.println("All pets are cute");
		  
		   
	  }*/
	   
	   
	   
   }


public class Super_Keyword {
	
	public static void main(String[] args) {
	
		Pets obj=new Pets();
		obj.Cat();
		System.out.println(obj.Color);

	}

}
