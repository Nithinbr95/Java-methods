public class BikeShowRoom{

public String BikeName;
public int start_price;
public String showname;
public String location;
public long contact;
public String gst;
public int price;
public String ownName;
public short collections;
public byte noofemp;

public BikeShowRoom(){
	
	System.out.println("No argument with default constructor");
}
public BikeShowRoom(String BikeName){
	this.BikeName = BikeName;
	System.out.println("The car present in the show room is:"+BikeName);
	
}

public BikeShowRoom(String BikeName,int start_price){
	this.BikeName = BikeName;
	this.start_price = start_price;
	System.out.println("The car present in the show room is:"+BikeName);
	System.out.println("The car Start price is:"+start_price);
}
public BikeShowRoom(String BikeName,int start_price,String showname){
		this.BikeName = BikeName;
	this.start_price = start_price;
	this.showname = showname;
	System.out.println("The car present in the show room is:"+BikeName);
	System.out.println("The car Start price is:"+start_price);
	System.out.println("The Show Room Name is:"+showname);
}
public BikeShowRoom(String BikeName,int start_price,String showname,String location){
	this.BikeName = BikeName;
	this.start_price = start_price;
	this.showname = showname;
	this.location = location;
	System.out.println("The car present in the show room is:"+BikeName);
	System.out.println("The car Start price is:"+start_price);
	System.out.println("The Show Room Name is:"+showname);
	System.out.println("The Show Room location is:"+location);
}
public BikeShowRoom(String BikeName,int start_price,String showname,String location,long contact){
	this.BikeName = BikeName;
	this.start_price = start_price;
	this.showname = showname;
	this.location = location;
	this.contact = contact;
	System.out.println("The car present in the show room is:"+BikeName);
	System.out.println("The car Start price is:"+start_price);
	System.out.println("The Show Room Name is:"+showname);
	System.out.println("The Show Room location is:"+location);
	System.out.println("The Show Room Contact Number is:"+contact);
}
public BikeShowRoom(String BikeName,int start_price,String showname,String location,long contact,String gst){
	this.BikeName = BikeName;
	this.start_price = start_price;
	this.showname = showname;
	this.location = location;
	this.contact = contact;
	this.gst = gst;
	System.out.println("The car present in the show room is:"+BikeName);
	System.out.println("The car Start price is:"+start_price);
	System.out.println("The Show Room Name is:"+showname);
	System.out.println("The Show Room location is:"+location);
	System.out.println("The Show Room contact Number is:"+contact);
	System.out.println("The Show Room GST number is:"+gst);
}
public BikeShowRoom(String BikeName,int start_price,String showname,String location,long contact,String gst,int price){
	this.BikeName = BikeName;
	this.start_price = start_price;
	this.showname = showname;
	this.location = location;
	this.contact = contact;
	this.gst = gst;
	this.price = price;
	System.out.println("The car present in the show room is:"+BikeName);
	System.out.println("The car Start price is:"+start_price);
	System.out.println("The Show Room Name is:"+showname);
	System.out.println("The Show Room Name is:"+location);
	System.out.println("The Show Room contact Number is:"+contact);
	System.out.println("The Show Room GST number is:"+gst);
	System.out.println("The Maximum Price of the Car is:"+price);

}
public BikeShowRoom(String BikeName,int start_price,String showname,String location,long contact,String gst,int price,String ownName){
	this.BikeName = BikeName;
	this.start_price = start_price;
	this.showname = showname;
	this.location = location;
	this.contact = contact;
	this.gst = gst;
	this.price = price;
	this.ownName = ownName;
	System.out.println("The car present in the show room is:"+BikeName);
	System.out.println("The car Start price is:"+start_price);
	System.out.println("The Show Room Name is:"+showname);
	System.out.println("The Show Room Name is:"+location);
	System.out.println("The Show Room contact Number is:"+contact);
	System.out.println("The Show Room GST number is:"+gst);
	System.out.println("The Maximum Price of the Car is:"+price);
		System.out.println("The Show Room GST number is:"+ownName);

}
public BikeShowRoom(String BikeName,int start_price,String showname,String location,long contact,String gst,int price,String ownName,short collections){
	this.BikeName = BikeName;
	this.start_price = start_price;
	this.showname = showname;
	this.location = location;
	this.contact = contact;
	this.gst = gst;
	this.price = price;
	this.ownName = ownName;
	this.collections = collections;
	System.out.println("The car present in the show room is:"+BikeName);
	System.out.println("The car Start price is:"+start_price);
	System.out.println("The Show Room Name is:"+showname);
	System.out.println("The Show Room Name is:"+location);
System.out.println("The Show Room contact Number is:"+contact);
	System.out.println("The Show Room GST number is:"+gst);
	System.out.println("The Maximum Price of the Car is:"+price);
		System.out.println("The Show Room GST number is:"+ownName);
		System.out.println("The Show Room GST number is:"+collections);
}
public BikeShowRoom(String BikeName,int start_price,String showname,String location,long contact,String gst,int price,String ownName,short collections,byte noofemp){
	this.BikeName = BikeName;
	this.start_price = start_price;
	this.showname = showname;
	this.location = location;
	this.contact = contact;
	this.gst = gst;
	this.price = price;
	this.ownName = ownName;
	this.collections = collections;
	this.noofemp = noofemp;
	System.out.println("The car present in the show room is:"+BikeName);
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