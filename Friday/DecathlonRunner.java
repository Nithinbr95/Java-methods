public class DecathlonRunner{
public static void main(String[] args){
Decathlon event = new Decathlon("Long Jump");
Decathlon event1 = new Decathlon("Long Jump",2);
Decathlon event2 = new Decathlon("Long Jump",2,"Stadium'A'");
Decathlon event3 = new Decathlon("Long Jump",2,"Stadium'A'",15);
Decathlon event4 = new Decathlon("Long Jump",2,"Stadium'A'",15,"Pavan");
Decathlon event5 = new Decathlon("Long Jump",2,"Stadium'A'",15,"Pavan",5000);

System.out.println("Event :"+event.eventName);
System.out.println("Event :"+event.eventName+"duration :"+event1.eventDuration);
System.out.println("Event :"+event.eventName+"duration :"+event1.eventDuration+" stadium loacation :"+event2.stadiumLocation);
System.out.println("Event :"+event.eventName+"duration :"+event1.eventDuration+" stadium loacation :"+event2.stadiumLocation+" no of participent :"+event3.noOfParticipants);
System.out.println("Event :"+event.eventName+"duration :"+event1.eventDuration+" stadium loacation :"+event2.stadiumLocation+" no of participent :"+event3.noOfParticipants+
"Winner is :"+event4.winner);
System.out.println("Event :"+event.eventName+"duration :"+event1+" stadium loacation :"+event2.stadiumLocation+" no of participent :"+event3.noOfParticipants+
"Winner is :"+event4.winner+" price won :"+event5.price);
}
}