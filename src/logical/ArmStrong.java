package logical;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
		
       int sum=0;
        
        
        int originalNum = num;
        
             while(num>0) {
            	  
            	      int a = num%10;
            	     sum =sum + (a*a*a);
               	     
            	    num=num/10; 
             }
        
               System.out.println(sum);
               if(originalNum==sum) {
            	   System.out.println("The number is Armstrong Number");
               }else {
            	   System.out.println("Not Armstrong");
               }
        
      
	}

}
