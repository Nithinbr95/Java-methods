public class Decathlon{
String eventName;
int eventDuration;
String stadiumLocation;
int noOfParticipants;
String winner;
int price;

public Decathlon(String eventName){
this.eventName = eventName;
}
public Decathlon(String eventName, int eventDuration){
this.eventName = eventName;
this.eventDuration = eventDuration;
}
public Decathlon(String eventName, int eventDuration, String stadiumLocation){
this.eventName = eventName;
this.eventDuration = eventDuration;
this.stadiumLocation = stadiumLocation;
}
public Decathlon(String eventName, int eventDuration, String stadiumLocation, int noOfParticipants){
this.eventName = eventName;
this.eventDuration = eventDuration;
this.stadiumLocation = stadiumLocation;
this.noOfParticipants = noOfParticipants;
}
public Decathlon(String eventName, int eventDuration, String stadiumLocation, int noOfParticipants,
String winner){
this.eventName = eventName;
this.eventDuration = eventDuration;
this.stadiumLocation = stadiumLocation;
this.noOfParticipants = noOfParticipants;
this.winner = winner;
}
public Decathlon(String eventName, int eventDuration, String stadiumLocation, int noOfParticipants,
String winner, int price){
this.eventName = eventName;
this.eventDuration = eventDuration;
this.stadiumLocation = stadiumLocation;
this.noOfParticipants = noOfParticipants;
this.winner = winner;
this.price = price;
}
}