package Done.OOP;

public class Motorrad extends Fahrzeug implements Zweirad, Ottomotor {

    private String antrieb;
    private Tank tank; //Muss Beziehung, da durch Konstruktor gefordert


    public Motorrad(String name, String antrieb,Tank tank) {
        super(name);
        this.antrieb = antrieb;
        this.tank = tank;
    }


    @Override //Methoden von abstrakter Klasse
    public String toString() {
        return null;
    }

    @Override //Methoden aus Zweirad
    public String gibAntrieb() {
        return antrieb;
    }

    @Override //Methoden aus Ottomotor
    public int gibPS()
    {
        return 500;
    }

    public void setAntrieb(String antrieb) {
        this.antrieb = antrieb;
    }
}
