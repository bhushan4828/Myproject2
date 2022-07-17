package array;

public class TwoDimenArray {

	public static void main(String[] args) {

		int a[][]=new int[3][2];      // i.e 3 rows and 2 columns (Declaration of array with specifying the size)
		
		a[0][0]=100;    //inserting the values in to Array
		a[0][1]=200;
		a[1][0]=300;
		a[1][1]=400;
		a[2][0]=500;
		a[2][1]=600;
		
		// Declaration of array without specifying the size
         
		int b[][]= {{100,200}, {300,400}, {500,600}};
		
		//Find Size of an Array
		System.out.println("Number of Rows:" +a.length);
		System.out.println("Number of Columns:" +a[0].length); // here we have to specify at least one row. so we will get number of columns in that rows.
		
	for(int i=0;i<a.length;i++)   //this is a outer for loop
	{
		for(int j=0;j<a[0].length;j++)  // This is inner for loop
		{
			System.out.println(a[i][j]);
		}
	}
		
	     // Advance for loop
	System.out.println("-----------Advance For Loop---------");
	
	   for(int x[]:a)
	   {
		
		   for(int y:x)
		   
		   System.out.println(y);
	   }
	
	
	
	
		
		

	}

}
