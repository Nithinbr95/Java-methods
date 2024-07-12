public class HostStar{

public static String name;
public static String password;
public static String email;
public static long phone;
public static int otp;
public static double ratings;
public static String language;
public static String interest;
public static int plan;
public static String planname;
public static void details(String name,String password,String email,long phone,int otp,double reviews,String language,String interest,int plan,String planname){
HostStar.name = name;
HostStar.password = password;
HostStar.email = email;
HostStar.phone = phone;
HostStar.otp = otp;
HostStar.ratings = ratings;
HostStar.language = language;
HostStar.interest = interest;
HostStar.plan = plan;
HostStar.planname = planname;
}
public static void app(){
System.out.println("NAME : "+HostStar.name);
System.out.println("Password is : "+HostStar.password);
System.out.println("Enter email id : "+HostStar.email);
System.out.println("Number is : "+HostStar.phone);
System.out.println("Enter a four digit OTP : "+HostStar.otp);
System.out.println("App Language is : "+HostStar.language);
System.out.println("User interested for downloading : "+HostStar.interest);
System.out.println("Price of subscription is : "+HostStar.plan);
System.out.println("You choosed plan name is : "+HostStar.planname);
}



}