public class BikeRunner{

public static void main(String args[]){

int price[] = {45000,50000,60000,80000};
Bike bikenew = new Bike();
bikenew.bikename="Hero";
bikenew.price = 35000;
bikenew.wheels = 2;
bikenew.weight = 50f;
bikenew.brand = "Honda";
System.out.println("Bike name is:"+bikenew.bikename);
System.out.println("Bike Price is:"+bikenew.price);
System.out.println("Number of wheels are:"+bikenew.wheels);
System.out.println("Bike weight is:"+bikenew.weight);
System.out.println("Bike Brand name is:"+bikenew.brand);
Bike bike = new Bike("Bajaj",price,(short)2,40f,"Discovery");
Bike bike1 = new Bike("Bajaj",price,(short)2,40f,"Discovery");
Bike bike2 = new Bike("Bajaj",price,(short)2,40f,"Discovery");
Bike bike3 = new Bike("Bajaj",price,(short)2,40f,"Discovery");


}



}