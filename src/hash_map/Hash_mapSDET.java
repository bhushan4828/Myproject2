package hash_map;

import java.util.HashMap;
import java.util.Map;

public class Hash_mapSDET {

	public static void main(String[] args) {
	
		HashMap<Integer, String> hm=new HashMap<Integer,String>();
		
		hm.put(101, "Pratik");
		hm.put(102, "Ramu");
		hm.put(103, "Samsung");
		hm.put(104, "Sony");
		
	hm.remove(102);
		
		System.out.println(hm);
		
	//hm.entrySet() :- it will read the pair and we store this pair in to the variable m. the should be map.entry type.
		//to get key and values separately from this variable, use  m.getkey() , m.getvalue.
		
		for( Map.Entry m:hm.entrySet()) {
		
			System.out.println(m.getKey()+" "+m.getValue());
			
			
		}
		
		//======== loop throw hashmap.================
		
		// To read only values
		
		for(String i:hm.values()) {
			
			System.out.println(i);
			
		}
		
		// TO read only keys
		
		for(Integer k:hm.keySet()) {
			
			System.out.println(k);
		}
		
		// To read both values and keys
		
		for(Integer l:hm.keySet()) {
			System.out.println("Key: "+ l +" values: "+ hm.get(l));
		}
		
		
		
		
		

		
		
		
		


	}

}
