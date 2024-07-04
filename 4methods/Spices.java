public class Spices{

public static void powder(){

String name = "Tumeric Powder";
int price = 10;
if(price>=10){
System.out.println("Amount of Tumeric Powder is:"+price);
}else{
System.out.println("Not found any items");
}
}
public static void masala(String name){
int masalaprice = 20;
System.out.println("Masala name is:"+name);
if(masalaprice<20){
System.out.println("Items are not available");
}else{
System.out.println("Masala price is:"+masalaprice);
}
}
public static int productid(){
int productid = 453584;
String brand = "MTR";
System.out.println("The masala brand name is:"+brand);
if(brand=="MTR"){
System.out.println("MTR product id is:"+productid);
}else{
System.out.println("Product id not found");
}return 56;
}
public static int year(String ingredreints[],int manyear){
for(int index=0;index<ingredreints.length;index++){
System.out.println("Manufactured year is:"+manyear);
if(manyear>2024){
System.out.println("Ingredeints are:"+ingredreints);
}else{
System.out.println("Ingredeints not found");
}
}return 2020;
}
}