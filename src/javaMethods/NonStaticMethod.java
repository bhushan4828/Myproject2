package javaMethods;

 public class NonStaticMethod {

	public void myPublicMethod(int x,int y) {
		
		System.out.println("This is the non static method "+x+ " & " +y);
		
	}
	
	   public static void main(String[] args) {
		   
		  NonStaticMethod obj=new NonStaticMethod();
		  obj.myPublicMethod(10,20);
		   
	   }
	
	  
	/*public void fullThrottle() {
		
		System.out.println("The firing of car is preety good");
	}
	
	public void speed(int maxspeed) {
		
		System.out.println("the maximum speed is: "+maxspeed);
		
	}
	
	public static void main(String[] args) {
		
		NonStaticMethod myCar=new NonStaticMethod();
		myCar.fullThrottle();
		myCar.speed(300);
		
	}*/
	
	
	/*public void display(int eid,String eName,double sal,String job) {
		
		System.out.println("employee id is: "+ eid);
		System.out.println(eName);
		System.out.println(sal);
		System.out.println(job);
		
		
	}
	
	public static void main(String[] args) {
		
		NonStaticMethod emp1=new NonStaticMethod();
		emp1.display(101, "Bhushan", 100000.55,"QC");
		
		NonStaticMethod emp2=new NonStaticMethod();
		emp2.display(102,"Sumit", 80000.65,"Developer");
		
		
	}*/
	
	
	
	
	
	
	
	
	
	
	
}
