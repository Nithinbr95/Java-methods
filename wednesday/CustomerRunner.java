public class CustomerRunner{

public static void main(String args[]){

Customer service = new Customer();
service.setName("Samson");
System.out.println("Name is:"+service.getName());
service.setnumber(4397467345L);
System.out.println("Name is:"+service.getnumber());
service.setEmail("Samson@gmail.com");
System.out.println("Name is:"+service.getEmail());
service.setLoc("Bengalure");
System.out.println("Name is:"+service.getLoc());
service.setheight(4.5f);
System.out.println("Name is:"+service.getheight());
service.setWeight(55);
System.out.println("Name is:"+service.getWeight());
service.setAlive(true);
System.out.println("Name is:"+service.getAlive());
service.setQualification("Degree");
System.out.println("Name is:"+service.getQualification());
service.setJob("Developer");
System.out.println("Name is:"+service.getJob());
service.setSalary(300000);
System.out.println("Name is:"+service.getSalary());
}


}