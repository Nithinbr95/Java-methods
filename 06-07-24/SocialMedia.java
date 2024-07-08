public class SocialMedia{

public static void youtube(){
String channelname = "Thagusycokiller";
String email = "sych12@mail.com";
System.out.println("Name of the channel is:"+channelname);
System.out.println("Email id was:"+email);
}
public static void subscriber(int subscriber){

System.out.println("You Channel Subcribers are:"+subscriber);
}
public static String videos(){

String places[]={"Bengaluru","Mysore","London","Mumbai"};
for(int index=0;index<places.length;index++){
	
	System.out.println("The places to visit for youtube content are:"+places[index]);
}return "super";
}
public static String language(String language[]){
	for(int lang=0;lang<language.length;lang++){
		System.out.println("Content language was:"+language[lang]);
	}
	return "Jai";
}
}