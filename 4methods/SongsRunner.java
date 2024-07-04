public class SongsRunner{
public static void main(String args[]){
Songs.user();
Songs.premium(500,400);
Songs.download("Rap song",true);
String languages[]={"Kannada","Hindi","English","Telugu"};
Songs.value(languages,45);

System.out.println("Amazon order list");
Amazon.shop();
String items[] = {"Bottel","Bags","Shirts","Shoes"};
Amazon.cart(items,200);
Amazon.purchase();
Amazon.orders("Jeans pant");
}

}