package logical;

public class ReverseWords_inString {

	public static void main(String[] args) {
		
		    String s="Welcom to java";
		    
		    String[] words = s.split(" ");
	       
	  String reverseString="";
		
		    for( String w:words) {
		    	
		    	      String reverseWords="";
		    	
		    	
		    	for(int i=w.length()-1;i>=0;i--) {
		    		
		    		          reverseWords= reverseWords+w.charAt(i);
		    		  		
		    	}
		    	
		    	   reverseString=reverseString+reverseWords+" ";   	
		    	
		    }
		
		
		     System.out.println(reverseString);
		
		
		
		

	}

}
