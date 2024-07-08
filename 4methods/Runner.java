public class Runner{
	public static void main(String args[]){
		
		System.out.println("Amazon order list");
		Amazon.shop();
		String items[] = {"Bottel","Bags","Shirts","Shoes"};
		Amazon.cart(items,200);
		Amazon.purchase();
		Amazon.orders("Jeans pant");
			
		System.out.println("------------------Meeshoo Info:---------------------------");		
		Meeshoo.getinfo();
		Meeshoo.name("Vidit Aatrey");
		System.out.println(Meeshoo.rating());
		 String[] head_quartersinformation={"India","Karnataka","Benguluru"};
		String get_inform=Meeshoo.app_details(head_quartersinformation);
				System.out.println(get_inform);	
		System.out.println(Meeshoo.max_rating(5,3));
		System.out.println("------------------Spices Info:---------------------------");		
		Spices.getinfo();
		Spices.name("cinnamon");
		System.out.println(Spices.rating());
		 String[] info_spices={"pepper","nutmeg","cinnamon"};
		String spices_info=Spices.spices_details(info_spices);
				System.out.println(spices_info);	
		System.out.println(Spices.max_rating(5,3));
		System.out.println("------------------Kitchen Info:---------------------------");		
		Kitchen.getinfo();
		Kitchen.name("kitchen");
		System.out.println(Kitchen.detail());
		 String[] info_kitchen={"Fooditems","Stove","Cooker"};
		String kitchen_info=Kitchen.kitchen_details(info_kitchen);
				System.out.println(kitchen_info);	
		System.out.println(Kitchen.max_rating(5,3));
		System.out.println("------------------Parks Info:---------------------------");		
		Parks.getinfo();
		Parks.name("kitchen");
		System.out.println(Parks.rating());
		 String[] get_park={"BBMP park","Tree Park","Cubbon Park"};
		String park_info=Parks.park_details(get_park);
				System.out.println(park_info);	
		System.out.println(Parks.max_rating(5,3));
		System.out.println("------------------Mocktails Info:---------------------------");		
		Mocktails.getinfo();
		Mocktails.name("Soda");
		System.out.println(Mocktails.rating());
		 String[] drink_detail={"Soda","Juice","Herbs"};
		String drink_info=Mocktails.drink_details(drink_detail);
				System.out.println(drink_info);	
		System.out.println(Mocktails.max_rupees(5,3));
		System.out.println("------------------Pubs Info:---------------------------");		
		Pubs.getinfo();
		Pubs.name("Toit Brewpub");
		System.out.println(Pubs.rating());
		 String[] pub_detail={"Toit Brewpub","The Gypsy Pub"};
		String pub_info=Pubs.pub_details(pub_detail);
				System.out.println(pub_info);	
		System.out.println(Pubs.max_rating(5,3));
		System.out.println("------------------Malls Info:---------------------------");		
		Malls.getinfo();
		Malls.name("Nexus Mall Koramangala");
		System.out.println(Malls.rating());
		 String[] mall_detail={"Nexus Mall Koramangala","Gopalan Innovation Mall"};
		String mall_info=Malls.mall_details(mall_detail);
				System.out.println(mall_info);	
		System.out.println(Malls.max_rating(5,3));
		System.out.println("------------------cars Info:---------------------------");	
		Cars.showroom();
		Cars.place("Bengalure",402);
		Cars.amount();
		String stock[] = {"Tata Nexon","Tata Punch","Tata Ev"};
		Cars.collection(stock,5,2024);
		System.out.println("------------------Songs Info:---------------------------");	
		Songs.user();
		Songs.premium(500,400);
		Songs.download("Rap song",true);
		String languages[]={"Kannada","Hindi","English","Telugu"};
		Songs.value(languages,35);
		System.out.println("------------------Movies Info:---------------------------");	
		Movies.movname();
		Movies.producer("Prasanth",35);
		Movies.invest();
		String language[]={"Kannada","Hindi","English","Telugu"};
		Movies.languages(4,languages);
		System.out.println("------------------Phonepay Info:---------------------------");	
		Phonepay.login();
		Phonepay.account(453745845763L);
		Phonepay.upi();
		String applications[]= {"Payment","Bill","Recharge"};
		Phonepay.status(applications,true);
		System.out.println("Google Pay Details");
		System.out.println("------------------GooglePay Info:---------------------------");	
		GooglePay.payments();
		GooglePay.develop("Sundar pichi");
		GooglePay.upi();
		GooglePay.estbl(45000);
		
		System.out.println("------------------Spotify Info:---------------------------");	
		Spotify.user();
		Spotify.premium(700,300);
		Spotify.download("Pleasant song",true);
		String languages_info[]={"Kannada","Hindi","English","Telugu"};
		Spotify.value(languages,35);


		
		
	 }
	 

}