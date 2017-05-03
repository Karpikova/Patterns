package Builder;

import Builder.Galustyan.DjamshutBuilder;
import Builder.Galustyan.Ravshan;
import Builder.Svetlakov.Boss;

/*
 * ${Classname}
 * 
 * Version 1.0 
 * 
 * 03.05.2017
 * 
 * Karpikova
 */
public class Main {
    public static void main(String[] args) {
        HouseBiulder dj = new DjamshutBuilder();
        HouseBiulder rav = new Ravshan();
        Boss boss = new Boss(dj);
        boss.build();
    }
}
