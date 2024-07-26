public class Cloth{

int index = 0;
String name[] = new String[4];
public int getClothdetails(){
return name.length;

}
public String getClothdetails(String brand){
System.out.println("Brand name is:"+brand);
if(index<getClothdetails()){
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
	for(int index=0;index<getClothdetails();index++){
		System.out.println("Read array is:"+name[index]);
		
	}
	return "Read sucessfully";
}
public String updateClothdetails(String oldbrand,String newbrand){
	for(int index=0;index<getClothdetails();index++){
		if(name[index]==oldbrand){
			name[index]=newbrand;
			return "Updated Suscessfully";
		}
	}
	return "Not Updated";
	}
	public String deletebranddetails(String brand){
		for(int index=0;index<getClothdetails();index++){
		if(name[index]==brand){
			name[index]=null;
			return "Deleted Suscessfully";
		}
	
	}
	return "Not Deleted";
	}
	public String searchbranddetails(String brand){
	for(int index=0;index<getClothdetails();index++){
		if(name[index]==brand){
			return "Searched Suscessfully"+brand;
		}
	
	}
	return "Brand not present";
	}
}