public class BankRunner{

public static void main(String args[]){

Bank pon = new Bank();
String bankName ="BOB";
int pincode = 577526;
 long helpline = 8767456434L;
 short no_of_employes = 20;
System.out.println("Name of the Bank is:"+bankName);
System.out.println("Helpline is:"+helpline);
System.out.println("Pincode is:"+pincode);
System.out.println("Number of Employees are:"+no_of_employes);
System.out.println("---------------------------------");
Bank pon1 = new Bank("Canara");
Bank pon2 = new Bank(577526,"Canara");
Bank pon3 = new Bank((short)25,577526,"Canara");
Bank pon4 = new Bank(809665654L,(short)25,577526,"Canara");
}

}