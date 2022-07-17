package starPatten;

public class Traingle_lesftDescending {

	public static void main(String[] args) {

		 //*****
		 //****
		 //***
		 //**
		 //*
		
	    //row=5 column=5	

		int Star=5;
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=Star;j++) {
				
				System.out.print("* ");
			}
			
			System.out.println();
			Star--;
		}
		
		
	}

}
