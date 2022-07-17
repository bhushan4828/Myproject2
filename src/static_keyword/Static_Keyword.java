package static_keyword;

public class Static_Keyword {

	int rollno;
	float marks;
	String name;
	static String school="Jyoti Vidhyalay";
	
    
	public void methos1(String name,float marks,int rollno) {
		
		this.marks=marks;
		this.rollno=rollno;
		this.name=name;
		
		System.out.println(name+" "+rollno+" "+marks+" "+school);
		
		
	}
	
	public static void main(String[]args) {
		
	Static_Keyword obj=new Static_Keyword();
	
	obj.methos1("Nishant",80.80f,12);
	
		
		
	}
	
	
}
