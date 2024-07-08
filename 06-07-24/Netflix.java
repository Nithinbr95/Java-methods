public class Netflix{

public static void name(){
String username = "Nithin";
String password = "Nithin@9467";
System.out.println("User name :"+username);
System.out.println("Password is :"+password);
}
public static void subscription(int plans[],String plan_name){
System.out.println("Yearly plan for netflix subcriptions are:"+plan_name);
for(int index=0;index<plans.length;index++){
System.out.println("Plans for Subcription are:"+plans[index]);
}
}
public static int language(String languages[]){

for(int ring=0;ring<languages.length;ring++){
System.out.println("The languages are:"+languages[ring]);
}return 5;
}
public static String rating(int rating){
if(rating>8){
System.out.println("Ratings of Netflix are:"+rating);
}else{
System.out.println("There is no ratings");
}return "end";
}
}