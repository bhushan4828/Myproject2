package this_Keyword;

//2. this keyword is used TO invoke the current class method

public class This_keyword_2 {

	public void method1(int a,String b) {
		System.out.println(a+" "+b);
	}
	
	public void method2() {
		this.method1(10, "Bhushan");
		System.out.println("Hello Velocity");
	}
	

	public static void main(String[] args) {
	 This_keyword_2 obj=new This_keyword_2();
	 obj.method2();

	}

}
