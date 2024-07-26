public class Charger{

int index = 0;
String type[] = new String[4];
public int getChargerdetails(){
return type.length;

}
public String getChargerdetails(String brand){
System.out.println("Brand type is:"+brand);
if(index<getChargerdetails()){
	System.out.println("Brands are available");
type[index]=brand;
index++;
}
else{
	System.out.println("No Brands ");
}
return "saved sucessfully";
}
public String readarray(){
	for(int index=0;index<getChargerdetails();index++){
		System.out.println("Read array is:"+type[index]);
		
	}
	return "Read sucessfully";
}
public String updateChargerdetails(String oldbrand,String newbrand){
	for(int index=0;index<getChargerdetails();index++){
		if(type[index]==oldbrand){
			type[index]=newbrand;
			return "Updated Suscessfully";
		}
	}
	return "Not Updated";
	}
	public String deletebranddetails(String brand){
		for(int index=0;index<getChargerdetails();index++){
		if(type[index]==brand){
			type[index]=null;
			return "Deleted Suscessfully";
		}
	
	}
	return "Not Deleted";
	}
	public String searchbranddetails(String brand){
	for(int index=0;index<getChargerdetails();index++){
		if(type[index]==brand){
			return "Searched Suscessfully"+brand;
		}
	
	}
	return "Brand not present";
	}
}