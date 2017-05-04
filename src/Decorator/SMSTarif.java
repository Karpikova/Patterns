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
public class SMSTarif extends TariffDecorator {
    public SMSTarif(CountTarifInterface tariffDecorator) {
        super(tariffDecorator);
    }

    @Override
    public void processTariff() {
        System.out.println("SMS added");
        super.processTariff();
    }
}
