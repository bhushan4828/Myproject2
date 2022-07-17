package array;

public class PracticeArray {

	public static void main(String[] args) {
	
	int a[][]= {{100,200},{300,400},{400,500}};

	System.out.println("Number of rows ois: "+a.length);
	System.out.println("Number of column is: "+a[0].length);
	
	/*for(int i=0;i<a.length;i++) {
		
		for(int j=0;j<a[0].length;j++) {
			
			System.out.println(a[i][j]);
		}
		
		
	}*/
	
	
	for(int z[]:a) {
		
		for(int d:z) {
		System.out.println(d);
		}
	}
	
	
	
	
	}
}