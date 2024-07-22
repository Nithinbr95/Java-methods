public class Student{
String course;
String name;
int age;
float cgpa;
int passoutYear;

public Student(String course, String name, int age, float cgpa, int passoutYear){
this.course = course;
this.name = name;
this.age = age;
this.cgpa = cgpa;
this.passoutYear = passoutYear;
}
public void student(){
System.out.println("Student Course completed in :"+course);
System.out.println("Student Name :"+name);
System.out.println("Student age :"+age);
System.out.println("Overall CGPA  :"+cgpa);
System.out.println("passout Year  :"+passoutYear);
}
}