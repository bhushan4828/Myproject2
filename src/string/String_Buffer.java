package string;

//  StringBuffer are mutable in nature
// at a time only one thread is allow to operate on a string buffer object. Hence string buffer object is thread safe.


public class String_Buffer {

	public static void main(String[] args) {

         
		StringBuffer name=new StringBuffer("Hello");
		
		name.append(" ,How are you");    // String buffer mutable in nature
		
		System.out.println(name);
		
		
	    name.insert(1, "Velocity");
	    System.out.println(name);
		
	    name.replace(0, 26,"Velocity");  // replace method
	    System.out.println(name);
		
		name.delete(2, 4);      //  delete method
		System.out.println(name);
		
		name.insert(2,"lo");     // insert method
		System.out.println(name);
		
		name.reverse();     //reverse method
		System.out.println(name);
		
	     name.replace(0,8,"Velocity");
	     System.out.println(name);
	     
	     System.out.println(name.charAt(4));
	     
		System.out.println("=====================================");
	// StringBuffer Capacity
	     
	     StringBuffer car=new StringBuffer();
	     
	     System.out.println(car.capacity());  // default capacity
	     
	     car.append("Honda City");
	     System.out.println(car.capacity());  // it will print 16
	     
	     car.append(" is my favourate car");
	     System.out.println(car.capacity());  // now new capacity= old capacity*2 + 2 
	     
	     car.append(" .Thanks");
	     System.out.println(car.capacity());  // it will print 70;
	     
	     System.out.println("================================");
	     
//setLength method    
	     
	 StringBuffer Akola=new StringBuffer("Akola is best");
	     
	       Akola.setLength(5); 
	       System.out.println(Akola);
	 
	     
	       System.out.println("===================================");
	       
// ensureCapacity()
	     
	     StringBuffer School=new StringBuffer();
	     
	         System.out.println(School.capacity());
	     School.ensureCapacity(1000);
	     System.out.println(School.capacity());
              
	     School.append("Velocity");
	     System.out.println(School);
	     System.out.println(School.capacity());
	     
	     School.trimToSize();   // it will decrease the capacity up the length
	     System.out.println(School.capacity());
	
	  System.out.println("=============================");   
	     
	   StringBuffer ab=new StringBuffer();
	   System.out.println(ab.capacity());
	   
	   ab.append("Velocity");
	   System.out.println(ab.capacity());
	   ab.append(" school is best in pune");
	   System.out.println(ab.capacity());
	     
	   ab.ensureCapacity(60);    // but new capacity is old*2 +2. so it will be 70.
	   System.out.println(ab.capacity());
	     
	     
	     
	     
	     
	     
	     
	     
	     
		
		
		
		

		
		
	}

}
