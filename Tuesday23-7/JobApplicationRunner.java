public class JobApplicationRunner{

public static void main(String args[]){

JobApplication software = new JobApplication();
JobApplication software1 = new JobApplication("Nithin");
JobApplication software2 = new JobApplication(23,"Nithin");
JobApplication software3 = new JobApplication("Bengalure","Nithin",23);
String skills[] = {"Java","JPA","React","HTML","CSS","SpringBoot"};
JobApplication software4 = new JobApplication("Nithin",23,"02/05/2001","Bengalure","BE",430,skills,true);
software.getApplicantDetails(22);
software.getApplicantDetails("BE",22);
//String skills[] = {"Java","JPA","React","HTML","CSS","SpringBoot"};
software.getApplicantDetails(skills,"BE",22);
software.calculatePercentage();
software.detail();
}



}