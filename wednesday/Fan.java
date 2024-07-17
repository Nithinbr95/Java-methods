public class Fan{

public String brand[];
public float height;
public short weight;
public int price;
public String colour;

public Fan(String brand[],float height,short weight,int price,String colour){

this.brand = brand;
this.height = height;
this.weight = weight;
this.price = price;
this.colour = colour;

System.out.println("Fan Height is:"+height);
System.out.println("Fan Weight is:"+weight);
System.out.println("Fan price is:"+price);
System.out.println("Fan colour is:"+colour);

for(int index=0;index<brand.length;index++){
System.out.println("Fan Brand is:"+brand[index]);
}
}
}