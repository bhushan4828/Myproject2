package array;

public class Array_MixdataTypes {

	public static void main(String[] args) {
	
		Object a[]=new Object[3];
		
		a[0]="Bhushan";
		a[1]=2;
		a[2]='A';
		
		System.out.println(a.length);
		
		for(Object b:a) {
			
			System.out.println(b);
			
		}
		

	}

}
