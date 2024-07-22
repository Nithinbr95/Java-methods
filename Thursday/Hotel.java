public class Hotel{

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
public Hotel(){
System.out.println("no arguments constructer");
}
public Hotel(String name){
	this.name = name;
	System.out.println("Hotel name is:"+name);
	
}
public Hotel(String ownerName,String name){
	this.ownerName = ownerName;
	this.name = name;
	System.out.println("Hotel name is:"+name);
	System.out.println("Hotel Owner name is:"+ownerName);
	
}
public Hotel(int start_price,String ownerName,String name){
	this.start_price = start_price;
	this.ownerName = ownerName;
	this.name = name;
	
	System.out.println("Hotel name is:"+name);
	System.out.println("Hotel Owner name is:"+ownerName);
	System.out.println("Start price of food is:"+start_price);
}
public Hotel(String type,int start_price,String ownerName,String name){
	this.ownerName = ownerName;
	this.name = name;
	this.start_price = start_price;
	this.type = type;
	System.out.println("Hotel name is:"+name);
	System.out.println("Hotel Owner name is:"+ownerName);
	System.out.println("Start price of food is:"+start_price);
	System.out.println("Food type is:"+type);
}
public Hotel(long contact,String type,int start_price,String ownerName,String name){
	this.ownerName = ownerName;
	this.name = name;
	this.start_price = start_price;
	this.type = type;
	this.contact = contact;
	System.out.println("Hotel name is:"+name);
	System.out.println("Hotel Owner name is:"+ownerName);
	System.out.println("Start price of food is:"+start_price);
	System.out.println("Food type is:"+type);
    System.out.println("Hotel contact number is:"+contact);
}
public Hotel(float rating,long contact,String type,int start_price,String ownerName,String name){
	this.ownerName = ownerName;
	this.name = name;
	this.start_price = start_price;
	this.type = type;
	this.contact = contact;
	this.rating = rating;
	System.out.println("Hotel name is:"+name);
	System.out.println("Hotel Owner name is:"+ownerName);
	System.out.println("Start price of food is:"+start_price);
	System.out.println("Food type is:"+type);
    System.out.println("Hotel contact number is:"+contact);
	System.out.println("Rating is:"+rating);
}
public Hotel(String location,float rating,long contact,String type,int start_price,String ownerName,String name){
	this.ownerName = ownerName;
	this.name = name;
	this.start_price = start_price;
	this.type = type;
	this.contact = contact;
	this.rating = rating;
	this.location = location;
	System.out.println("Hotel name is:"+name);
	System.out.println("Hotel Owner name is:"+ownerName);
	System.out.println("Start price of food is:"+start_price);
	System.out.println("Food type is:"+type);
    System.out.println("Hotel contact number is:"+contact);
	System.out.println("Rating is:"+rating);
	System.out.println("Hotel Location was present in"+location);
}
public Hotel(String meals[]){
	
	this.meals = meals;
	for(int index=0;index<meals.length;index++){
		
		System.out.println("Available meals are:"+meals[index]);
	}
	
}

public Hotel(boolean vegHotel){
	System.out.println("Is it Veg Hotel:"+vegHotel);
}
public Hotel(int floor){
	System.out.println("Hotel Present in"+floor);
	
	
}





}
