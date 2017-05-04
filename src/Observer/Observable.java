package Observer;

/*
 * ${Classname}
 * 
 * Version 1.0 
 * 
 * 04.05.2017
 * 
 * Karpikova
 */
public interface Observable {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyAllObservers();
}
