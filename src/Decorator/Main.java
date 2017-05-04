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
public class Main {
    public static void main(String[] args) {
        MainTariff mainTariff = new MainTariff();
        SMSTarif smsTarif = new SMSTarif(mainTariff);
        Roaming roaming = new Roaming(smsTarif);

        roaming.processTariff();
    }
}
