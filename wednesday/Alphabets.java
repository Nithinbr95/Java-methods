public class Alphabets{

int index = 0;
String names[] = new String[4];

public int getalphabets(){
return names.length;
}
public String getalphabets(String alphabets){
System.out.println("Alphabets are:"+alphabets);
if(index<getalphabets()){
 names[index]=alphabets;
 System.out.println("Array not full");
 index++;
 }
 else{
 System.out.println("Array full");
 }
return "Sucessfully";
}
public String readarray(){
for(int i=0;i<getalphabets();i++){
System.out.println("Values are:"+names[i]);
}
return "values";
}
}