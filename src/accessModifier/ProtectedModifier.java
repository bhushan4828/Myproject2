package accessModifier;
//protected is accessible within a package and outside the package but throw the inheritance only.

public class ProtectedModifier {

	protected int x=40;
	 protected void ABCD() {
		 
		 System.out.println("This is Protected Method");
		 
	 }
	
	 
	public static void main(String[] args) {

	ProtectedModifier obj=new ProtectedModifier();
	obj.x=50;
	obj.ABCD();
		
		

	}

}
//but now if we want to access it in to the another package...i.e package2. 