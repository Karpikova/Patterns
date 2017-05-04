package Observer;

import java.util.*;

/*
 * ${Classname}
 * 
 * Version 1.0 
 * 
 * 04.05.2017
 * 
 * Karpikova
 */
public class HR implements Observable {

    List<Observer> observers = new ArrayList<>();
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer observer:
             observers) {
            observer.message("We have a new job");
        }
    }
}
