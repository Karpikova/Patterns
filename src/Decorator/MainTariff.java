package Decorator;

/*
 * ${Classname}
 * 
 * Version 1.0 
 * 
 * 04.05.2017
 * 
 * Karpikova
 */
public class MainTariff implements CountTarifInterface{

    @Override
    public void processTariff() {
        System.out.println("This is MTS");
    }
}
