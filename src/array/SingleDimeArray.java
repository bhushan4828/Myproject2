package array;

public class SingleDimeArray {

	public static void main(String[] args) {
	
		int a[]=new int[5]; // Array declaration with size 5. starting index is 0 & last index is 4.
		
		a[0]=100;      //*storing and inserting values into Array
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
	
		// OR
		
		int b[]= {100,200,300,400,500,600}; //Declare an Array without specifying size
		
		System.out.println("the size of array \"a\" is " +a.length);  // prints length i.e size of an array
		System.out.println("the size of an array \"b\" is "+b.length);

		System.out.println(a[2]); // read specific value
		System.out.println(b[3]); // read specific value

		//read the all values at one time using Classic for loop
	     System.out.println("read the all values at one time using \"for\" loop");
	     
		for(int i=0;i<=4;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("-----------------");
		
		
		for(int h=0;h<6;h++)
		{
			System.out.println(b[h]);
		}

		
		//Read the values using Advance for loop(i.e Enhanced for loop or for each loop)
		
		System.out.println("------Advance for loop-------");
		for(int y:a)
		{
			System.out.println(y);
		}
 
		System.out.println("-------Advance for lop--------");
		for(int x:b)
		{
			System.out.println(x);
		}

		
		
	}

}
