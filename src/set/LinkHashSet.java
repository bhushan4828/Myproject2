package set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkHashSet {

	public static void main(String[] args) {
		
		
		LinkedHashSet L=new LinkedHashSet();
		
		//Doesn't allow duplicate values
		//Allow only 1 null value.
		//order of insertion-maintained
		//no default capacity
		//storage type: hashtable
		//DS: Hybrid  (liner+ hashtable)
		
		L.add("Velocity");  L.add("Velocity");
		L.add("Bhushan");   L.add(45); L.add(200.456);
		L.add(null);  L.add(null);
		
		
		System.out.println(L);
	
		     for(Object LH:L) {
		    	 System.out.println(LH);
		     }
		
		 System.out.println("-------------------------");    
		     
		     Iterator itr = L.iterator();
		     
		        while(itr.hasNext()) {
		        	   
		        	   System.out.println(itr.next());
		        }
		

	}

}
