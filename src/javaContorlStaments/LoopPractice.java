package javaContorlStaments;

public class LoopPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=1;
		
		while(i<=15)    //condition
		{
	System.out.println(i);
        i++;   //increment
        
		}
		
		
		// 2.Even number betweeen 1-10
		
		System.out.println("-------Even number between 1-10---------");
		
		int j=2;
		while(j<=10)
		{
			System.out.println(j);
			j=j+2;  // increment value by 2. we can write shortcut also j+=2
		}
			
		     // if we want to print odd number then take j value 1.
		
		// 3.print the number in descending order from 10-1
		System.out.println("---------Descending order from 10-1--------");
		
		int k=10;
		while(k>=1)
		{
		System.out.println(k);
		k--;
	}
		
		// do while loop
       System.out.println("------do while loop-------");
		
		int h=1;
		do
		{
			System.out.println(h);
			h++;
			
		}while(h<=10);
		
		//for loop practice increment
		
		System.out.println("--------for loop practice---------");
		
		for(int r=1;r<=10;r++)
		{
			System.out.println(r);
		}
		
		//for loop practice  decrement
		
		for(int w=10;w>0;w--)
		{
			System.out.println(w);
		}
		
		
		
		
		
		
		
	}
}
					