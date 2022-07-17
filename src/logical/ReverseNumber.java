package logical;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		// to get number from user we have to use scanner class
		
		Scanner sc=new Scanner(System.in); //. it will take input from user
		
		System.out.println("Enter the value");
		int num=sc.nextInt();   //it will store value in variable
		System.out.println(num);
		  
/*		
		//Now we have to reverse that value
		//buy using string builder
		
		StringBuilder sb=new StringBuilder(num);
		sb.append(num);
		StringBuilder i = sb.reverse();
		
		System.out.println(i);
		
*/	
		
	//	by using StringBuffer
		
		StringBuffer sb=new StringBuffer(String.valueOf(num));
	      StringBuffer rev = sb.reverse();
	      System.out.println(rev);
		
		

	}

}
