package arrayList_SDET;

import java.util.Collections;
import java.util.LinkedList;

public class Liast_list2 {

	public static void main(String[] args) {
		
		
		LinkedList xy=new LinkedList();
		
		xy.add("Pune"); xy.add("Akola"); xy.add("Nashik"); xy.add("Washim"); xy.add("Buldhana"); xy.add("Amaravati");
		
	System.out.println(xy);
    
	// now we are creating a new linkList 
	
	LinkedList bc=new LinkedList();
	
	bc.addAll(xy); // addAll method
    
	System.out.println(bc);
	
	bc.removeAll(xy);  //removeAll method
	System.out.println(bc);
	
	// sorting of linkList
	
	Collections.sort(xy);
	System.out.println(xy);
	    
	//reverse order
	
	Collections.sort(xy,Collections.reverseOrder());
	System.out.println("reverse order: "+xy);
	
	//shuffling
	Collections.shuffle(xy);
	System.out.println("After shuffling: "+xy);

	}

}
