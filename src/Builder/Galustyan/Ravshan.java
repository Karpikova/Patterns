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
public class Ravshan implements HouseBiulder {
    private String basement;
    private String walls;
    private String roof;

    @Override
    public void fillBasement() {
        basement = "sleeve";
    }

    @Override
    public void sreateWalls() {
        walls = "blue";
    }

    @Override
    public void createRoof() {
        roof = "not good";
    }

    public String getResult() {
        return basement + " " + walls + " " + roof;
    }
}
