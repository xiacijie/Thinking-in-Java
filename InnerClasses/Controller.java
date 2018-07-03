import java.util.*;

// The reusable framework for control systems
public class Controller {
    // A class from java.util to hold event objects;
    private List<Event> eventList = new ArrayList<Event>();
    public void addEvent(Event c){
        eventList.add(c);
    }

    public void run(){
        while(eventList.size() > 0){
            //Make a copy so you are not modifying the list while ur selecting the elements in it;
            for (Event e : new ArrayList<Event>(eventList)){
                if (e.ready()){
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }
            }
        }
    }
}
