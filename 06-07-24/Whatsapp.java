public class Whatsapp{

public static void login(){
long number = 8756430943L;
int otp = 654754;
System.out.println("Enter the mobile number:"+number);
System.out.println("Enter the otp:"+otp);
}
public static void name(String name,int password){
System.out.println("Enter the name:"+name);
System.out.println("Enter the password:"+password);
}
public static String details(){
String contents[] = {"Status","Payment","Followers","Chats"};
for(int connect=0;connect<contents.length;connect++){
System.out.println("The contents in whatsapp are:"+contents[connect]);
}
return "app";
}
public static String messages(String language[]){
for(int msg=0;msg<language.length;msg++){
System.out.println("For Sending languages are:"+language[msg]);
}
return "emoji";
}
}