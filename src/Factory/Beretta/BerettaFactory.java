package Factory.Beretta;

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
public class BerettaFactory implements WeaponFactory {
    @Override
    public Gun createGun() {
        return new BerettaGun();
    }

    @Override
    public Revolver createRevolver() {
        return new BerettaRevolver();
    }

    @Override
    public Rifle createRifle() {
        return new BerettaRifle();
    }

    @Override
    public BFG createBFG() {
        return null;
    }
}
