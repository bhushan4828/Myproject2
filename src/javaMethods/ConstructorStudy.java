package javaMethods;

public class ConstructorStudy {
//this is a user defined constructor because we passed the parameters.
/*	
	ConstructorStudy(int sID,String Name,char sGrade){     //constructor name should be same as class name
		
		System.out.println(sID+" "+Name+" "+sGrade);
		
	}
	 public static void main(String[] args) {
		 
		 ConstructorStudy obj3=new ConstructorStudy(23,"Nishant", 'B');   //assign valuse by using constructor
		 
	 }*/
	
	 
	//This is a default constructor because we dose not pass any parameter
	
	int x=10;
	int y=20;
	
	
	 public ConstructorStudy() {
	
	System.out.println(x+y);	 
		 
	}
	 
	 public static void main(String[] args)
	 {
		 ConstructorStudy obj2=new ConstructorStudy();
		 
	 }
	 
	 
	 
	 
		
}
