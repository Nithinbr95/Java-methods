public class FacebookRunner{

public static void main(String args[]){

Facebook.login();
String contents[]={"News","Sports","Entertrainment"};
Facebook.content(contents);
Facebook.dob();
String languages[]={"Kannada","Hindi","English"};
Facebook.languages(languages,400);
}
}