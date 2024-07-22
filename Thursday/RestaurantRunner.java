public class RestaurantRunner{

public static void main(String args[]){

Restaurant hotel = new Restaurant();
Restaurant hotel1 = new Restaurant("Durga");
Restaurant hotel2 = new Restaurant("Dwarkesh","Durga");
Restaurant hotel3 = new Restaurant(60,"Dwarkesh","Durga");
Restaurant hotel4 = new Restaurant("Non-Veg",60,"Dwarkesh","Durga");
Restaurant hotel5 = new Restaurant(9343432334L,"Non-Veg",60,"Dwarkesh","Durga");
Restaurant hotel6 = new Restaurant(6.5f,9343432334L,"Non-Veg",60,"Dwarkesh","Durga");
Restaurant hotel7 = new Restaurant("Mysore",6.5f,9343432334L,"Non-Veg",60,"Dwarkesh","Durga");
String meals[] = {"Biriyani","EggRice","FishFry","Kabab"};
Restaurant menu = new Restaurant(meals);
Restaurant hotel8 = new Restaurant(false);
Restaurant hotel9 = new Restaurant(2);
}




}