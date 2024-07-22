public class TubeLight
{
    public int brightnessLevel;
    public double powerConsumption;
    public String manufacturer;
    public boolean isOn;
    public char energyEfficiencyRating;
    public long warrantyPeriod;

public TubeLight(){
System.out.println("Here is the information about tubelight");
}
public TubeLight(int brightnessLevel){
this.brightnessLevel = brightnessLevel;
 System.out.println("Brightness Level: " +brightnessLevel);
 }
 public TubeLight(int brightnessLevel,double powerConsumption){
this.brightnessLevel = brightnessLevel;
this.powerConsumption = powerConsumption;
 System.out.println("Brightness Level: " +brightnessLevel);
 System.out.println("Power Consumption (Watts): " +powerConsumption);
 }
  public TubeLight(int brightnessLevel,double powerConsumption,String manufacturer){
this.brightnessLevel = brightnessLevel;
this.powerConsumption = powerConsumption;
this.manufacturer = manufacturer;
 System.out.println("Brightness Level: " +brightnessLevel);
 System.out.println("Power Consumption (Watts): " +powerConsumption);
         System.out.println("Manufacturer: " +manufacturer);

 }
   public TubeLight(int brightnessLevel,double powerConsumption,String manufacturer,
   boolean isOn){
this.brightnessLevel = brightnessLevel;
this.powerConsumption = powerConsumption;
this.manufacturer = manufacturer;
this.isOn = isOn;
 System.out.println("Brightness Level: " +brightnessLevel);
 System.out.println("Power Consumption (Watts): " +powerConsumption);
         System.out.println("Manufacturer: " +manufacturer);
        System.out.println("Is On: " +isOn);

 }
    public TubeLight(int brightnessLevel,double powerConsumption,String manufacturer,
   boolean isOn,char energyEfficiencyRating){
this.brightnessLevel = brightnessLevel;
this.powerConsumption = powerConsumption;
this.manufacturer = manufacturer;
this.isOn = isOn;
this.energyEfficiencyRating = energyEfficiencyRating;
 System.out.println("Brightness Level: " +brightnessLevel);
 System.out.println("Power Consumption (Watts): " +powerConsumption);
         System.out.println("Manufacturer: " +manufacturer);
        System.out.println("Is On: " +isOn);
		System.out.println("Energy Efficiency Rating: " +energyEfficiencyRating);

 }
 public TubeLight(int brightnessLevel,double powerConsumption,String manufacturer,
   boolean isOn,char energyEfficiencyRating,long warrantyPeriod){
this.brightnessLevel = brightnessLevel;
this.powerConsumption = powerConsumption;
this.manufacturer = manufacturer;
this.isOn = isOn;
this.isOn = isOn;
this.energyEfficiencyRating = energyEfficiencyRating;
this.warrantyPeriod = warrantyPeriod;
 System.out.println("Brightness Level: " +brightnessLevel);
 System.out.println("Power Consumption (Watts): " +powerConsumption);
         System.out.println("Manufacturer: " +manufacturer);
        System.out.println("Is On: " +isOn);
		System.out.println("Energy Efficiency Rating: " +energyEfficiencyRating);
		   System.out.println("Warranty Period (years): " +warrantyPeriod);

 }
}