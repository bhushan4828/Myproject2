package logical;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		
		   System.out.println("Enter String value");
		   String str = sc.next();
		     
		String expectedString = str;
		
		  String rev="";
		
		     int lastindex = str.length()-1;
		
		  for(int i=lastindex;i>=0;i--) {
			  
			         rev =rev+str.charAt(i);
		  }
		     System.out.print(rev);
		     System.out.println();
		     
		     
		  if(expectedString.equals(rev)) {
			  
			  System.out.println("it is a Palindrome String");
		  }
		  else {
			  System.out.println("Its not palindome string");
		  }
		     
		     

	}

}
