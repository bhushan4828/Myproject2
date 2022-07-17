package string;

public class StringMethods {

	public static void main(String[] args) {
		
		String s="Welcome";
		
		String p="to the velocity";
		
		//length() : It return the total nu8mber og count of character in the string
		System.out.println("the total character in this string is: "+s.length());
		
		//concat() : Combine the specific string at the end of another string
		
		System.out.println(s.concat(p));
		
		
		//trim() : To remove right and left spaces
		String h="    Welcome    ";
		
		System.out.println(h.trim());
	
		//charAt() : Return the character value at the given index number
		
		System.out.println(s.charAt(5));
		
        //contains() : searches the sequence of character in the string.it return true if sequence of char values are found,otherwise false.		
		
		System.out.println(s.contains("Wel"));
		
		//equals() : compares two given string base on the content of the string.if any character is not matched,it returns false,otherwise true.

		System.out.println(s.equals("Welcome"));
		System.out.println(s.equals("welsome"));
		
		//equalsIngnoreCase(): compares two given string base on the content but it dose not check the case like equals()
		System.out.println(s.equalsIgnoreCase("welcome"));
		
		//replace() : replacing all the old character or a character sequence to new character
		System.out.println(s.replace('e','a'));
		
		String f="welcome to the velocity";
		System.out.println(f.replace("velocity","Selenium"));
		
        //Substring() : starting index is start from zero and Ending index is start from one
	
		System.out.println(s.substring(1,3));
		
		//toLowerCase and toUpperCase
		
		System.out.println(s.toLowerCase());
		System.out.println(f.toUpperCase());
		
		
		
		
	}

}
