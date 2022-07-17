package super_keyword;



class Univercity{
	int a;
	String name;
	
	public Univercity(int a,String name) {

	System.out.println(a+" "+name);
		
	}
	
}

class School extends Univercity{

 public School(int a,String name) {
	 
	 super(a, name);
	 
 }
	
	float f;
	public void method(float f){

		this.f=-f;
		f=20.20f;
		
		System.out.println(f);
		
	}
	
	
}


public class PPP {

	
	public static void main(String[] args) {
		School obj=new School(10, "velocity");
        obj.method(20.20f);
	}

}
