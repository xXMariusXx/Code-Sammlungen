package Done.OOP;

import java.util.Arrays;

public class start {

    public static void main(String[] args) {

        Auto auto1 = new Auto("Auto1");
        auto1.setBaujahr(2000);
        System.out.println("Auto1: " + auto1);
        auto1.setTank(new Tank(50));



        Auto auto2 = new Pkw("Auto2",2000,5);
        System.out.println("Auto2: "+auto2);
        ((Pkw) auto2).getSitzplaetze();
        //Cast notwendig, da Methode in Auto nicht vorkommt, sondern nur in PKW
        //Wenn Methode auch in Auto vorhanden, bzw in PKW aus Auto überschrieben wird:
        // -> Cast unnötig. Trotzdem wird Methode aus PKW aufgerufen
        Pkw auto2pkw = (Pkw) auto2;
        auto2pkw.getSitzplaetze();



        Pkw auto3 = new Pkw("Auto3",1995,10);
        System.out.println("Auto3: "+auto3);
        auto3.addMieter(new Mieter("test"));
        auto3.addMieter(new Mieter("test2"));
        auto3.addMieter(new Mieter("test3"));



        auto3 = new Pkw("auto3neu",1);
        //ehemaliges auto3(10 Plätze) durch Garbage Collector entfernt
        System.out.println("Auto3neu: " +auto3);



        // nicht erlaubt:
        // Pkw auto4 = new Auto("name", 2005);



        Fahrzeug auto4 = new Auto("auto4", 1980);
        //auto4.setBaujahr(1000); nicht erlaubt, da setBaujahr nicht im statischen Typ vorhanden
        System.out.println("Auto4: " + auto4.toString()); //Erlaubt, da toString im statischen Typ vorgegeben wurde



        Fahrzeug auto5 = new Pkw("auto5",1950,2);
        System.out.println("auto5: " + auto5.toString());
        //Erlaubt, da toString in statischem Typ deklariert
        //Zur Compilzeit: Statischer Typ wird geprüft: OK da Methode in statischem Typ vorhanden
        //Zur Laufzeit: Auswahl der richtigen toString Methode.
        //              Wenn vorhanden: toString von dynamischem Typ, ansonsten jeweils eine Klasse hoch
        //              Irgendwann muss eine Implementierung von toString vorhanden sein, da durch abst. Klasse vorgegeben


        Zweirad motorrad1 = new Motorrad("m1", "kette",new Tank(50)); // -> nur Methoden der Schnittstelle können aufgerufen werden
        motorrad1.gibAntrieb(); //Korrekt, da statischer Typ gibAntrieb deklariert
        //motorrad1.gibPS(); nicht korrekt, da statischer Typ gibPS nicht vorgibt
        ((Motorrad) motorrad1).gibPS(); //Korrekt, wenn cast zu Motorrad
        ((Motorrad) motorrad1).setAntrieb("Kette"); //Korrekt, wenn cast zu Motorrad
    }
}
