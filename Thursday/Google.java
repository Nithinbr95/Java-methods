public class Google{

public static String name = "Gokarna Package";
public static String place = "Gokarna";
public static int price = 5000;
public static float rating = 6.0f;
public static int visitors = 1000;



public static void tour(String guide,int exp,String famous,boolean tourist,int since){
System.out.println("Guidance by:"+guide+" Guide Experiance:"+exp+" Place is Famous for:"+famous+" Tourist Since from:"+tourist+" Since:"+since);
if(tourist){
System.out.println("It is a tourist Place");
}else{
System.out.println("It is not a tourist Place");

} 

}

}
