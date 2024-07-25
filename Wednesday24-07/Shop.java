public class Shop{
int index = 0;
String price[] = new String[4];

public int getshopingitem(){
return price.length;
}
public String getshopingitem(String names){
System.out.println("Shopping Names are:"+names);
if(index<getshopingitem()){
 price[index]=names;
 System.out.println("Array not full");
 index++;
 }
 else{
 System.out.println("Array full");
 }
return "Sucessfully";
}
public String readarray(){
for(int i=0;i<getshopingitem();i++){
System.out.println("Values are:"+price[i]);
}
return "values";
}
}