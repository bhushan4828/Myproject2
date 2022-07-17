
// Type casting is used for converting larger data type to smaller data tyoe or smaller to larger
//assign a value of one primitive data type to another type

package codingPractice;

public class TypeCasting {

	public static void main(String[] args) {
		
		//widening casting
		System.out.println("smaller to larger");
		int a=55;
		double b=a;
		System.out.println(b);
				
		//narrowing casting
		System.out.println("larger to smaller");
		
		double j=85.90;
		int k=(int)j;
		
	   System.out.println(k);
		
	   double d=45.556;
	   int e=(int)d;
	   System.out.println(e);
	   
	   String s="1234";
	   int g=Integer.parseInt(s);
	   System.out.println(g);
	   
	   
	   
	}

}
