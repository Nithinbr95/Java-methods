public class Firefox{

public static void search(){
String name = "Netzwork";
System.out.println("You searched:"+name);

}
public static void search(String type){
	System.out.println("It gives a:"+type);
}
public static String search(String available,long price){

		System.out.println("Service available are:"+available+"::"+"Start price is:"+price);
		
	return "End";
}
public static void place(String location,int cross){
	System.out.println("Location of the Institute is:"+location+"::"+"Stage:"+cross+"st");
	
}
}