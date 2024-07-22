public class MobileRunner{

public static void main(String args[]){

Mobile phone = new Mobile();
Mobile phone1 = new Mobile("IPhone");
Mobile phone2 = new Mobile((short)5000,"IPhone");
Mobile phone3 = new Mobile((short)5000,"APPLE","IPhone");
Mobile phone4 = new Mobile(60000,(short)5000,"APPLE","IPhone");
Mobile phone5 = new Mobile(40f,60000,(short)5000,"APPLE","IPhone");
Mobile phone6 = new Mobile("IPhone",40f,60000,(short)5000,"APPLE","Amoled");
Mobile phone7 = new Mobile((byte)64,5.0d,40f,60000,(short)5000,"APPLE","Amoled");
Mobile phone8 = new Mobile(40f,"Black",5.0d,(byte)64,6460000,(short)5000,"APPLE","IPhone","Amoled");
Mobile phone9 = new Mobile(true,40f,"Black",5.0d,(byte)64,6460000,(short)5000,"APPLE","IPhone","Amoled");
//Mobile phone10 = new Mobile(40f,(byte)64,5.0,60000,(short)5000,"APPLE","IPhone","Amoled");
}


}