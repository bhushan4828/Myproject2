package set;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset_study {

	public static void main(String[] args) {
		
		
		HashSet H=new HashSet();

		//Doesn't allow duplicate values
		//Allow only 1 null value.
		//order of insertion-random insertion
		//storage type: hashtable
		//no default capacity
		
		
		H.add(15);
		H.add("Bhushan");
		H.add("Velocity");
		H.add("Velocity");
		H.add(null);
		H.add(null);
		H.add(44.80);
		H.add(true);
		
		System.out.println(H);
		
		  System.out.println(H.size());
		  System.out.println(H.isEmpty());
		  
        
		   Iterator ite = H.iterator();
		      
		   
		  
		     while(ite.hasNext()) {
		    	 
		    	    Object Next = ite.next();
		    	       
		    	    System.out.println(Next);
		    	    
		     }
		  
		     // we can read the values  using for each loop also
		  
		     ite.remove();   //remove the last element
		     System.out.println(H);
		      
		System.out.println("--------------------------");
		     for(Object S:H) {
		    	
		    	 System.out.println(S);
		    	 
		     }
		     
		     System.out.println("------------");
		     
		   HashSet<String> H1=new HashSet<String>();
		   H1.add("Velocity");
		   H1.add("Bhushan");
		   H1.add("Vishal");
		   
		   H1.removeIf(t ->t.contains("Vishal"));
		   H1.add("Shubham"); H1.add("Nishant");
		   
		     System.out.println(H1);
		     
		   H.addAll(H1);
		   System.out.println(H);
		   
		   H.retainAll(H1);
		   System.out.println(H);
		    
		
		     

	}

}
