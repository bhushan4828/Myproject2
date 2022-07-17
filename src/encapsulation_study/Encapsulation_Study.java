package encapsulation_study;


class dummy{
	
	private String pass;
	
	public String getPass() {
	return pass;	
	}
	
	public void setPass(String newPass) {
		pass=newPass;
	}
	
}


public class Encapsulation_Study {
		
	public static void main(String[] args) {

		dummy obj=new dummy();
		obj.setPass("Velocity");
		System.out.println(obj.getPass());
		
		
	}

}
