package starPatten;

public class Traingle_rightDescending {

	public static void main(String[] args) {
		
		// *****
		//  ****
		//   ***
		//    **
		//     *
		
		
		int Star=5;
		 int Space=0;
		
		   for(int i=1;i<=5;i++) {
			
			   
			   for(int j=1;j<=Space;j++) {
				   System.out.print(" ");
			   }
			   
			   for(int j=1;j<=Star;j++) {
				   
				       System.out.print("*");
				   
			   }
			   System.out.println();
			   Space++;
			   Star--;
		   }
		
		
		
		
		

	}

}
