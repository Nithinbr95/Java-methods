public class Customer{

private String name;
private long number;
private String email;
private String loc;
private float height;
private double weight;
private boolean alive;
private String qualification;
private String job;
private int salary;

public void setName(String name){
this.name = name;
}
public String getName(){
return name;
}
public void setnumber(long number){
this.number = number;
}
public long getnumber(){
return number;
}
public void setEmail(String email){
this.email = email;
}
public String getEmail(){
return email;
}
public void setLoc(String loc){
this.loc = loc;
}
public String getLoc(){
return loc;
}
public void setheight(float height){
this.height = height;
}
public float getheight(){
return height;
}
public void setWeight(double weight){
this.weight = weight;
}
public double getWeight(){
return weight;
}
public void setAlive(boolean alive){
this.alive = alive;
}
public boolean getAlive(){
return alive;
}
public void setQualification(String qualification){
this.qualification = qualification;
}
public String getQualification(){
return qualification;
}
public void setJob(String job){
this.job = job;
}
public String getJob(){
return job;
}
public void setSalary(int salary){
this.salary = salary;
}
public int getSalary(){
return salary;
}
}