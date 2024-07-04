public class RealEstate{

public static void name(){
	String ownername = "Raghav";
	int age = 35;
	System.out.println("Name of the RealEstater is:"+ownername);
	if(age<49){
		System.out.println("Age of the Raghav is:"+age);
	}else{
		System.out.println("Age is not disclosure");
	}
}
public static void location(String address,int pincode){
	System.out.println("The estates present in location:"+address);
	if(pincode<6000){
		System.out.println("Location Pincode is:"+pincode);
	}else{
		System.out.println("Pincode not found");
	}
}
public static long contact(){
	long number = 8765436675L;
	if(number!=9000000000L){
		System.out.println("Owner contact number is:"+number);
	}else{
		System.out.println("Contact number not found");
	}return 0;
}
public static String estates(int square,String areas[]){
	
	for(int index=0;index<areas.length;index++){
		if(square<1000){
			System.out.println("Estate Present areas are:"+areas[index]);
		}else{
			System.out.println("Estate are not present");
		}
	}return "end";
}
}