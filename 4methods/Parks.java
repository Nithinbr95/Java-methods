public class Parks{

public static void name(){
String name = "Cubbon parks";
int builtin = 1870;
System.out.println("Name of the park is:"+name);
if(builtin<2000){
System.out.println("Cubbon park built in:"+builtin);
}else{
System.out.println("Park not found");
}
}
public static void location(String direction,int area){
System.out.println("Cubbon Park location is:"+direction);
if(area<500){
System.out.println("Cubbon Park Surrounded around :"+area+"acres");
}else{
System.out.println("Area not properly disclosed");
}
}
public static int entry(){
int entry_price=50;
if(entry_price<60){
System.out.println("Price is same as earlier:"+entry_price);
}else{
System.out.println("Price is hike");
}return 5;
}
public static int time(String commisioned,int time,String days[]){
 System.out.println("Cubbon Park commisioned by:"+commisioned);
 for(int index=0;index<days.length;index++){
 System.out.println("Cubbon Park Opened days are:"+days[index]);
  if(time<6){
  System.out.println("Cubbon Park is open");
  }else{
  System.out.println("Cubbon Park is Closed and open at morning:"+time+"Am"+"to"+time+"Pm");
  }
 }return 5;
}

}