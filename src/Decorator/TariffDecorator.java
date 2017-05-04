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
public class TariffDecorator implements CountTarifInterface {
    private CountTarifInterface tariff;

    public TariffDecorator(CountTarifInterface tariffDecorator) {
        this.tariff= tariffDecorator;
    }

    @Override
    public void processTariff() {
        //return tariff.processTariff();
    }
}
