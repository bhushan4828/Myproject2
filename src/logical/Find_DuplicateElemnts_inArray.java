package logical;

import java.util.HashSet;

public class Find_DuplicateElemnts_inArray {

	public static void main(String[] args) {
		
		String []ar= {"Velocity","html","java","Velocity","java"};
		
		
		
		 HashSet<String > hs=new HashSet<String>();  
		 
		 for( String E:ar) {
			 
			      boolean elements = hs.add(E);
			         
			      
			      if(elements==false) {
			    	  System.out.println("Dupliacte element: "+E);
			      }
			      else {
			    	  System.out.println("Not found Duplicate Element");
			      }
			  		 
		 }

		
		
		

	}

}
