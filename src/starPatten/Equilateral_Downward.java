package starPatten;

public class Equilateral_Downward {

	public static void main(String[] args) {
		
		//    *******
		 //    *****
		 //     ***
		 //      *
		
		
	//	row=4 column=7

		int Star=7;  int space=0;
		
		
		    for(int i=1;i<=4;i++) {
		
		       for(int j=1;j<=space;j++) {
		    	   System.out.print(" ");
		       }
		
		    for(int j=1;j<=Star;j++) {
		    	System.out.print("*");
		    }

		       System.out.println();
		       space++;
		       Star=Star-2;
	}

}
}