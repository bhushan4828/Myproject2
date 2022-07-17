package starPatten;

public class Triangle_rightAScending {
	
	
	public static void main(String[] args) {
		
		//     *
		 //   **
		 //  ***
		 // ****
		 //*****
		
	  int Star=1;  int space=4;
		
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
				for(int j=1;j<=Star;j++) {
					System.out.print("*");				
				}
               
				System.out.println();
				space--;
				Star++;
				
		}	
		
		
	}
	

}
