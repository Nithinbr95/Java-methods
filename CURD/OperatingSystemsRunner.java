public class OperatingSystemsRunner{

public static void main(String args[]){

OperatingSystems os = new OperatingSystems();
os.getOSdetails("Windows");
System.out.println("Array length is:"+os.getOSdetails());
os.getOSdetails("Windows7");
os.getOSdetails("Windows8");
os.getOSdetails("Windows9");
os.getOSdetails("Windows10");
os.readarray();

String updateClothdetails = os.updateClothdetails("Windows7","Windows10");
System.out.println("Update brand is:"+updateClothdetails);
os.readarray();
String deletebranddetails = os.deletebranddetails("Windows8");
System.out.println("Update brand is:"+deletebranddetails);
os.readarray();
String searchbranddetails = os.searchbranddetails("Windows7");
System.out.println("Update brand is:"+searchbranddetails);
os.readarray();
}


}