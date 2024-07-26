public class OperatingSystems{

int index = 0;
String name[] = new String[4];
public int getOSdetails(){
return name.length;

}
public String getOSdetails(String versions){
System.out.println("version name is:"+version);
if(index<getOSdetails()){
	System.out.println("version are available");
name[index]=version;
index++;
}
else{
	System.out.println("No version ");
}
return "saved sucessfully";
}
public String readarray(){
	for(int index=0;index<getOSdetails();index++){
		System.out.println("Read array is:"+name[index]);
		
	}
	return "Read sucessfully";
}
public String updateClothdetails(String oldversion,String newversion){
	for(int index=0;index<getOSdetails();index++){
		if(name[index]==oldversion){
			name[index]=newversion;
			return "Updated Suscessfully";
		}
	}
	return "Not Updated";
	}
	public String deletebranddetails(String version){
		for(int index=0;index<getOSdetails();index++){
		if(name[index]==version){
			name[index]=null;
			return "Deleted Suscessfully";
		}
	
	}
	return "Not Deleted";
	}
	public String searchbranddetails(String version){
	for(int index=0;index<getOSdetails();index++){
		if(name[index]==version){
			return "Searched Suscessfully"+version;
		}
	
	}
	return "Brand not present";
	}
}