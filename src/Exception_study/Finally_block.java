package Exception_study;

public class Finally_block {

	public static void main(String[] args) {
	
		int a=50;
		
		System.out.println("Program get started");
		
		try {
		System.out.println(a/0);
		}
		catch(Exception e) {
			
			System.out.println("enter int o the catch box");
		}
		finally{
		System.out.println("we done the program");
		}
		
		
		
		System.out.println("program comleted");
		
		

	}

}
