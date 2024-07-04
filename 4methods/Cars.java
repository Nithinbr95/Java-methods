public class Cars{

public static void showroom(){

String name = "Adithya Showroom";
int year = 2020;
System.out.println("Our new car showroom name is:"+name);
if(year<=2024){
System.out.println("Showroom constructed 4 years ago:"+year);
}else{
System.out.println("Showroom not found");
}
}
public static void place(String location,int building_number){
System.out.println("Showroom Location is:"+location);
if(building_number>=45){
System.out.println("Building Number is:"+building_number);
}else{
System.out.println("Building number not found");
}
}
public static int amount(){
	String carname = "Tata Nexon";
     int amount = 8;
	 System.out.println("You Booked car was:"+carname);
	 if(carname== "Tata Nexon"){
		 System.out.println("Car price:"+amount+"lakhs");
		 
	 }else{
		 System.out.println("Car price not provided");
	 }
	 return 8;
}
public static String collection(String stock[],int price,int model){
	for(int collect=0;collect<stock.length;collect++){
		System.out.println("The cars present in showroom are:"+stock[collect]);
		if(price<model){
			System.out.println("Price Start from:"+price);
		}else{
			System.out.println("Model of car is:"+model);
		}
	}
	  return "Car";

}
}