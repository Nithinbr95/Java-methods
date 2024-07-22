public class ShowRoom{

public String carName;
public int start_price;
public String showname;
public String location;
public long contact;
public String gst;
public int price;
public String ownName;
public short collections;
public byte noofemp;

public ShowRoom(){
	
	System.out.println("No argument with default constructor");
}
public ShowRoom(String carName){
	this.carName = carName;
	System.out.println("The car present in the show room is:"+carName);
	
}

public ShowRoom(String carName,int start_price){
	this.carName = carName;
	this.start_price = start_price;
	System.out.println("The car present in the show room is:"+carName);
	System.out.println("The car Start price is:"+start_price);
}
public ShowRoom(String carName,int start_price,String showname){
		this.carName = carName;
	this.start_price = start_price;
	this.showname = showname;
	System.out.println("The car present in the show room is:"+carName);
	System.out.println("The car Start price is:"+start_price);
	System.out.println("The Show Room Name is:"+showname);
}
public ShowRoom(String carName,int start_price,String showname,String location){
	this.carName = carName;
	this.start_price = start_price;
	this.showname = showname;
	this.location = location;
	System.out.println("The car present in the show room is:"+carName);
	System.out.println("The car Start price is:"+start_price);
	System.out.println("The Show Room Name is:"+showname);
	System.out.println("The Show Room location is:"+location);
}
public ShowRoom(String carName,int start_price,String showname,String location,long contact){
	this.carName = carName;
	this.start_price = start_price;
	this.showname = showname;
	this.location = location;
	this.contact = contact;
	System.out.println("The car present in the show room is:"+carName);
	System.out.println("The car Start price is:"+start_price);
	System.out.println("The Show Room Name is:"+showname);
	System.out.println("The Show Room location is:"+location);
	System.out.println("The Show Room Contact Number is:"+contact);
}
public ShowRoom(String carName,int start_price,String showname,String location,long contact,String gst){
	this.carName = carName;
	this.start_price = start_price;
	this.showname = showname;
	this.location = location;
	this.contact = contact;
	this.gst = gst;
	System.out.println("The car present in the show room is:"+carName);
	System.out.println("The car Start price is:"+start_price);
	System.out.println("The Show Room Name is:"+showname);
	System.out.println("The Show Room location is:"+location);
	System.out.println("The Show Room contact Number is:"+contact);
	System.out.println("The Show Room GST number is:"+gst);
}
public ShowRoom(String carName,int start_price,String showname,String location,long contact,String gst,int price){
	this.carName = carName;
	this.start_price = start_price;
	this.showname = showname;
	this.location = location;
	this.contact = contact;
	this.gst = gst;
	this.price = price;
	System.out.println("The car present in the show room is:"+carName);
	System.out.println("The car Start price is:"+start_price);
	System.out.println("The Show Room Name is:"+showname);
	System.out.println("The Show Room Name is:"+location);
	System.out.println("The Show Room contact Number is:"+contact);
	System.out.println("The Show Room GST number is:"+gst);
	System.out.println("The Maximum Price of the Car is:"+price);

}
public ShowRoom(String carName,int start_price,String showname,String location,long contact,String gst,int price,String ownName){
	this.carName = carName;
	this.start_price = start_price;
	this.showname = showname;
	this.location = location;
	this.contact = contact;
	this.gst = gst;
	this.price = price;
	this.ownName = ownName;
	System.out.println("The car present in the show room is:"+carName);
	System.out.println("The car Start price is:"+start_price);
	System.out.println("The Show Room Name is:"+showname);
	System.out.println("The Show Room Name is:"+location);
	System.out.println("The Show Room contact Number is:"+contact);
	System.out.println("The Show Room GST number is:"+gst);
	System.out.println("The Maximum Price of the Car is:"+price);
		System.out.println("The Show Room GST number is:"+ownName);

}
public ShowRoom(String carName,int start_price,String showname,String location,long contact,String gst,int price,String ownName,short collections){
	this.carName = carName;
	this.start_price = start_price;
	this.showname = showname;
	this.location = location;
	this.contact = contact;
	this.gst = gst;
	this.price = price;
	this.ownName = ownName;
	this.collections = collections;
	System.out.println("The car present in the show room is:"+carName);
	System.out.println("The car Start price is:"+start_price);
	System.out.println("The Show Room Name is:"+showname);
	System.out.println("The Show Room Name is:"+location);
System.out.println("The Show Room contact Number is:"+contact);
	System.out.println("The Show Room GST number is:"+gst);
	System.out.println("The Maximum Price of the Car is:"+price);
		System.out.println("The Show Room GST number is:"+ownName);
		System.out.println("The Show Room GST number is:"+collections);
}
public ShowRoom(String carName,int start_price,String showname,String location,long contact,String gst,int price,String ownName,short collections,byte noofemp){
	this.carName = carName;
	this.start_price = start_price;
	this.showname = showname;
	this.location = location;
	this.contact = contact;
	this.gst = gst;
	this.price = price;
	this.ownName = ownName;
	this.collections = collections;
	this.noofemp = noofemp;
	System.out.println("The car present in the show room is:"+carName);
	System.out.println("The car Start price is:"+start_price);
	System.out.println("The Show Room Name is:"+showname);
	System.out.println("The Show Room Name is:"+location);
	System.out.println("The Show Room contact Number is:"+contact);
	System.out.println("The Show Room GST number is:"+gst);
	System.out.println("The Maximum Price of the Car is:"+price);
		System.out.println("The Show Room Owner Name was:"+ownName);
		System.out.println("The Show Room Car collections are:"+collections);
		System.out.println("The Show Room GST number is:"+noofemp);
		
}
}