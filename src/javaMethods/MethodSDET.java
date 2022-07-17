package javaMethods;

/* Case 1- Not taking any parameter and also not returned any value
 * Case 2- not taking parameters but returning value
 * Case 3- taking parameters but not returning value
 * Case 4-method is taking parameter but also returning value
 */

public class MethodSDET {
//case 1
	
	/*int x=10;
	int y=20;
	
	public void sdet() {
		
		System.out.println(x+y);
		
	}
	
	public static void main(String[] args) {
		
		MethodSDET obj1=new MethodSDET();
		obj1.sdet();
		
		}*/

		//case 2
	
    /*int x=50;
    int y=20;
	
    public int sdet1() {
    	return x+y;
    }
    
    public static void main(String[] args) {
    	
    MethodSDET obj2=new MethodSDET();
    
     obj2.sdet1();
        System.out.println(obj2.sdet1());
      
  }*/
    
	//Case 3
	
	/*public void sdet2(int x,int y) {
		
		System.out.println(x+y);
		
	}
	
	public static void main(String[] args) {
		
		MethodSDET obj3=new MethodSDET();
	    obj3.sdet2(10,20);
		
	}*/
	
	//Case 4
	
	public int sdet4(int a,int b) {
		return a+b;
		
	}
	
	public static void main(String[] args) {
		
		MethodSDET obj4=new MethodSDET();
		System.out.println(obj4.sdet4(10,20));
		
	}
	
	
	
}
