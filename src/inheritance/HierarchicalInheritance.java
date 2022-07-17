package inheritance;


class Parent{
	
	public void m1(int h) {
		
		System.out.println(h);
		
	}	
}

  class ABC extends Parent{
	  
	  public void m2(int g) {
       System.out.println(g);
		  
	  }
  }

 class XYZ extends Parent{
	 
	 public void m3(int i) {
		
		 System.out.println(i);
	 }
 }



public class HierarchicalInheritance {

	public static void main(String[] args) {
	
		ABC obj2=new ABC();
		obj2.m1(20);
		obj2.m2(40);
		
      XYZ obj3=new XYZ();
      obj3.m1(50);
      obj3.m3(60);
		
		
	}

}
