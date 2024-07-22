public class SportEventRunner{
public static void main(String[] args){
SportEvent event = new SportEvent("Long Jump",2,"Stadium'A'",15,"Pavan");
SportEvent event1 = new SportEvent("Short put",2,"Stadium'B'",20,"Praveen");
SportEvent event2 = new SportEvent("Discus Throw",1,"Stadium'C'",10,"ganesh");
SportEvent event3 = new SportEvent("High jump",1,"Stadium'D'",7,"Zamer");
SportEvent event4 = new SportEvent("400m Race",3,"Stadium'E'",9,"Dhanush");

event.sportEvent();
event1.sportEvent();
event2.sportEvent();
event3.sportEvent();
event4.sportEvent();
}
}