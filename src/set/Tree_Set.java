package set;

import java.util.TreeSet;

public class Tree_Set {

	public static void main(String[] args) {
		
		    TreeSet<String> T=new TreeSet<String>();
		   
		    //doesn't allow duplicate 
		 // null values: not allowed
	        //order of insertion- Asscending order
		    //no default capacity.		    
		//DS: Balanced tree 
		    //storage type: hashtable
		    
		    
		         T.add("Velocity");   T.add("Velocity");
		         T.add("Bhushan");   T.add("Vishal"); 
		      T.add("Nishant");
		      
		      
		      System.out.println(T);
		      
		      System.out.println(T.first()); //Returns the first (lowest) element currently in this set.
		     System.out.println(T.floor("Sumit")); //Returns the greatest element in this set less than or equal tothe given element, or null if there is no such element.
		     System.out.println(T.descendingSet());  // Returns a reverse order view of the elements contained in this set.
		     
		     System.out.println(T.higher("Sumit")); // Returns the least element in this set strictly greater than thegiven element, or null if there is no such element.
		     System.out.println(T.last());   //Returns the last (highest) element currently in this set.
		
		    System.out.println(T.lower("Sumit"));  //Returns the greatest element in this set strictly less than thegiven element, or null if there is no such element.
		    
		    
		    T.pollFirst();//Retrieves and removes the first (lowest) element,or returns null if this set is empty.
		    T.pollLast();// Retrieves and removes the last (highest) element,or returns null if this set is empty.
		
		System.out.println(T.subSet("Bhushan", "Vishal")); // a view of the portion of this set whose elements range from fromElement, inclusive, to toElement, exclusive
          
		System.out.println(T.tailSet("Nishant"));  //Returns a view of the portion of this set whose elements are greater than or equal to fromElement. 
		
		   System.out.println(T.headSet("Velocity"));  //Returns a view of the portion of this set whose elements are strictly less than toElement
		
		      
		
		
		
	}

}
