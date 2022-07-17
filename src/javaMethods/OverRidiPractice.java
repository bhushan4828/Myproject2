package javaMethods;

public class OverRidiPractice {

	int x;
	
	public int Saraswati() {
		return x;
		
	}
	
	
	public static void main(String[] args) {
		
		Tution obj2=new Tution();
		obj2.y=10;
		System.out.println(obj2.Saraswati());
		
		OverRidiPractice obj1=new OverRidiPractice();  obj1.x=20;
		System.out.println(obj1.Saraswati());
		
		School obj3=new School();  obj3.z=30; System.out.println(obj3.Sarswati());
		
		
		
		
	}

}
	
	 class Tution{
	int y;
	
	public int Saraswati() {
		
		return y;
	}
	
}

  class School {
	  int z;
   public int Sarswati() {
	   return z;
	   
   }
	  
  }
	
	
	

