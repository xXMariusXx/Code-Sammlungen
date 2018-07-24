package Collections.Listen.verkettet;

import Collections.Testobjekt;

public class start {

    private final static int listenLaenge = 10;

    public static void main(String[] args) {
        ArrListe<Testobjekt> liste = new ArrListe<Testobjekt>();
        for (int i = 0; i<listenLaenge; i++)
        {
            liste.hinzufuegen(new Testobjekt());
        }

        liste.listeDurchlaufen();
        liste.listeSortierenComparator2();
        //liste.listeSortierenComparable();
        liste.listeDurchlaufen();
    }
}
