package Done.Innere_Anonyme_Klassen;

public class Klasse {
    private String kname;
    private int i = 0;
    private Schnittstelle schnittstelle;

    public Klasse(String name, Schnittstelle schnittstelle) {
        this.kname = name;
        this.schnittstelle = schnittstelle;

        //Zugriff auf alle Attribute der inneren Klasse
        InnereKlasse innereKlasse = new InnereKlasse("Innere");

        System.out.println("Äußeres I: " + this.i);
        System.out.println("Inneres I: " + innereKlasse.i);

        innereKlasse.erhoehe();
        System.out.println(kname);
    }

    //Innere Klasse
    class InnereKlasse {
        //Hauptsächliche Verwendung bei verschiedenen Implementierungen von Interfaces
        //private erlaubt. Wenn public: Zugriff von Klassen außerhalb der äußeren möglich (siehe WeitereKlasse)

        //Zugriff auf alle (auch private) Attribute der äußeren Klasse erlaubt
        private String iname;
        private int i= 0;

        public InnereKlasse(String name) {
            this.iname = name;
            this.i = 5; // oder i=5 (ohne this)
            Klasse.this.i++; //Da äußeres I von innerem I überdeckt wird
        }

        public void erhoehe()
        {
          kname = kname + "_1" ;
        }
    }



    public static void main(String[] args) {
        new Klasse("Äußere",null);
    }
}
