public class Phonepay{

public static void login(){
String name ="Naresh";
long number = 9435467583L;
System.out.println("Entered Name is:"+name);
if(number<=number){
System.out.println("Enter OTP on sended number is:"+number);
}else{
	System.out.println("Entered wrong number");
}
}
public static void account(long ac_num){
	long atm = 4546;
	System.out.println("Entered your account number is:"+ac_num);
	if(atm<=ac_num){
		System.out.println("Enter a last 4 digit atm card number:"+atm);
}else{
	System.out.println("Cannot found any account");
}
}
public static int upi(){
	String upi_id = "naresh@ybl";
	String upi = "7456342245@bbl";
	if(upi!=upi){
		System.out.println("Your Upi ID is:"+upi_id);
	}else{
	System.out.println("You Entered wrong UPI ID");
}return 3;
}
public static boolean status(String applications[],boolean status){
	
	for(int index=0;index<applications.length;index++){
		if(status){
			System.out.println("PhonePay provides:"+applications[index]);
		}else{
			System.out.println("Phonepay give Scanner");
		}
	}return true;
}
}
