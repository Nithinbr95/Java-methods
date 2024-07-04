public class Silver{
	public static final double gst = 0.10;
public static void silverRate(){
int silverRate =2000;
System.out.println("SILVER RATE PER GRAM :"+silverRate);
}
public static void type(){
String type ="BRACELET";
System.out.println("SILVER TYPE :"+type);
}
public static void Price(){
int Price =16000;
System.out.println("PRICE FOR 8 GRAMS :"+Price);

}
public static void getGst(int price){
double getGst =price*Cloth.gst;
System.out.println("PLUS GST 10% :"+getGst);

}
public static void totalPrice(int price){
double totalPrice =price+(price*Silver.gst);
System.out.println("TOTAL PRICE INCLUDING GST :"+totalPrice);
}
}