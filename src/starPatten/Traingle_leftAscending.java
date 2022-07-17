package starPatten;

public class Traingle_leftAscending {

	public static void main(String[] args) {
		

		 // *
		 // **
		 // ***
		 // ****
		 // *****
		
		//rows=5  columns=5
		
	   int	Star=1;
		
		    for(int i=1;i<=5;i++) {
		    	for(int j=1;j<=Star;j++) {
		    		
		    		System.out.print("* ");		    		
		    	}
		    	System.out.println();
		    	Star++;
		    }
		
		

	}

}
