package OOP;

public class Pkw extends Auto { //Erbt Methoden und Attribute, jedoch kein direkter Zugriff auf Attribute

    private int sitzplaetze;
    private Mieter[] mieter = new Mieter[2]; //Kann maximal 5 Mieter besitzen, aber auch keinen

    public Pkw(String name, int baujahr, int sitzplaetze) {
        super(name, baujahr);
        this.sitzplaetze = sitzplaetze;
    }

    public Pkw(String name, int sitzplaetze) {
        super(name);
        this.sitzplaetze = sitzplaetze;
    }


    public int getSitzplaetze() {
        return sitzplaetze;
    }

    public void setSitzplaetze(int sitzplaetze) {
        this.sitzplaetze = sitzplaetze;
    }

    public void addMieter(Mieter mieter) {
        for (int i = 0; i < this.mieter.length;i++)
        {
            if (this.mieter[i] == null)
            {
                this.mieter[i] = mieter;
                System.out.println(this.getName() + ": Mieter hinzugefügt!");
                return; //Return beendet Methode, Break springt aus Block/Schleife/Abfrage
            }
        }
        System.err.println(this.getName() + ": Mieter konnte nicht hinzugefügt werden!");
    }

    @Override
    public String toString() { //Überschreibt Methode toString von Auto
        return super.toString() +
                ", sitzplaetze=" + sitzplaetze;
    }

}
