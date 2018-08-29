package Done.Collections.Listen.verkettet;

import Done.Collections.Testobjekt;

public class start {

    private final static int listenLaenge = 10;

    public static void main(String[] args) {
        VerketteteListe<Testobjekt> liste = new VerketteteListe<Testobjekt>();

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
