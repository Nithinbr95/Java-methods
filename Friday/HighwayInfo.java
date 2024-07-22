public class HighwayInfo{
int vechile;
int signal;
int accidents;
int speedLimit;
boolean isTollFree;
double tollFee;

public HighwayInfo(){
this(1500,0);	
System.out.println("Here is the current information on Xyz Highway ");
}

public HighwayInfo(int vechile,int speedLimit){
this(false,0);
this.vechile=vechile;
this.speedLimit=speedLimit;
System.out.println("Total current total vechile in highway :"+vechile);
System.out.println("Speed limit :"+speedLimit);
}
public HighwayInfo(boolean isTollFree,int signal ){
this(200.00d,5);	
this.isTollFree=isTollFree;
this.signal=signal;
System.out.println("Total Signals in Highway :"+signal);
System.out.println("Is toll free highway :"+isTollFree);
}
public HighwayInfo(double tollFee,int accidents ){
this.tollFee=tollFee;
this.accidents=accidents;
System.out.println("Total toll fee :"+tollFee);
System.out.println("Accidents :"+accidents);
}

}