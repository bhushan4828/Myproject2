package inheritance;
//From w3 school
public class Vehicle{
 
	protected String Bike="Pulsar";
	
	public void Bestbike() {
		
		System.out.println("The best bike is: "+Bike);
	}
 		
	public static void main(String [] args) {
		
		Mileage obj=new Mileage();
		obj.Bestbike();
		obj.Bike="Yamaha";
		obj.Bestbike();
		
		
		
	}
	
	
}

class Mileage extends Vehicle{
	
	Double average=55.55;

	public void bikemileage() {
		System.out.println("Mileage of pulsar is: "+average);
	}
	
}	