package Exception_study;

public class Exception_examples {

	public static void main(String[] args) {
		
		
   //Unchecked exception
     //Exception which are not checked /identified by the compiler.
		
		//1.Arithmetic Exception
		
		System.out.println("Hello, we are learning exception");
		
		int a=100;
		
		//System.out.println(a/0); //it will throw arithmetic exception
		
		//2.Null point exception
		
		String s=null;
		//System.out.println(s.length());
		
//3.Number format exception
		
		/*String b="12345abc";
		int d=Integer.parseInt(b);
		
		System.out.println(d); */
		
//Array Index Out of bound Exception		
		
		int h[]=new int[5];
		h[0]=100;
		h[1]=200; 
		h[6]=300; //out of bounds
		
		System.out.println(h[0]);
		
		
		System.out.println("Thanks for giving your precious time");
		
	}

}
