package logical;

public class Count_EvenAndOddDigits {

	public static void main(String[] args) {
		
		   int num=123456789;
		
		   int evenCount=0;
		   int oddCount=0;
		   
		   
		   while(num>0) {
			   
			    // int Remaning = num%10;
			   
			     if(num%2==0) {
			    	 
			    	 evenCount++;
			     }
			     
			     else {
			    	 oddCount++;
			     }
				
			    num=num/10; 
			     
		   }
		
		     System.out.print(evenCount);
		     System.out.println();
		     System.out.print(oddCount);
		

	}

}
