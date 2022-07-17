package logical;

public class Count_OccurenceOfCharacter_In_Strinng {

	public static void main(String[] args) {
		
		   String s="java programming java oops";
		     
		       int TotalCount = s.length();
		       
		      int count1 = s.replace("j","").length();
		    
		       
	        int Count = TotalCount-count1;
	        System.out.println(Count);
		         
		
		
		
		

	}

}
