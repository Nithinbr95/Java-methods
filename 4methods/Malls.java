public class Malls{
public static void mallsName(String names[]){
for(int index=0;index<names.length;index++){
System.out.print(names[index]);
if(names[index]=="MALL OF ASIA"){
	System.out.println(" : MALL HAS NO NEARBY METRO");
}else{
	System.out.println(" : MALL HAS NEAR BY METRO");
}
}
}
public static void mallsLocated(){
	String located = "BENGALURU";
	if(located=="BENGALURU"){
	System.out.println(" ALL MALLS ARE LOCATED IN BENGALURU");	
	}else{
	System.out.println(" SOME MALLS ARE NOT LOCATED IN BENGALURU");	
	}
}
public static boolean isTheaterInMalls(boolean isTheaterInMalls){
	if(isTheaterInMalls==true){
		System.out.println("THESE MALLS HAS THEATERS ");
	}else{
		System.out.println("NOT ALL MALLS HAS THEATERS ");
	}
	return true;
}
public static double openTime(){
	double openTime = 10.0;
	if(openTime<=10.0){
		System.out.println("ALL MALLS OPEN AT TIME BELOW 10.00 AM");
	}else{
		System.out.println("ALL MALLS OPEN AT TIME AFTER 10.00 AM");
	}
	return 10.00;
}
}