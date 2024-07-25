public class Student{

String name;
int birthyear;
String education;
int completion_year;
float weight;
double height;
public Student(){
System.out.println("Constructer overloading and chainning");
}
public Student(String name){
	this(2002,"Yadhav");
	this.name = name;
System.out.println("Student name is:"+name);

}
public Student(int birthyear,String name){
this("Degree",2002,"Yadhav");
this.birthyear=birthyear;
this.name=name;
System.out.println("Student name is:"+name);
System.out.println("Birth Year of Student is:"+birthyear);
}
public Student(String education,int birthyear,String name){
this(2024,"Degree",2002,"Yadhav");
System.out.println("Student name is:"+name);
System.out.println("Birth Year of Student is:"+birthyear);
System.out.println("Education of Student is:"+education);
}
public Student(int completion_year,String education,int birthyear,String name){
this(40f,2024,"Degree",2002,"Yadhav");
System.out.println("Student name is:"+name);
System.out.println("Birth Year of Student is:"+birthyear);
System.out.println("Education of Student is:"+education);
System.out.println("Education completion_year of Student is:"+completion_year);
}
public Student(float weight,int completion_year,String education,int birthyear,String name){
this(5,40f,2024,"Degree",2002,"Yadhav");
System.out.println("Student name is:"+name);
System.out.println("Birth Year of Student is:"+birthyear);
System.out.println("Education of Student is:"+education);
System.out.println("Education completion_year of Student is:"+completion_year);
System.out.println("Student weight is:"+weight);
}
public Student(double height,float weight,int completion_year,String education,int birthyear,String name){
System.out.println("Student name is:"+name);
System.out.println("Birth Year of Student is:"+birthyear);
System.out.println("Education of Student is:"+education);
System.out.println("Education completion_year of Student is:"+completion_year);
System.out.println("Student weight is:"+weight);
System.out.println("Student height is:"+height);

}
}