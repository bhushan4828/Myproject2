package arrayList_SDET;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_practise {

	public static void main(String[] args) {
		
		ArrayList<String> abc=new ArrayList<String>();
		
		abc.add("Akshay");
		abc.add("Bhushan");
		abc.add("Welcome");
		System.out.println(abc.size());

		abc.add(1, "Nishant");
		
		System.out.println(abc.size());
		
    System.out.println(abc);
    
	abc.remove(0);
	System.out.println(abc);
	
	abc.set(2, "Most Welcome"); //to modify the value
	
	
	for(String s:abc) {	System.out.println(s);	}
	
ArrayList xyz=new ArrayList();

     xyz.add(26);
     xyz.add("Velocity");
     xyz.add('A');
     
     xyz.add(3,"Nishant");
     
     System.out.println(xyz.size());
	
     System.out.println("-----------------------");
    
	System.out.println(xyz.get(1));
     System.out.println(xyz.contains('A'));
     System.out.println(xyz.isEmpty());
    
     System.out.println("-------------------------");
    
     for(Object f:xyz) {
    	 System.out.println(f);
     }
     
    
     
     //Traditional for loop
     for(int i=0;i<xyz.size();i++) {
    	 
    	 System.out.println(xyz.get(i));
    	 
     }
     
    
     //for each method
     System.out.println("-----for each() mathod----------");
     
     xyz.forEach(t -> {
    	 
    	 System.out.println(t);
    	 
     });
     
     
     System.out.println("----for each remaning method()-------");
     
        Iterator itr=xyz.iterator();
		
	       	itr.forEachRemaining(t ->{
	       		System.out.println(t);
	       	});
		
		    
		
		
		
		
	}
	
	
	
	
}
