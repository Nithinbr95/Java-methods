public class Pubs{
public static void pubsName(String names[]){
for(int index=0;index<names.length;index++){
System.out.print(names[index]);
if(names[index]=="Sherlocks"){
	System.out.println(" : PUB HAS NO NEARBY METRO");
}else{
	System.out.println(" : PUB HAS NEAR BY METRO");
}
}
}
public static void pubsLocated(){
	String located = "BENGALURU";
	if(located=="BENGALURU"){
	System.out.println(" ALL PUBS ARE LOCATED IN BENGALURU");	
	}else{
	System.out.println(" SOME PUBS ARE NOT LOCATED IN BENGALURU");	
	}
}
public static boolean isAlcohalInpubs(boolean isAlcohalInpubs){
	if(isAlcohalInpubs==true){
		System.out.println("THESE PUBS HAS RESTOBAR ");
	}else{
		System.out.println("NOT ALL PUBS HAS BAR ");
	}
	return true;
}
public static double openTime(){
	double openTime = 10.0;
	if(openTime<=10.0){
		System.out.println("ALL PUBS OPEN AT TIME BELOW 10.00 PM");
	}else{
		System.out.println("ALL PUBS OPEN AT TIME AFTER 10.00 PM");
	}
	return 10.00;
}
}