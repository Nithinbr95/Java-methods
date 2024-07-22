public class LaptopDetails

{
public String laptopName;
public byte weight;
public int ram;
public short rom;
public long keyboard;
public float mouse ;
public double display;
public boolean usbPort;
public char chargerType;

public LaptopDetails(){
System.out.println("Here is Information about Laptop");
}
public LaptopDetails(String laptopName){
this.laptopName = laptopName;
System.out.println("Laptop Name :"+laptopName);
}
public LaptopDetails(byte weight){
this.weight=weight;
System.out.println("Laptop Weight :"+weight+"kg");
}
public LaptopDetails(int ram){
this.ram=ram;
System.out.println("RAM in GB : "+ram+"gb");
}
public LaptopDetails(short rom){
this.rom=rom;
System.out.println("ROM is : "+rom+"gb");
}
public LaptopDetails(long keyboard){
this.keyboard=keyboard;
System.out.println("Total keys in keyboard : "+keyboard);
}
public LaptopDetails(float mouse){
this.mouse=mouse;
System.out.println("weight of mouse : "+mouse+"g");
}
public LaptopDetails(double display){
this.display=display;
System.out.println("Display size : "+display+"inches");
}
public LaptopDetails(boolean usbPort){
this.usbPort=usbPort;
System.out.println("is USB port is there : "+usbPort);
}
public LaptopDetails(char chargerType){
this.chargerType=chargerType;
System.out.println("Charger type is : "+chargerType);
}
}


