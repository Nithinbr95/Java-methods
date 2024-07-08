public class Digilocker{

public static void login(){
String name = "Nithin";
long adhar = 968546372637L;
System.out.println("Enter the name:"+name);
System.out.println("Enter adhar number:"+adhar);
} 
public static void login(long phone,int otp){
System.out.println("Enter the Mobile Number:"+phone);
System.out.println("Enter the otp:"+otp);
}
public static void search(){
String documents[] = {"Adhar","Marks card","Driving","PAN"};
for(int index=0;index<documents.length;index++){
System.out.println("Available documents are:"+documents[index]);
}
}
public static void login(String language[]){
for(int index=0;index<language.length;index++){
System.out.println("App Languages are:"+language[index]);
}

}
}