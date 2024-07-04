public class PhonepayRunner{

public static void main(String args[]){
Phonepay.login();
Phonepay.account(453745845763L);
Phonepay.upi();
String applications[]= {"Payment","Bill","Recharge"};
Phonepay.status(applications,true);
System.out.println("Google Pay Details");
GooglePay.payments();
GooglePay.develop("Sundar pichi");
GooglePay.upi();
//int year = 2017;
GooglePay.estbl(45000);
} 
}