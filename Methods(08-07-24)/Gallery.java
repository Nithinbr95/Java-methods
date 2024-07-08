public class Gallery{

public static void search(){
String name = "Photos";
System.out.println("Image collection is:"+name);
}
public static void search(String date){
System.out.println("Date of the photo taken is:"+date);

}
public static void search(int photos){
System.out.println("Number of photos in gallery is:"+photos);

}
public static void search(boolean store,int storage){

if(storage<64){
System.out.println("Storage is available:"+storage);
}  else if(store==true){
System.out.println("Storage is full:"+storage);
}

}
}