package Exceptions.Hochwerfen;

public class Personalverwaltung {
    private String name;
    private int anzahl;

    public Personalverwaltung(String name)
    {
        this.name = name;
    }

    public Personalverwaltung(String name, int anzahl){
        this.name = name;
        this.anzahl = anzahl;
    }

    public int getAnzahl() throws AnzahlException
    {
        return anzahl;
    }
}
