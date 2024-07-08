public class Application{

public static void job(){
String firstname = "Samsung";
String lastname = "Sangi";
System.out.println("Tne first name of the user is:"+firstname);
System.out.println("Last name was:"+lastname);
}
public static void email(String emailid,long num[]){
System.out.println("Enter the Email id:"+emailid);
for(int index=0;index<num.length;index++){
System.out.println("Entered Mobile number is:"+num[index]);
}
}
public static int salary(){
	String role = "Software Developer";
	int salary = 500000;
	System.out.println("Role you applied was:"+role);
	System.out.println("Salary of that role is:"+salary);
return 5;
}
public static String knowledge(String skills[],int exp){
	System.out.println("Experiance of the applier is:"+exp);
	for(int index=0;index<skills.length;index++){
		System.out.println("The skills are:"+skills[index]);
		
		
	}return "bye";
	
}
}