public class LaptopDetailsRunner{
public static void main(String[] args){
LaptopDetails laptop = new LaptopDetails();
LaptopDetails laptop1 = new LaptopDetails("Dell");
LaptopDetails laptop2 = new LaptopDetails((byte)1);
LaptopDetails laptop3 = new LaptopDetails(8);
LaptopDetails laptop4 = new LaptopDetails((short)2);
LaptopDetails laptop5 = new LaptopDetails(105l);
LaptopDetails laptop6 = new LaptopDetails(120f);
LaptopDetails laptop7 = new LaptopDetails(13.6);
LaptopDetails laptop8 = new LaptopDetails(true);
LaptopDetails laptop9 = new LaptopDetails('C');
}
}