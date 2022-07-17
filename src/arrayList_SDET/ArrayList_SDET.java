package arrayList_SDET;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_SDET {

	public static void main(String[] args) {
	
	ArrayList List1=new ArrayList();
	List1.add("Bhushan");
	List1.add("Nishant");
	List1.add(20);
	List1.add('A');
    List1.add(true);
    
    System.out.println("before removing the elements");
    System.out.println(List1.size()); //print the size of array list
    
    System.out.println(List1);
    
		List1.remove(2);  // remove the element
		System.out.println("After removing the elements Size is: "+List1.size());
		
	System.out.println("After removing the elements: "+List1);
		
	//add the new element in the array list
	  List1.add(2, 20);
	  List1.add(3, "Shubham");
	  
      System.out.println("after adding the new element Size is: "+List1.size());
      System.out.println("After adding the new alements: "+List1);
	
	//Read the values from array list
      
      for(Object s:List1) // here we have mix data type in array list so we have declared s as a object type otherwise we should take String, int for a specific data type array list
      {
    	  System.out.println(s);
      }
      
System.out.println("----------Iterator------------------");
      // read the values using iterator
      
      Iterator ite = List1.iterator();
      
      while(ite.hasNext()) {
    	  
    	  
    	  System.out.println(ite.next());
    	  
      }
      
      System.out.println("------ListIterator---------");
      
      // read the values using listIterator
      
         ListIterator lit = List1.listIterator();
         
         while(lit.hasNext()) {
        	 System.out.println(lit.next());
         }
      
      
      System.out.println("----------ListIterator---(hasPrevious)----");      
      
            while(lit.hasPrevious()) {
            	
            	System.out.println(lit.previous());
            	
            }
          
  
      
      
      
      
      
      
      
      
	}

}
