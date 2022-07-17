package javaMethods;

class Bank{
	
 double RateOfInterest() {
	 return 0;
 }
		
}


 class SBI{
	 
	  double RateOfInterest() {
		 return 7.5;
	 }
 }

 class Axis{
	 
	 double RateOfInterest(){
		 return 8.1;
	 }
 }


 public class MethodOverRiding {

	public static void main(String[] args) {

		SBI obj=new SBI();
		System.out.println("SBI Rate Of Interest is "+ obj.RateOfInterest());
   
		Axis obj1=new Axis();
		System.out.println("AXIS Rate Of Interest is: "+obj1.RateOfInterest());
		
	}

}
