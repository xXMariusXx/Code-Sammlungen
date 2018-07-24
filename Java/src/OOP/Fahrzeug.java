package OOP;

public abstract class Fahrzeug { //Es kann kein Objekt der Klasse Fahrzeug erzeugt werden
    private String name;

    public Fahrzeug(String name) {
        this.name = name;
    }

    public String getName() { //Kann in Unterklassen verwendet werden
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String toString(); //Muss in Unterklasse implementiert werden

}
