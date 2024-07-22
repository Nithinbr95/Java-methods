public class Bank_Account{
long accountNumber;
String holderName;
double balance;
String accountType;
boolean isActive;

public Bank_Account(long accountNumber, String holderName, double balance, String accountType, boolean isActive){
this.accountNumber = accountNumber;
this.holderName = holderName;
this.balance = balance;
this.accountType = accountType;
this.isActive = isActive;
}
public void bank_Account(){
System.out.println("account Number :"+accountNumber);
System.out.println("holder Name :"+holderName);
System.out.println("balance :"+balance);
System.out.println("account Type  :"+accountType);
System.out.println("is Active  :"+isActive);
}
}