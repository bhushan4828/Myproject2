package javaMethods;

public class MethodOverloading {
	
	public void add(int x,int y) {
		
	   System.out.println(x+y);
	   
	}
	
	public void add(int x,double y) {
		
		   System.out.println(x+y);
		   }
		
	public void add(int x,int c,double y) {
		
		   System.out.println(x+y+c);
		   }
	
	public static void main(String[] args) {
		
		MethodOverloading obj=new MethodOverloading();
		obj.add(10,20);
		obj.add(10,22.50);
		obj.add(10,20,40.10);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
