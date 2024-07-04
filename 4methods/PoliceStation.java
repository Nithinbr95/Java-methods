public class PoliceStation{

public static void contact(){
int helpline = 102;
String station_name = "BTM Police Station";
System.out.println("Near police station name is:"+station_name);
if(helpline>102){
System.out.println("Dialed number is wrong");
}
else{
System.out.println("connect to the Btm station:"+helpline);
}
}
public static void inspecters(int noofinspecters){
if(noofinspecters>=4){
System.out.println("Inspecter Post are full:"+noofinspecters);
}else{
System.out.println("Inspecter post is empty");
}
}
public static int salary(){
 long salary = 1000000;
 if(salary<10000020){
 System.out.println("The SubInspector salary was:"+salary);
 }else{
 System.out.println("The salary below SI salary");
 }return 43;
}
public static int stations(String place[],int noofstation){
	for(int index=0;index<place.length;index++){
		if(noofstation<25){
			System.out.println("The stations are:"+place[index]);
		}else{
			
			System.out.println("There is no station present in that region");
		}
		
	}return 54;
}
}