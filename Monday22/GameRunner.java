public class GameRunner{

public static void main(String args[]){

Game pon = new Game();
String gamename ="Chess";
String mode = "Online";
 int members = 2;
 short pons = 20;
System.out.println("Name of the Game is:"+gamename);
System.out.println("Mode of the game is:"+mode);
System.out.println("Number of Pons in Carrom board is:"+pons);
System.out.println("Mebers of Playing game is:"+members);
System.out.println("---------------------------------");
Game pon1 = new Game("Carrom");
Game pon2 = new Game(4,"Carrom");
Game pon3 = new Game((short)10,4,"Carrom");
Game pon4 = new Game("Offline",(short)10,4,"Carrom");
}

}