package javaContorlStaments;

public class ConditionalStatment {

	public static void main(String[] args) {
		// if  else
		
		int age=22;
		
		if(age>=18)
		{
           System.out.println("eligible for voting");
		}
		
		else
			
		{
			System.out.println("not eligible for voting");
			
		}
		
		//short hand if else
		System.out.println("short hand if else");
		
		String f=(age>18)? "eligible for vote": "not eligible for vote";
		System.out.println(f);
		
			
		   //largest or smallest number
		
		int a=10;
		int b=30;
		
		if(a>b)
		{
			System.out.println("A is larger than B");
		}
		
		else
		{
			System.out.println("A is smaller than B");
		}
		
		//short hand if else
		System.out.println("short hand if else");
	    
		String d=(a>b) ? "a is larger number": "a is smaller number";
		System.out.println(d);
		
		//even or odd number
		
		int num=5;
		
		if(num%2 == 0)
		{
			System.out.println("Number is even");
		}
		
		else
		{
			System.out.println("Nmuner is odd");
		}
		
		
		// nested if else condition
		
		System.out.println("--------Nested if  else condition----------");
		
		int day=4;
		
		if(day==1)
		{
			System.out.println("Sunday");
		}
		
		else if(day==2)
		{
			System.out.println("Monday");
		}
		
		else if(day==3)
		{
			System.out.println("Tuesday");
		}
		
		else if(day==4)
		{
			System.out.println("Wednesday");
		}
		
		else
		{
			System.out.println("Invalid day number");
		}
		
		
		// Swithch Case statment (It is also a conditional statment)
		
		System.out.println("----------Switch Case statment----------");
		
		int date=10;

		switch(date)
		{
		case 1:System.out.println("Sunday"); break;
		case 3:System.out.println("Monday"); break;
		case 4:System.out.println("Tuesday");
		  break;
		case 10:System.out.println("Thursday"); break;
		case 8:System.out.println("Friday"); break;

        default:System.out.println("Invalid date");
	
		}
		
        int weight=55;
		
		switch(weight)
		{
		case 45:System.out.println("its not my weight"); break;
		case 56:System.out.println("its also not my weight"); break;
		case 55:System.out.println("This is my body weight"); break;
		
		default:System.out.println("Invalid weight");
		}
		
		
		
	}
	
		
	}

