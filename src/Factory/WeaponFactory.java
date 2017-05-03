package Factory;

/*
 * ${Classname}
 * 
 * Version 1.0 
 * 
 * 03.05.2017
 * 
 * Karpikova
 */
public interface WeaponFactory {
    abstract Gun createGun();
    abstract Revolver createRevolver();
    abstract Rifle createRifle();
    abstract BFG createBFG(); //1 шаг - добавили сюда
}
