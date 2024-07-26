public class PlaceRunner{

public static void main(String args[]){

Place visit = new Place();
visit.getdetails("Places");
System.out.println("Array length is:"+visit.getdetails());
visit.getdetails("Bendakalure");
visit.getdetails("Chitradurga");
visit.getdetails("Kolar");
visit.getdetails("Mysore");
visit.readarray();

String updatedetails = visit.updatedetails("Bendakalure","Bengalure");
System.out.println("Update Place is:"+updatedetails);
visit.readarray();
String deleteplacedetails = visit.deleteplacedetails("Chitradurga");
System.out.println("Delete Place is:"+deleteplacedetails);
visit.readarray();
String searchplacedetails = visit.searchplacedetails("Bengaluru");
System.out.println("Searched Place is:"+searchplacedetails);
}


}