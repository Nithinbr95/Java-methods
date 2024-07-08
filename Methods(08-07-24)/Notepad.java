public class Notepad{

public static void search(){
String filename="Java file";
System.out.println("Searched file was:"+filename);
}
public static void search(int filesize){
System.out.println("File Size is:"+filesize);
}
public static String search(String folder){
System.out.println("Saved folder was:"+folder);
return "End";
}
public static void files(int files,String format){
System.out.println("Number of files stored in a folder is:"+files+"File Format:"+format);

}

}