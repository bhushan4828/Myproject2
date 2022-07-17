package string;

public class String_Builder {

	//  At a time multiple thread is to allow to operate on a string builder object. Hence string builder object is not thread safe.
	
	
	public static void main(String[] args) {
		

		StringBuilder ab=new StringBuilder("Velocity");

		ab.append("  is best class");
		System.out.println(ab);
		
		System.out.println(ab.length());
		
		ab.insert(9,"pune");
		System.out.println(ab);
		
		ab.replace(9, 13,"Akola");
		System.out.println(ab);
		
		ab.delete(9,14);   System.out.println(ab);
		ab.insert(8,'j'); System.out.println(ab);
		ab.deleteCharAt(8); System.out.println(ab);
		
	StringBuilder name=new StringBuilder("Welcome");
	
	name.reverse(); System.out.println(name);
	name.replace(0,7,"Welcome");  System.out.println(name);	
	
	System.out.println(name.substring(2));
	
	System.out.println(name.substring(3, 7));
	
    System.out.println(name.capacity());
	name.ensureCapacity(100);
	System.out.println(name.capacity());
	name.append(" to our organisation");
	System.out.println(name);
	System.out.println(name.capacity());
	
	
	}

}
