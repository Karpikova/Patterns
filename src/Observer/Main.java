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
public class Main {
    public static void main(String[] args) {
        HR hr1 = new HR();
        Worker worker1 = new Worker(1);
        Worker worker2 = new Worker(2);

        hr1.registerObserver(worker1);
        hr1.registerObserver(worker2);
        hr1.notifyAllObservers();
    }


}
