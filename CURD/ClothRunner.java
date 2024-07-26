public class ClothRunner{

public static void main(String args[]){

Cloth dress = new Cloth();
dress.getClothdetails();
System.out.println("Array length is:"+dress.getClothdetails());
dress.getClothdetails("Zudio");
dress.getClothdetails("PUMA");
dress.getClothdetails("Racing");
dress.getClothdetails("POLO");
dress.readarray();

String updateClothdetails = dress.updateClothdetails("Zudio","Levis");
System.out.println("Update brand is:"+updateClothdetails);
dress.readarray();
String deletebranddetails = dress.deletebranddetails("Levis");
System.out.println("Update brand is:"+deletebranddetails);
dress.readarray();
String searchbranddetails = dress.searchbranddetails("Zudio");
System.out.println("Update brand is:"+searchbranddetails);
dress.readarray();
}


}