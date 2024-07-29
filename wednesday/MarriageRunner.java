public class MarriageRunner{

public static void main(String args[]){

Marriage suresh = new Marriage("Suresh",26,"Degree",5.5f);
String profile = suresh.getprofiledetail("Anamica");
System.out.println("Profile is:"+suresh.getprofiledetail("Suresh"));
String profile1 = suresh.getprofiledetail(24,"Anamica");
String profile2 = suresh.getprofiledetail("Degree",24,"Anamica");
String profile3 = suresh.getprofiledetail(5.5f,"Degree",24,"Anamica");
}



}