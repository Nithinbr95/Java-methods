public class OrderRunner{

public static void main(String args[]){

Order shop = new Order();
shop.getshopingitem();
System.out.println("Length of the array is:"+shop.getshopingitem());
shop.getshopingitem(1000);
shop.getshopingitem(2000);
shop.getshopingitem(100);
shop.getshopingitem(300);
shop.getshopingitem(500);
shop.readarray();
}


}