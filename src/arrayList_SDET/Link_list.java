package arrayList_SDET;

import java.util.Iterator;
import java.util.LinkedList;

public class Link_list {

	public static void main(String[] args) {
	
		LinkedList ab=new LinkedList();
		
		ab.add("Bhushan"); ab.add("Velocity"); ab.add(50); ab.add('A');
		
		System.out.println(ab.size());
		
		System.out.println(ab);
		
		ab.remove(3);
		System.out.println(ab);
		ab.add(3,'A');  
		System.out.println(ab);
		
		System.out.println(ab.contains('A'));
		
		ab.set(2,100); //retriving value or object
		System.out.println(ab);
		
		System.out.println(ab.get(1));
		
		System.out.println(ab.isEmpty());

		System.out.println("---------read the values---------");
		for(int i=0;i<ab.size();i++) {
			System.out.println(ab.get(i));
		}
		
		System.out.println("-----For eaach loop---------");
	    
		for(Object a:ab) {
			System.out.println(a);
		}
		
		
		System.out.println("---Read the data by usining irterator method----");
		
       Iterator abc=ab.iterator();
       while(abc.hasNext()) {
    	   System.out.println(abc.next());
    	   
       }
		
		System.out.println("----------linkList have some owen method also------");
		
		ab.addFirst("Solapur");
		ab.addLast("Kolhapur");
	System.out.println(ab);
	
	   ab.removeFirst();
	   ab.removeLast();
		System.out.println(ab);
		
	    
		
		
		}

}
