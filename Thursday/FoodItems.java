public class FoodItems{
	public static int info(){
	System.out.println("FoodItems Name is:"+"Yeppee");
	return 1;
	}
	public static long info(long buyers){
	System.out.println("Total number of buyrs:"+buyers);
	return buyers;

	}
	public static int info(byte food_rating,double rolls){
	System.out.println("Item_rating:"+food_rating+"Total_size Manufactured/year:"+rolls);
	return food_rating;
	}
	public static double info(byte food_rating,double rolls,char grade){
	System.out.println("Item_rating:"+food_rating+"Total_size Manufactured/year:"+rolls+"grade given:"+grade);
	return rolls;
	}
	public static boolean info(byte food_rating,double rolls,boolean good_for_health,char grade){
	System.out.println("Item_rating:"+food_rating+"Total_size Manufactured/year:"+rolls+"good_for_health:"+good_for_health+"grade given:"+grade);
	return good_for_health;
	}
	public static String info(String item_Name,byte food_rating,double rolls,boolean good_for_health,char grade){
	System.out.println("item_Name:"+item_Name+"Item_rating:"+food_rating+"Total_size Manufactured/year:"+rolls+"good_for_health:"+good_for_health+"grade given:"+grade);
	return item_Name;
	}

}