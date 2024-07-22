public class SportEvent{
String eventName="carrom";
int eventDuration;
String stadiumLocation;
int noOfParticipants;
String winner;

public SportEvent(String eventName, int eventDuration, String stadiumLocation, int noOfParticipants, String winner){
this.eventName = eventName;
this.eventDuration = eventDuration;
this.stadiumLocation = stadiumLocation;
this.noOfParticipants = noOfParticipants;
this.winner = winner;
}
public void sportEvent(){
System.out.println("event name :"+eventName);
System.out.println("duration :"+eventDuration);
System.out.println("stadium Location  :"+stadiumLocation);
System.out.println("no of Participants  :"+noOfParticipants);
System.out.println("winner  :"+winner);
}
}