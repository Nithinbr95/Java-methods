public class Bank{

public String bankName;
public int pincode;
public short no_of_employes;
public long helpline;
public Bank(){
	this("Canara");
System.out.println("Default Bank Mode");

}
public Bank(String bankName){
this(577526,"Canara");
System.out.println("Name of the Bank is:"+bankName);
}
public Bank(int pincode,String bankName){
this((short)25,577526,"Canara");
System.out.println("Pincode is:"+pincode);
System.out.println("Name of the Bank is:"+bankName);
}
public Bank(short no_of_employess,int pincode,String bankName){
this(809665654L,(short)25,577526,"Canara");
System.out.println("Pincode is:"+pincode);
System.out.println("Number of Employees are:"+no_of_employes);
System.out.println("Name of the Bank is:"+bankName);
}
public Bank(long helpline,short no_of_employess,int members,String bankName){

System.out.println("Helpline is:"+helpline);
System.out.println("Pincode is:"+pincode);
System.out.println("Number of Employees are:"+no_of_employes);
System.out.println("Name of the Bank is:"+bankName);

}
}

