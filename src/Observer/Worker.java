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
public class Worker implements Observer {
    private int id;

    public Worker(int id) {
        this.id = id;
    }

    @Override
    public void message(String message) {
        System.out.println(message + ", mr " + id);
    }
}
