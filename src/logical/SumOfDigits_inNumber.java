package logical;

import java.util.Scanner;

public class SumOfDigits_inNumber {

	public static void main(String[] args) {
     	
		Scanner sc=new Scanner(System.in);
	     System.out.println("Enter number");
		    
		int Number = sc.nextInt();
		
		int sum=0;
		
         while(Number>0) {

        	        sum=sum + Number%10;
        	        Number=Number/10;
        	 
         }
		     System.out.print(sum);
		   
	}
}
