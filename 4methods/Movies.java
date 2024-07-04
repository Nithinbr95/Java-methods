public class Movies{

public static void movname(){
String movname = "Kalki";
int rating = 9;
System.out.println("Movie name is :");
if(rating<=7){
System.out.println("Movie is not good");
}else{
System.out.println("Movie is good:"+movname);
}
}
public static void producer(String prod_name,int age){
System.out.println("Producer name was:"+prod_name);
if(age>45){
System.out.println("producer will gain profit:"+age);
}else{
System.out.println("Producer will not get any profit");
}
}
public static int invest(){
long invest = 20000000;
int noofmovies = 9;
if(noofmovies<10){
System.out.println(" movie invest is :"+invest);
}else{
System.out.println("no movies are coming");
}return 5;
}
public static String languages(long duration,String languages[]){
System.out.println("Movie duration was:"+duration+"hr");
for(int film=0;film<languages.length;film++){
 if(duration<4){
 System.out.println("Movie Languages are:"+languages[film]);
}else{
System.out.println("Movie released in Kannada only");
}
}return "end";
}
}