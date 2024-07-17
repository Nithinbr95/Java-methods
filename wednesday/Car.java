public class Car{

public String carname;
public short doors;
public float weight;
public int price;
public String colors[];

public Car(String carname,short doors,float weight,int price,String colors[]){
this.carname = carname;
this.doors = doors;
this.weight = weight;
this.price = price;
this.colors = colors;
System.out.println("Name of the car was:"+carname);
System.out.println("Number of doors in a car was:"+doors);
System.out.println("Weight of the car was:"+weight);
System.out.println("Price of the car is:"+price);

for(int index=0;index<colors.length;index++){
System.out.println("Colours of the car was:"+colors[index]);
}
}
}