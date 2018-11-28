package Done.OOP;

public class Auto extends Fahrzeug{ //extends Object (kann weggelassen werden, wird automatisch hinzugefügt)
    private int baujahr;
    private Tank tank; //Kann Beziehung, da nicht im Konstruktor

    public Auto(String name, int baujahr) {
        super(name);
        this.baujahr = baujahr;
    }

    public Auto(String name)
    {
        super(name);
    }

    @Override
    public String toString() { //Überschreibt Methode toString von Object, Implementiert abstrakte Methode aus Fahrzeug
        return "name='" + super.getName() + '\'' +
                ", baujahr=" + baujahr +
                ", alter=" + berechneAlter();
    }

    public int berechneAlter()
    {
        if (baujahr == 0)
            return -1;
        return java.time.LocalDate.now().getYear() - baujahr;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    public Tank getTank() {
        return tank;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }

}
