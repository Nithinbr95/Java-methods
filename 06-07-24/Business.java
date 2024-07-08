public class Business{

public static void businessname(){
String name = "NSRVG Group";
String gstno = "G4376509";
System.out.println("Name of the company was:"+name);
System.out.println("GST number is:"+gstno);
}
public static void location(String address,long phone[]){
System.out.println("Company location was:"+address);
for(int grp=0;grp<phone.length;grp++){
System.out.println("Contact details are:"+phone[grp]);
}
}
public static String mail(){
String emailid = "nsrvg@info.com";
System.out.println("Business email id was:"+emailid);
return "New";
}
public static int role(String roles[],int businessid){
System.out.println("Business id was:"+businessid);
for(int index=0;index<roles.length;index++){
System.out.println("Hiring roles are:"+roles[index]);
}
return 20;
}

}