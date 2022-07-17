package javaMethods;

public class ThisKeyword {

int a,b; // instance variable or class variable

   public void getvalues(int a,int b)  // method variable  
   {
	   
	   this.a=a;
	   this.b=b;
	   System.out.println(a);
	   System.out.println(b);
	   
   }  
  
   public static void main(String[] args) {
		   
		   ThisKeyword obj=new ThisKeyword();
		   obj.getvalues(10,20);
		  
	   }
	   
	   
	   
 
	 

}
