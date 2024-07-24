public class LaptopRunner{

public static void main(String args[]){

Laptop phone = new Laptop();
Laptop phone1 = new Laptop("Dell");
Laptop phone2 = new Laptop("LOQ","Dell");
Laptop cell = new Laptop(65000,"Dell","LOQ");
Laptop cell1 = new Laptop("Dell","LOQ",65000,"White",128,30f,(short)64,(byte)29,"Windows 11",(short)5000);
//System.out.println(Laptop("Dell","LOQ",65000,"White",128,30f,(short)64,(byte)29,"Windows 11",(short)5000));
cell.getmobiledetails("Dell");
cell.getmobiledetails(65000,"Dell");
cell.getmobiledetails("Dell",65000,"LOQ");
cell.getmobiledetails((short)64,"LOQ",65000,"Dell");
}
}