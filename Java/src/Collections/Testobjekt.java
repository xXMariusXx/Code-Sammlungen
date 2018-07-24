package Collections;

import java.awt.*;
import java.util.Random;

public class Testobjekt implements Comparable{
    private final int id;
    private static int anzahl = 0;
    private int groeße;

    public Testobjekt() {
        this.id = anzahl;
        anzahl++;
        groeße = new Random().nextInt(500);
    }

    public int getId() {
        return id;
    }

    public int getGroeße() {
        return groeße;
    }

    public String toString()
    {
        return "Testobjekt ID: " + id + ", Größe: "+groeße;
    }

    @Override
    public int compareTo(Object o) {
        return this.groeße - ((Testobjekt) o).groeße;
    }
}
