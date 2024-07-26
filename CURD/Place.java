public class Place{

int index = 0;
String name[] = new String[4];
public int getdetails(){
return name.length;

}
public String getdetails(String place){
System.out.println("place name is:"+place);
if(index<getdetails()){
	System.out.println("Places are available");
name[index]=place;
index++;
}
else{
	System.out.println("No Places ");
}
return "saved sucessfully";
}
public String readarray(){
	for(int index=0;index<getdetails();index++){
		System.out.println("Read array is:"+name[index]);
		
	}
	return "Read sucessfully";
}
public String updatedetails(String oldplace,String newplace){
	for(int index=0;index<getdetails();index++){
		if(name[index]==oldplace){
			name[index]=newplace;
			return "Updated Suscessfully";
		}
	}
	return "Not Updated";
	}
	public String deleteplacedetails(String place){
		for(int index=0;index<getdetails();index++){
		if(name[index]==place){
			name[index]=null;
			return "Deleted Suscessfully";
		}
	
	}
	return "Not Deleted";
	}
	public String searchplacedetails(String place){
	for(int index=0;index<getdetails();index++){
		if(name[index]==place){
			return "Searched Suscessfully"+place;
		}
	
	}
	return "Brand not present";
	}
}