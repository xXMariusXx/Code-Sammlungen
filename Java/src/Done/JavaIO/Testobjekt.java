package Done.JavaIO;

import java.io.Serializable;

public class Testobjekt implements Serializable {
    private final int id;
    private static int anzahl;
    private String name;
    private TestNebenObjekt testNebenObjekt; //Referenzierte Objekte müssen auch Serializable implementieren

    // Serialisierung
    // Normalerweise automatische Berechnung der SerVersID durch Klassename, Methoden, Attribute, implem. Schnittstellen
    // -> wenn Schnittstelle oder Methode hinzugefügt: andere SerVersID -> Deserialisieren nicht möglich
    // Lösung: SerVersID selber festlegen:
    private static final long serialVersionUID = 100;
    // -> wird nichtmehr automatisch berechnet
    //Achtung: manuell ändern wenn: Att umbenannt, transient/static hinzugefügt/entfernt
    // muss nicht geändert werden: add/remove Methoden/Att

    public Testobjekt(String name)
    {
        id = anzahl;
        anzahl++;
        this.name = name;
        this.testNebenObjekt = new TestNebenObjekt("Name!");
    }

    @Override
    public String toString() {
        return "Testobjekt{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", testNebenObjekt=" + testNebenObjekt.toString() +
                '}';
    }
}
