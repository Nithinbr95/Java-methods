public class TabletRunner{

public static void main(String args[]){

Tablet medice = new Tablet();
medice.getTabletdetails("Fever");
System.out.println("Array length is:"+medice.getTabletdetails());
medice.getTabletdetails("Paracetamal");
medice.getTabletdetails("Tylenol");
medice.getTabletdetails("Aspirin");
medice.getTabletdetails("Advil");
medice.readarray();

String updateTabletdetails = medice.updateTabletdetails("Paracetamal","Tylenol");
System.out.println("Update brand is:"+updateTabletdetails);
medice.readarray();
String deletebranddetails = medice.deletebranddetails("Tylenol");
System.out.println("Delete brand is:"+deletebranddetails);
medice.readarray();
String searchbranddetails = medice.searchbranddetails("Tylenol");
System.out.println("Searched brand is:"+searchbranddetails);

}


}