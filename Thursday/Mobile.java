public class Mobile{

public String mobName;
public short baterrycap;
public String brand;
public int price;
public float weight;
public String screentype;
public byte storage;
public String colour;
public double inch;
public boolean fingerprint;
public Mobile(){
System.out.println("No argument default constructer");
}
public Mobile(String mobName){
this.mobName = mobName;
System.out.println("Name of the mobile is:"+mobName);
}
public Mobile(short baterrycap,String mobName){
this.baterrycap = baterrycap;
this.mobName = mobName;
System.out.println("Name of the mobile is:"+mobName);
System.out.println("Baterry Capacity:"+baterrycap);
}
public Mobile(short baterrycap,String brand,String mobName){
	
this.baterrycap = baterrycap;
this.brand = brand;
this.baterrycap = baterrycap;
System.out.println("Baterry Capacity:"+baterrycap);
System.out.println("Baterry Capacity:"+baterrycap);
System.out.println("Brand name is:"+brand);
}

public Mobile(int price,short baterrycap,String brand,String mobName){
this.price = price;
this.baterrycap = baterrycap;
this.brand = brand;
this.mobName = mobName;
System.out.println("Baterry Capacity:"+baterrycap);
System.out.println("Baterry Capacity:"+baterrycap);
System.out.println("Brand name is:"+brand);
System.out.println("Price of the Mobile is:"+price);
}
public Mobile( float weight,int price,short baterrycap,String brand,String mobName){
this.weight = weight;
this.price = price;
this.baterrycap = baterrycap;
this.brand = brand;
this.mobName = mobName;
System.out.println("Baterry Capacity:"+baterrycap);
System.out.println("Baterry Capacity:"+baterrycap);
System.out.println("Brand name is:"+brand);
System.out.println("Price of the Mobile is:"+price);
System.out.println("weight of the Mobile is:"+weight);

}
public Mobile(String mobName,float weight,int price,short baterrycap,String brand,String screentype){
	this.screentype = screentype;
	this.weight = weight;
this.price = price;
this.baterrycap = baterrycap;
this.brand = brand;
this.mobName = mobName;
System.out.println("Mobile ScreebType is:"+screentype);
System.out.println("Baterry Capacity:"+baterrycap);
System.out.println("Brand name is:"+brand);
System.out.println("Price of the Mobile is:"+price);
System.out.println("weight of the Mobile is:"+weight);
}
public Mobile(double inch,float weight,int price,short baterrycap,String brand,String mobName,String screentype){
	this.inch = inch;
	this.screentype = screentype;
	this.weight = weight;
this.price = price;
this.baterrycap = baterrycap;
this.brand = brand;
this.mobName = mobName;
System.out.println("Mobile Inch:"+inch);
System.out.println("Mobile screentype is:"+screentype);
System.out.println("Mobile weight:"+weight);
System.out.println("Price of the Mobile is:"+price);
System.out.println("Baterry Capacity of the Mobile is:"+baterrycap);
System.out.println("Brand name is:"+brand);
System.out.println("Name of the Mobile is:"+mobName);

}
public Mobile(byte storage,double inch,float weight,int price,short baterrycap,String brand,String mobName,String screentype){
	this.storage = storage;
	this.inch = inch;
	this.screentype = screentype;
	this.weight = weight;
this.price = price;
this.baterrycap = baterrycap;
this.brand = brand;
this.mobName = mobName;
System.out.println("Mobile storage is:"+storage);
System.out.println("Mobile Inch:"+inch);
System.out.println("Mobile screentype is:"+screentype);
System.out.println("Mobile weight:"+weight);
System.out.println("Price of the Mobile is:"+price);
System.out.println("Baterry Capacity of the Mobile is:"+baterrycap);
System.out.println("Brand name is:"+brand);
System.out.println("Name of the Mobile is:"+mobName);

}
public Mobile( float weight,String colour,double inch,byte storage,int price,short baterrycap,String brand,String mobName,String screentype){
	this.storage = storage;
	this.colour = colour;
	this.inch = inch;
	this.screentype = screentype;
	this.weight = weight;
this.price = price;
this.baterrycap = baterrycap;
this.brand = brand;
this.mobName = mobName;
System.out.println("Mobile colour is:"+colour);
System.out.println("Mobile storage is:"+storage);
System.out.println("Mobile Inch:"+inch);
System.out.println("Mobile screentype is:"+screentype);
System.out.println("Mobile weight:"+weight);
System.out.println("Price of the Mobile is:"+price);
System.out.println("Baterry Capacity of the Mobile is:"+baterrycap);
System.out.println("Brand name is:"+brand);
System.out.println("Name of the Mobile is:"+mobName);

}
public Mobile( boolean fingerprint,float weight,String colour,double inch,byte storage,int price,short baterrycap,String brand,String mobName,String screentype){
	this.fingerprint = fingerprint;
	this.storage = storage;
	this.colour = colour;
	this.inch = inch;
	this.screentype = screentype;
	this.weight = weight;
this.price = price;
this.baterrycap = baterrycap;
this.brand = brand;
this.mobName = mobName;
System.out.println("Mobile has Fingerprint :"+fingerprint);
System.out.println("Mobile colour is:"+colour);
System.out.println("Mobile storage is:"+storage);
System.out.println("Mobile Inch:"+inch);
System.out.println("Mobile screentype is:"+screentype);
System.out.println("Mobile weight:"+weight);
System.out.println("Price of the Mobile is:"+price);
System.out.println("Baterry Capacity of the Mobile is:"+baterrycap);
System.out.println("Brand name is:"+brand);
System.out.println("Name of the Mobile is:"+mobName);

}
}