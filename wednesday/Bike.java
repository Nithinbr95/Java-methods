public class Bike{

public String bikename;
public int price;
public short wheels;
public float weight;
public String brand;

public Bike(){
	
}

public Bike(String bikename,int price[],short wheels,float weight,String brand){

this.bikename = bikename;
//this.price = price;
this.wheels = wheels;
this.weight = weight;
this.brand = brand;

System.out.println("Bike name is:"+bikename);
System.out.println("Number of wheels are:"+wheels);
System.out.println("Bike weight is:"+weight);
System.out.println("Bike Brand name is:"+brand);

for(int index=0;index<price.length;index++){
System.out.println("Bike prices was:"+price[index]);
}

}


}