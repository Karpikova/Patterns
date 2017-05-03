package Builder.Svetlakov;

import Builder.HouseBiulder;

import java.util.Locale;

/*
 * ${Classname}
 * 
 * Version 1.0 
 * 
 * 03.05.2017
 * 
 * Karpikova
 */
public class Boss {

    private HouseBiulder houseBiulder;

    public Boss(HouseBiulder houseBiulder) {
        this.houseBiulder = houseBiulder;
    }

    public void build() {
        houseBiulder.createRoof();
        houseBiulder.fillBasement();
        houseBiulder.sreateWalls();
        System.out.println(houseBiulder.getResult());
    }
}
