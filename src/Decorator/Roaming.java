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
public class Roaming extends TariffDecorator {
    @Override
    public void processTariff() {
        System.out.println("Roaming exists");
        super.processTariff();
    }

    public Roaming(CountTarifInterface tariffDecorator) {
        super(tariffDecorator);
    }
}
