package logical;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter number");
	   
	   int Num = sc.nextInt();
	   
	   int ExpectedNum =Num;
	   
	    int rev=0;   
	
		while(Num!=0) {
			
			     rev=rev*10 + Num%10;
			     Num=Num/10;
			    
    
		}
		 System.out.print(rev);
           System.out.println();		   
	
           
	 if(rev==ExpectedNum) {
		 System.out.println("it is Plindrome Number");
	 }
	 else {
		 System.out.println("its not palindrome number");
		 
	 }		   
		
	}
      

}
