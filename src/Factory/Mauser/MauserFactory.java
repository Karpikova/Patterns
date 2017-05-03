package Factory.Mauser;

import Factory.*;
import Factory.Beretta.BerettaGun;
import Factory.Beretta.BerettaRevolver;
import Factory.Beretta.BerettaRifle;

/*
 * ${Classname}
 * 
 * Version 1.0 
 * 
 * 03.05.2017
 * 
 * Karpikova
 */
public class MauserFactory implements WeaponFactory {
    @Override
    public Gun createGun() {
        return new MauserGun();
    }

    @Override
    public Revolver createRevolver() {
        return new MauserRevolver();
    }

    @Override
    public Rifle createRifle() {
        return new MauserRifle();
    }

    @Override
    public BFG createBFG() { //2 шаг - заставил добавить сюда и во все остальные места
        return null;
    }
}
