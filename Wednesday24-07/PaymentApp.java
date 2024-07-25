public class PaymentApp{

String appName;
int size;
short version;
byte installtime;
long number;
public static  String upiid;
public static  boolean status;
public static  double ratings;
public static  int downloads;
public static  String payments[];

public PaymentApp(String appName,String upiid,int size,short version,byte installtime,long number,boolean status,double ratings,int downloads,String payments[]){
this.appName = appName;
this.upiid = upiid;
this.size =size;
this.version = version;
this.installtime = installtime;
this.number = number;
this.status = status;
this.ratings = ratings;
this.downloads = downloads;
this.payments = payments;

System.out.println("UPI App Name is:"+appName);
System.out.println("App Size is:"+size+"MB");
System.out.println("App Version is:"+version);
System.out.println("Installation time is:"+installtime+"min");
System.out.println("Enter Registered number is:"+number);
System.out.println("Payment Status is:"+status);
System.out.println("UPI Id is:"+upiid);
System.out.println("App Rating is:"+ratings);
System.out.println("Downloads are:"+downloads);
for(int index=0;index<payments.length;index++){
System.out.println("Payment Categories are:"+payments[index]);
}
}

}

