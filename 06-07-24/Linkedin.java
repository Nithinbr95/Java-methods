public class Linkedin{

public static void name(){
String user_email = "linkedin@gmail.com";
String password = "link@9545";
System.out.println("Linkedein user email was:"+user_email);
System.out.println("Password was:"+password);
}
public static void profile(String name,int age){
System.out.println("Name of the profile holder is:"+name);
System.out.println("Age of the Employer is:"+age);
}
public static String skills(){
String skills[] = {"Communication","Java","Python"};
for(int stat=0;stat<skills.length;stat++){
System.out.println("Employer Skills are :"+skills[stat]);
}return "java";
}
public static int followers(int followers,String role[]){
System.out.println("Linkedin followers are:"+followers);
for(int job=0;job<role.length;job++){
System.out.println("Employe interested roles are:"+role[job]);
}
return 3030;
}
}