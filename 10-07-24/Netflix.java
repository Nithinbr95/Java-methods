public class Netflix{

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
Netflix.name = name;
Netflix.password = password;
Netflix.email = email;
Netflix.phone = phone;
Netflix.otp = otp;
Netflix.ratings = ratings;
Netflix.language = language;
Netflix.interest = interest;
Netflix.plan = plan;
Netflix.planname = planname;
}
public static void app(){
System.out.println("NAME : "+Netflix.name);
System.out.println("Password is : "+Netflix.password);
System.out.println("Enter email id : "+Netflix.email);
System.out.println("Number is : "+Netflix.phone);
System.out.println("Enter a four digit OTP : "+Netflix.otp);
System.out.println("Ratings of Netflix is : "+Netflix.ratings);
System.out.println("App Language is : "+Netflix.language);
System.out.println("User interested for downloading : "+Netflix.interest);
System.out.println("Price of subscription is : "+Netflix.plan);
System.out.println("You choosed plan name is : "+Netflix.planname);
}



}