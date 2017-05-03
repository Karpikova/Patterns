package Factory.Colt;

import Factory.*;

/*
 * ${Classname}
 * 
 * Version 1.0 
 * 
 * 03.05.2017
 * 
 * Karpikova
 */
public class ColtFactory implements WeaponFactory {
    @Override
    public Gun createGun() {
        return new ColtGun();
    }

    @Override
    public Revolver createRevolver() {
        return new ColtRevolver();
    }

    @Override
    public Rifle createRifle() {
        return new ColtRifle();
    }

    @Override
    public BFG createBFG() {
        return null;
    }
}
