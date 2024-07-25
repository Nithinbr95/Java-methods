public class Job{

public static void apply(String jobName){
System.out.println("Name of the Job:"+jobName);
Job.apply(35000,"Software Developer");
}
public static String apply(int salary,String jobName){
System.out.println("Name of the Job:"+jobName);
System.out.println("Salary of the Job:"+salary);
Job.apply("Degree",35000,"Software Developer");
return jobName;
}
public static int apply(String qualification,int salary,String jobName){
System.out.println("Name of the Job:"+jobName);
System.out.println("Salary of the Job:"+salary);
System.out.println("Qualification of the Job:"+qualification);
Job.apply(35000,"Software Developer");
return 10;
}

}