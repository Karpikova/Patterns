package Builder.Galustyan;

import Builder.HouseBiulder;

/*
 * ${Classname}
 * 
 * Version 1.0 
 * 
 * 03.05.2017
 * 
 * Karpikova
 */
public class DjamshutBuilder implements HouseBiulder {
    private String basement;
    private String walls;
    private String roof;

    @Override
    public void fillBasement() {
        basement = "funny";
    }

    @Override
    public void sreateWalls() {
        walls = "red";
    }

    @Override
    public void createRoof() {
        roof = "good";
    }

    public String getResult() {
        return basement + " " + walls + " " + roof;
    }
}
