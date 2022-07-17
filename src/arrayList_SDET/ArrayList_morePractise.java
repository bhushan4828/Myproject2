package arrayList_SDET;

import java.util.ArrayList;

public class ArrayList_morePractise {

	public static void main(String[] args) {
	
      ArrayList<String> abcd=new ArrayList<String>();
      
      abcd.add("Prathamesh");
      abcd.add("Nashik");
      abcd.add("Akola");
      abcd.add("Pune");
      
     abcd.remove(2);
     System.out.println(abcd);
     
     abcd.set(0, "Akola");
     System.out.println(abcd);
          
		abcd.add(1, "Washim");
		System.out.println(abcd);
		
		System.out.println(abcd.size());
		
		for(String a:abcd) {
			System.out.println(a);
		}
		
		for(int i=0;i<4;i++) {
			System.out.println(abcd.get(i));
		}
		
		
		

	}

}
