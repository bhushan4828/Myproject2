package super_keyword;

//1.super keyword can be used to invoke parent class method

class Animal{
	
	public int method12(int a) {
		System.out.println(a);
		return 10;
     
	}
}

class dog extends Animal{
	
	public void method1() {
		System.out.println("Dogs are loyal");
		
		System.out.println(super.method12(12));
		}
	
	
}




public class Super_keyword2 {

	public static void main(String[] args) {
		
	dog obj=new dog();
	obj.method1();
		

	}

}
