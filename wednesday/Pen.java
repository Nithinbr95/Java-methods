public class Pen{

public String[] name;
public int price;
public short weight;
public float thickness;
public boolean cap;

public Pen(String[] name,int price,short weight,float thickness,boolean cap){
this.name = name;
this.price = price;
this.weight = weight;
this.thickness = thickness;
this.cap = cap;
System.out.println("Pen Price is:"+price);
System.out.println("Weight of the Pen is:"+weight);
System.out.println("Pen Thickness was:"+thickness);
System.out.println("It have a Cap:"+cap);

for(int index=0;index<name.length;index++){
	
	System.out.println("Available Pens are:"+name[index]);
}



}
}