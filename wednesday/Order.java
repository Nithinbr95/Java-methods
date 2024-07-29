public class Order{
int index = 0;
int names[] = new int[4];

public int getshopingitem(){
return names.length;
}
public String getshopingitem(int price){
System.out.println("Shopping Price is:"+price);
if(index<getshopingitem()){
 names[index]=price;
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
System.out.println("Values are:"+names[i]);
}
return "values";
}
}