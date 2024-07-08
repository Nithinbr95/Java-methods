public class Facebook{

public static void login(){
String username = "RSlover";
String password = "lower@7564";
System.out.println("User Name was:"+username);
System.out.println("Password is:"+password);
}
public static void content(String contents[]){
for(int index=0;index<contents.length;index++){
System.out.println("The contents are:"+contents[index]);
}
}
public static int dob(){
String dob = "20/07/2010";
System.out.println("Date of birth was:"+dob);
return 20;
}
public static String languages(String languages[],int friends){
System.out.println("Followers in Facebook are:"+friends);
for(int index=0;index<languages.length;index++){
System.out.println("Facebook provides many languages like:"+languages[index]);
}return "ok";
}
}