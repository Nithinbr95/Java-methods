public class MobileRunner{

public static void main(String args[]){

Mobile phone = new Mobile();
Mobile phone1 = new Mobile("IPhone");
Mobile phone2 = new Mobile("Apple","IPhone");
Mobile cell = new Mobile(65000,"IPhone","Apple");
Mobile cell1 = new Mobile("IPhone","Apple",65000,"White",128,30f,(short)64,(byte)29,"Iphone14Pro",(short)5000);
//System.out.println(Mobile("IPhone","Apple",65000,"White",128,30f,(short)64,(byte)29,"Iphone14Pro",(short)5000));
cell.getmobiledetails("IPhone");
cell.getmobiledetails(65000,"IPhone");
cell.getmobiledetails("IPhone",65000,"IPhone");
cell.getmobiledetails((short)64,"Grapes",65000,"IPhone");
}
}