public class Vishalmart{

public static void search(){
String prodname = "Cotton"; 
System.out.println("The product name was:"+prodname);
}
public static void search(String brand,String prodname){
System.out.println("Brand name was:"+brand+"::"+"product name is:"+prodname);

}
public static int brand(){
	String brand = "Zudio";
	String prodname = "Cotton";
	int price = 2000;
System.out.println("Price is:"+price+"::"+"product name is:"+prodname+"::"+"brand is:"+brand);
return 20;
}
public static int search(int size,int price,String prodname,String brand){

System.out.println("The size is:"+size+"::"+"Price is:"+price+"::"+"product name is:"+prodname+"::"+"brand is:"+brand);
return 5;
}
}