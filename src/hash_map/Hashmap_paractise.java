package hash_map;

import java.util.HashMap;
import java.util.Map;

public class Hashmap_paractise {

	public static void main(String[] args) {
	
		HashMap hm1=new HashMap();
		
		hm1.put(123,"Bhushan");
		hm1.put(145, "Nishant");
		hm1.put(555, "Velocity");
		hm1.put(478, "Shubham");
		
		hm1.remove(478);
		
		System.out.println(hm1.size());
		
		hm1.replace(123, "Pratik");
		
		
	System.out.println(hm1);
		
		for(Object m:hm1.entrySet()) {
					
			System.out.println();
			
		}
		
		
		for(Object i:hm1.keySet()) {
			
			System.out.println(i+" "+hm1.get(i));
		}
		
		
		for(Object k:hm1.values()) {
			System.out.println(k);
			
		}
		
		
		
		
		

	}

}
