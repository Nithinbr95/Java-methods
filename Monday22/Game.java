public class Game{
public String gamename;
public String mode;
public int members;
public short pons; 

public Game(){
	
System.out.println("Default Game Mode");

}
public Game(String gamename){
this(4,"Carrom");
System.out.println("Name of the Game is:"+gamename);
}
public Game(int members,String gamename){
this((short)10,4,"Carrom");
System.out.println("Mebers of Playing game is:"+members);
System.out.println("Name of the Game is:"+gamename);
}
public Game(short pons,int members,String gamename){
this("Offline",(short)10,4,"Carrom");
System.out.println("Number of Pons in Carrom board is:"+pons);
System.out.println("Mebers of Playing game is:"+members);
System.out.println("Name of the Game is:"+gamename);
}
public Game(String mode,short pons,int members,String gamename){

System.out.println("Mode of the game is:"+mode);
System.out.println("Number of Pons in Carrom board is:"+pons);
System.out.println("Mebers of Playing game is:"+members);
System.out.println("Name of the Game is:"+gamename);
}
}