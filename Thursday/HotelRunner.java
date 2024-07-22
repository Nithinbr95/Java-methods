public class HotelRunner{

public static void main(String args[]){

Hotel hotel = new Hotel();
Hotel hotel1 = new Hotel("Durga");
Hotel hotel2 = new Hotel("Dwarkesh","Durga");
Hotel hotel3 = new Hotel(60,"Dwarkesh","Durga");
Hotel hotel4 = new Hotel("Non-Veg",60,"Dwarkesh","Durga");
Hotel hotel5 = new Hotel(9343432334L,"Non-Veg",60,"Dwarkesh","Durga");
Hotel hotel6 = new Hotel(6.5f,9343432334L,"Non-Veg",60,"Dwarkesh","Durga");
Hotel hotel7 = new Hotel("Mysore",6.5f,9343432334L,"Non-Veg",60,"Dwarkesh","Durga");
String meals[] = {"Biriyani","EggRice","FishFry","Kabab"};
Hotel menu = new Hotel(meals);
Hotel hotel8 = new Hotel(false);
Hotel hotel9 = new Hotel(2);
}




}