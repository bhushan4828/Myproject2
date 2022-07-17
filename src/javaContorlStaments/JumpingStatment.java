package javaContorlStaments;

public class JumpingStatment {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				break;
			}
			System.out.println(i);  //it will print  1 2 3 4 because we have break the statement at 5. So it will directly jump out of the block when conditioned get matched.
		}
		
		
		// we can use continue instead of break to continue after the 5 & it will skip 5.
		System.out.println("---------Jumping statment using continue----------");
		
		for(int e=1;e<=10;e++)
		{
			if(e==5)
			{
				continue;
			}
			
			System.out.println(e);
		}
		
		// Now if want to skip some odd numbers then 
		System.out.println("---------------");
		
		for (int y=1;y<=10;y++)
		{
			if(y==3 || y==5 || y==7)
			{
				continue;
			}
			System.out.println(y);			
		}
		
		
	}

}
