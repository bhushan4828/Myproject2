package this_Keyword;

//1.To refer the current class instance variable

class myclass{
	
	int a;
	String name;
	
	public myclass(int a,String name) //constructor 
	{
        this.a=a;	     
		this.name=name;
				
	}
	
	public void myMethod() {
		System.out.println(a+" "+name);
	}
	
}


public class This_keyword {

	public static void main(String[] args) {

		myclass obj=new myclass(10, "Nishant");
		obj.myMethod();
		

	}

}
