class Application{
public static String applyExam(){
System.out.println("welcome to application");
return "app";
}
public static String applyExam(String username){
System.out.println(" the username is:"+username);
return username;
}
public static String applyExam(String username,String password){
System.out.println(" the username is:"+username+" password is:"+password);
return password;
}
public static String applyExam(String name,String username,String password){
System.out.println(" the username is:"+username+" password is:"+password+"exam name is :"+name);
return password;
}
public static String applyExam(String name,String username,String password,long mobile){
System.out.println(" the username is:"+username+" password is:"+password+"exam name is :"+name+"mobile number is:"+mobile);
return password;
}
public static String applyExam(String name,String username,String password,long mobile,String type){
System.out.println(" the username is:"+username+" password is:"+password+"exam name is :"+name+"mobile number is:"+mobile);
System.out.println("exam type is:"+type);
return password;
}
public static int applyExam(String name,String username,String password,long mobile,String type,int date){
System.out.println("the username is:"+username+"password is:"+password+"exam name is :"+name+"mobile number is:"+mobile);
System.out.println("exam type is:"+type+"exam date is:"+date);
return 0;
}
public static int applyExam(String name,String username,String password,long mobile,String type,int date,int score){
System.out.println("the username is:"+username+"password is:"+password+"exam name is :"+name+"mobile number is:"+mobile);
System.out.println("exam type is:"+type+"exam date is:"+date+"exam score is:"+score);
return 0;
}
public static int applyExam(String name,String username,String password,long mobile,String type,int date,int score,String centre){
System.out.println("the username is:"+username+" password is:"+password+"exam name is :"+name+"mobile number is:"+mobile);
System.out.println("exam type is:"+type+"exam date is:"+date+"exam score is:"+score+"centre name is:"+centre);
return 0;
}
public static int applyExam(String name,String username,String password,long mobile,String type,int date,int score,String centre,String education){
System.out.println("the username is:"+username+" password is:"+password+"exam name is :"+name+"mobile number is:"+mobile);
System.out.println("exam type is:"+type+"exam date is:"+date+"exam score is:"+score+"centre name is:"+centre+"Education is:"+education);
return 0;
}
public static int applyExam(String name,String username,String password,long mobile,String type,int date,int score,String centre,String education,String time){
System.out.println("the username is:"+username+" password is:"+password+"exam name is :"+name+"mobile number is:"+mobile);
System.out.println("exam type is:"+type+"exam date is:"+date+"exam score is:"+score+"centre name is:"+centre+"Education is:"+education+" Exam starts at"+time);
return 0;
}
}