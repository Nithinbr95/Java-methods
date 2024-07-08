public class Meesho{
public static void shoppingType(boolean isOnlineShopping){
	if(isOnlineShopping==true){
		System.out.println(isOnlineShopping+" IT IS A ONLINE SHOPPING");
	}else{
		System.out.println(isOnlineShopping+"IT IS NOT A ONLINE SHOPPING");
	}
}
public static String productsAvilable(String products[]){
	System.out.println("THERE ARE ("+products.length+") TYPES OF PRODUCT AVAILABLE");
	for(int index=0;index<products.length;index++){
		System.out.println("TYPE :"+products[index]);
	}
	return "MORE COMMING SOON";
}
public static void delivery(){
	int delivery = 1; 
	if(delivery <= 1){
		System.out.println("FRIST DELIVERY IS FREE OF COST");
	}else{
		System.out.println("ONLY FREE FOR FIRST DELIVERY");
	}
}
public static double Apprating(){
	double Apprating =4.4;
	if(Apprating >3){
		System.out.println("BEST FOR ONLINE SHOPPING");
	}else{
		System.out.println("CUSTOMER NOT SATIESFIED");
	}
	return 4.4;
}
}