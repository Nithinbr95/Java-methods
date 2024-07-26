public class ChargerRunner{

public static void main(String args[]){

Charger dress = new Charger();
dress.getChargerdetails("C-Type");
System.out.println("Array length is:"+dress.getChargerdetails());
dress.getChargerdetails("Wayona ");
dress.getChargerdetails("Portronics Konnec");
dress.getChargerdetails("Qualcomm");
dress.getChargerdetails("RealMe");
dress.readarray();

String updateChargerdetails = dress.updateChargerdetails("Wayona ","Qualcomm");
System.out.println("Update brand is:"+updateChargerdetails);
dress.readarray();
String deletebranddetails = dress.deletebranddetails("Qualcomm");
System.out.println("Update brand is:"+deletebranddetails);
dress.readarray();
String searchbranddetails = dress.searchbranddetails("RealMe");
System.out.println("Update brand is:"+searchbranddetails);
dress.readarray();
}


}