package logical;

public class PrimeorNot {

	//Prime Number:
	//Natural Number >1
	// which has only two factors 1 and its self.
	
	public static void main(String[] args) {
		
        int  number=4;
		
		int factor_count = 0;
        
            if(number>1) {
            	
            	for(int i=1;i<=number;i++) {
            		
            		      if(number%i==0) {
            		    	  factor_count++;
            		      }
            		      		    	
            	}
            	  
            	if(factor_count==2) {
    		    	System.out.println("Number is prime");
    		    }else {
    		    	System.out.println("Number is not prime");
    		    }    	
            	
            	
            }else {
            	System.out.println("not palindrome number");
            }
		
		
		
		
        
		
		
		

	}

}
