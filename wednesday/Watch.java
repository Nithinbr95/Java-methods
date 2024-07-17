public class Watch{

public String brands[];
public float seconds;
public short minutes;
public int hour;
public String waterproof;


public Watch(String brands[],float seconds,short minutes,int hour,String waterproof){

this.brands = brands;
this.seconds = seconds;
this.minutes = minutes;
this.hour = hour;
this.waterproof = waterproof;
System.out.println("Seconds in watch is:"+seconds);
System.out.println("Minutes in watch is:"+minutes);
System.out.println("Hour in watch is:"+hour);
System.out.println("Is this watch contain waterproof:"+waterproof);

for(int index=0;index<brands.length;index++){
System.out.println("Watch Brand is:"+brands[index]);
}
}
}