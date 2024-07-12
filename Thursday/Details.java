public class Details{
	public static void profile_details(){
	String person_profile="Ramu";
	int roll_number=307;
	System.out.println("Name:"+person_profile);
	System.out.println("Rollnumber:"+roll_number);
	education_details();
	personal_details();
	person_Skills();
	person_Score();
	}
	public static void education_details(){
	String person_Qualification="B.Tech";
	String person_Branch="MechanicalEngineering";
	String person_Collegename="MechanicalEngineering";
	System.out.println("Qualification:"+person_Qualification);
	System.out.println("Branch is:"+person_Branch);
	System.out.println("College_name is:"+person_Collegename);
	}
	public static void personal_details(){
	String name="B.Tech";
	long adharnumber=12345678910L;
	String person_location="Sullurupeta";
	System.out.println("Name Of Person:"+name);
	System.out.println("Adhar Details:"+adharnumber);
	System.out.println("Person Location is:"+person_location);
	}
	public static void person_Skills(){
	String skill="HTML   CSS    JAVASCRIPT";
	System.out.println("Person SKILL:"+skill);
	}
	public static void person_Score(){
	int percentage=88;
	System.out.println("Person Percentage:"+percentage+"%");
	}

}