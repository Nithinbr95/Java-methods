public class Marriage{

public String name;
public int age;
public String qualification;
public float height;

public Marriage(String name,int age,String qualification,float height){
	
this.name=name;
this.age = age;
this.qualification = qualification;
this.height = height;

}
public String getprofiledetail(String name){

	System.out.println("Name is:"+name);

	if(this.name=="Anamica"){
		return "Profile Found";
	}else{
		return "Not Found";
	}
}
public String getprofiledetail(int age,String name){
	
	System.out.println("Name is:"+name);
	System.out.println("Age is:"+age);

	if(this.name=="Anamica"&&this.age<=25){
		return "Profile Found";
	}else{
		return "Not Found";
	}
}
public String getprofiledetail(String qualification,int age,String name){
	//suresh.getprofiledetail("B.E",26,"Anamica");
	System.out.println("Name is:"+name);
	System.out.println("Age is:"+age);
	System.out.println("Qualification  is:"+qualification);
	if(this.qualification=="Degree"&&this.age<=25){
		return "Profile Found";
	}else{
		return "Not Found";
		
	}
}
public String getprofiledetail(float height,String qualification,int age,String name){
	System.out.println("Name is:"+name);
	System.out.println("Age is:"+age);
	System.out.println("Qualification  is:"+qualification);
	System.out.println("Height is:"+height);
	if(this.qualification=="Degree"&&this.age<=25&&height<=6){
		return "Profile Found";
	}else{
		return "Not Found";
	}
}
}