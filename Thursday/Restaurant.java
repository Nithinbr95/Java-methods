public class Restaurant{

public String name;
public String ownerName;
public int start_price;
public String type;
public long contact;
public float rating;
public String location;
public String meals[];
public boolean vegHotel;
public int floor;
public Restaurant(){
System.out.println("no arguments constructer");
}
public Restaurant(String name){
	this.name = name;
	System.out.println("Restaurant name is:"+name);
	
}
public Restaurant(String ownerName,String name){
	this.ownerName = ownerName;
	this.name = name;
	System.out.println("Restaurant name is:"+name);
	System.out.println("Restaurant Owner name is:"+ownerName);
	
}
public Restaurant(int start_price,String ownerName,String name){
	this.start_price = start_price;
	this.ownerName = ownerName;
	this.name = name;
	
	System.out.println("Restaurant name is:"+name);
	System.out.println("Restaurant Owner name is:"+ownerName);
	System.out.println("Start price of food is:"+start_price);
}
public Restaurant(String type,int start_price,String ownerName,String name){
	this.ownerName = ownerName;
	this.name = name;
	this.start_price = start_price;
	this.type = type;
	System.out.println("Restaurant name is:"+name);
	System.out.println("Restaurant Owner name is:"+ownerName);
	System.out.println("Start price of food is:"+start_price);
	System.out.println("Food type is:"+type);
}
public Restaurant(long contact,String type,int start_price,String ownerName,String name){
	this.ownerName = ownerName;
	this.name = name;
	this.start_price = start_price;
	this.type = type;
	this.contact = contact;
	System.out.println("Restaurant name is:"+name);
	System.out.println("Restaurant Owner name is:"+ownerName);
	System.out.println("Start price of food is:"+start_price);
	System.out.println("Food type is:"+type);
    System.out.println("Restaurant contact number is:"+contact);
}
public Restaurant(float rating,long contact,String type,int start_price,String ownerName,String name){
	this.ownerName = ownerName;
	this.name = name;
	this.start_price = start_price;
	this.type = type;
	this.contact = contact;
	this.rating = rating;
	System.out.println("Restaurant name is:"+name);
	System.out.println("Restaurant Owner name is:"+ownerName);
	System.out.println("Start price of food is:"+start_price);
	System.out.println("Food type is:"+type);
    System.out.println("Restaurant contact number is:"+contact);
	System.out.println("Rating is:"+rating);
}
public Restaurant(String location,float rating,long contact,String type,int start_price,String ownerName,String name){
	this.ownerName = ownerName;
	this.name = name;
	this.start_price = start_price;
	this.type = type;
	this.contact = contact;
	this.rating = rating;
	this.location = location;
	System.out.println("Restaurant name is:"+name);
	System.out.println("Restaurant Owner name is:"+ownerName);
	System.out.println("Start price of food is:"+start_price);
	System.out.println("Food type is:"+type);
    System.out.println("Restaurant contact number is:"+contact);
	System.out.println("Rating is:"+rating);
	System.out.println("Restaurant Location was present in"+location);
}
public Restaurant(String meals[]){
	
	this.meals = meals;
	for(int index=0;index<meals.length;index++){
		
		System.out.println("Available meals are:"+meals[index]);
	}
	
}

public Restaurant(boolean vegHotel){
	System.out.println("Is it Veg Restaurant:"+vegHotel);
}
public Restaurant(int floor){
	System.out.println("Restaurant Present in"+floor);
	
	
}





}
