public class Microsoft{

public static void search(){
String name = "XWORKZ";
System.out.println("You searched:"+name);

}
public static void search(String type){
	System.out.println("It gives a:"+type);
}
public static String search(String coachings[]){
	for(int index=0;index<coachings.length;index++){
		System.out.println("Cochings are:"+coachings[index]);
		
	}
return "ok";	
}
public static void search(String location,int cross){
	System.out.println("Location of the Institute is:"+location+"::"+"Stage:"+cross+"st");
	
}
}