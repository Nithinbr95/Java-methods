public class Amazon{

public static void shop(){
String shoppingtype = "online";
System.out.println("Shopping in :"+shoppingtype); 
int bill = 3000;
byte items = 2;
if(bill>items){
System.out.println("Your shopped with :"+bill+"rs");
}
System.out.println("You Cart is empty");
}
public static void cart(String items[], int totalprice){
for(int carry=0;carry<items.length;carry++){
if(totalprice<=3000){
System.out.println("Cart items are:"+items);
}else{
System.out.println("your cart is empty");
}
}
}
public static int purchase(){
int amount=14000;
String mobile = "Vivo V21";
System.out.println("You Purchased new mobile:"+mobile);
if(amount<15000){
System.out.println("Your mobile Price is:"+amount);
}else{
System.out.println("You have not purchase any mobile");
}return 5;
}
public static int orders(String name){
int orders =2;
System.out.println("You purchased dress was:"+name);
if(orders>2){
System.out.println("Your ordered items are:"+orders);
}return 4;
}
}