public class Facebook{
	public static int info(){
	System.out.println("FACEBOOK");
	return 1;
	}
	public static long info(long app_number){
	System.out.println("Total number of users:"+app_number);
	return app_number;

	}
	public static int info(byte app_rating,double app_space){
	System.out.println("app rating:"+app_rating+"Total_space:"+app_space);
	return app_rating;
	}
	public static double info(byte app_rating,double app_space,char grade){
	System.out.println("app rating:"+app_rating+"Total_space:"+app_space+"grade given:"+grade);
	return app_space;
	}
	public static boolean info(byte app_rating,double app_space,boolean app_is_good,char grade){
	System.out.println("app rating:"+app_rating+"Total_space:"+app_space+"app_is_good:"+app_is_good+"grade given:"+grade);
	return app_is_good;
	}
	public static String info(String app_name,byte app_rating,double app_space,boolean app_is_good,char grade){
	System.out.println("app Name:"+app_name+"app rating:"+app_rating+"Total_space:"+app_space+"app_is_good:"+app_is_good+"grade given:"+grade);
	return app_name;
	}
	

}