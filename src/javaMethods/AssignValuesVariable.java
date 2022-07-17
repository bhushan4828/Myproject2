package javaMethods;

/* we can assign a values to the variables by using a three ways
 * 1.Assign a value by using reference variable
 * 2.By using Method
 * 3.By using constructor
 */

//1.Assign a value by using reference variable

public class AssignValuesVariable {

	/*int id;      //----> these are the class variables.
	String Name;
	char grade;
	
	public void student() {
		
      System.out.println(id+" "+Name+" "+grade);
      
	}
		
	public static void main(String[] args) {
		
		AssignValuesVariable obj2=new AssignValuesVariable();
		
		obj2.id=2;      //Assign a value by using reference variable
		obj2.Name="Bhushan";
		obj2.grade='A';
	
		obj2.student();
		
	}*/

	//2.assign value to the variable by using a method. This the best method please use this
	
	/*public void student2(int rollno,String Name,char grade) {
		
		System.out.println(rollno+" "+Name+" "+grade);
		
	}
	
	public static void main(String[] args) {
    		
    AssignValuesVariable obj2=new AssignValuesVariable();
    obj2.student2(21,"Sumit",'B');
	
		}*/
	
	//we can asssign by using class variable also in this same method
	
	int rollno;  //these are the class variable
	String Name;
	char grade;
	
	public void student3(int id,String sName,char sGrade) {
		
		rollno=id;
		Name=sName;
		grade=sGrade;
		
		System.out.println(rollno+" "+Name+" "+grade);
		
	}
	
	public static void main(String[] args) {
		
		AssignValuesVariable obj3=new AssignValuesVariable();
		
		obj3.student3(22,"Kunal",'C');
		
	}
	
	
}
	 