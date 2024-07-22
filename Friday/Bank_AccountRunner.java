public class Bank_AccountRunner{
public static void main(String[] args){
Bank_Account event = new Bank_Account(6547898524695l,"Santhosh S",500.00,"Saving Account",true);
Bank_Account event1 = new Bank_Account(5547898524695l,"Vinod",1000.00,"Saving Account",true);
Bank_Account event2 = new Bank_Account(8547898524695l,"Ganesh",2000.00,"Saving Account",false);
Bank_Account event3 = new Bank_Account(4547898524695l,"Suresh",3000.00,"Saving Account",true);
Bank_Account event4 = new Bank_Account(9547898524695l,"Mahesh",4000.00,"Saving Account",false);

event.bank_Account();
event1.bank_Account();
event2.bank_Account();
event3.bank_Account();
event4.bank_Account();
}
}