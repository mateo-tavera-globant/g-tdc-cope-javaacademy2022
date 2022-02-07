package topic_1_design_patterns.exercise2;

import java.util.ArrayList;
import java.util.List;

//Observable object
//Subject
public abstract class Subject {

    private  List<Observer> users = new ArrayList<>();

    public void addObserver(Observer observer){
        users.add(observer);
    }
    public void removeObserver(Observer observer){
        users.remove(observer);
    }

    public void notifyObservers(){
        for (Observer user:users)
            user.update();
    }

}
