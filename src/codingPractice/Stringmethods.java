package codingPractice;

public class Stringmethods {

	public static void main(String[] args) {
      // string length method
	
		String a="welcome to the velocity";
		String b="thanks for welcome";
		String p="Bhushan";
		String s="Karanjkar";
		String q="20";
		String o="40";
		
		
		System.out.println("the length of string s is: "+a.length());
		
		
		System.out.println(a.toUpperCase());  //toUpper case and toLower case method
		System.out.println(a.toLowerCase());
		
		System.out.println(a.indexOf("velocity")); //indexof method
		System.out.println(a.charAt(15));
		System.out.println(a.concat(b));
		System.out.println(p+" "+s);
		System.out.println(a.contains(b));		
		
		
		
	}
	

}
