public class Mocktails{
	public static void getinfo(){
			boolean getinfo=true;
			if (getinfo){
				System.out.println("Usually Made by various ingridents ");
			}else{
				System.out.println("Alcohol");
			}
		}
		public static void name(String name){
			boolean drink=true;
			if (drink){
				System.out.println("Mocktail example is:"+name);
			}else{
				System.out.println("No Name");
			}
		}
		
		public static  int rating(){
			int rating=7;
			
			if (rating==7){
				System.out.println("Good for Refreshment ");
				
			return 1;	
			}else{
				System.out.println("Harmful");
			return 2;	
			}
			
		}
		public static String drink_details(String drink_detail[]){
			for(int index=0;index<drink_detail.length;index++)
			{
				System.out.println(drink_detail[index]);
			}
			return "End of drink_details";
			
		}
		public static int max_rupees(int a, int b) {
        
        if (a > b) {
			System.out.println(" one drink rupees10");
            return a;  
        } else {
			System.out.println("One drink rupees 50 ");
            return b;  
        }
    }


}