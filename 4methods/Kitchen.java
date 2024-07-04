public class Kitchen{

public static void door(){
int noofdoor = 2;
String name = "Refrigerator";
System.out.println("The number of doors in kitchen are:"+noofdoor);
if(noofdoor<4){
System.out.println("For Storing items in cold we use:"+name);
}else{
System.out.println("We dont use any cold materials");
}
}
public static void item(String material,int windows){
System.out.println("For storing a box we use:"+material);
if(windows<3){
System.out.println("Number of windows are:"+windows);
}else{
System.out.println("There is no windows in kitchen");
}
}
public static int surround(){
 int square = 100;
 if(square<200){
 System.out.println("The kitchen medium size:"+square);
 }else{
 System.out.println("The kitchen larger in size");
}return 10;
}
public static int materials(String material[],int lights){
System.out.println("Number of lights present in kitchen are:"+lights);
for(int index=0;index<material.length;index++){
if(lights<5){
System.out.println("Inside the kitchen materials are: "+material[index]);
}else{
System.out.println("There is no material inside kitchen");
}
}return 20;
}

}