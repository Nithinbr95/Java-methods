public class Cuvette{

public static void job(){
String title= "Software Consultant";
System.out.println("Job description was:"+title);
}
public static void job(String education){
System.out.println("Education completed by:"+education);
}
public static int job(int salary){
	String skills[]={"Java","c","Python"};
for(int index=0;index<skills.length;index++){
System.out.println("Skills are:"+skills[index]+"::"+salary);
}
return 4 ;
}
public static String job(long number){
System.out.println("Number is:"+number);
return "ok";
} 
}