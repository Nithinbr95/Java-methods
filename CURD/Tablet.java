public class Tablet{

int index = 0;
String name[] = new String[4];
public int getTabletdetails(){
return name.length;

}
public String getTabletdetails(String brand){
System.out.println("Brand name is:"+brand);
if(index<getTabletdetails()){
	System.out.println("Brands are available");
name[index]=brand;
index++;
}
else{
	System.out.println("No Brands ");
}
return "saved sucessfully";
}
public String readarray(){
	for(int index=0;index<getTabletdetails();index++){
		System.out.println("Read array is:"+name[index]);
		
	}
	return "Read sucessfully";
}
public String updateTabletdetails(String oldbrand,String newbrand){
	for(int index=0;index<getTabletdetails();index++){
		if(name[index]==oldbrand){
			name[index]=newbrand;
			return "Updated Suscessfully";
		}
	}
	return "Not Updated";
	}
	public String deletebranddetails(String brand){
		for(int index=0;index<getTabletdetails();index++){
		if(name[index]==brand){
			name[index]=null;
			return "Deleted Suscessfully";
		}
	
	}
	return "Not Deleted";
	}
	public String searchbranddetails(String brand){
	for(int index=0;index<getTabletdetails();index++){
		if(name[index]==brand){
			return "Searched Suscessfully"+brand;
		}
	
	}
	return "Brand not present";
	}
}