package Done.Innere_Anonyme_Klassen;

public class WeitereKlasse {
    public static void main(String[] args) {

        //äußere Klasse mit anonymer Klasser erzeugen
        Klasse klasse = new Klasse("äußere", new Schnittstelle() {
            @Override
            public void berechne(int x) {
                System.out.println(x*x);
            }
        });

        //Innere Klasse erzeugen
        Klasse.InnereKlasse innereKlasse = klasse.new InnereKlasse("innere");
        innereKlasse.erhoehe();


        //Anonyme Klasse
        //kein eigener Klassenname, erweitern eine Klasse oder Implementieren Interface
        //kann keinen eigenen Konstruktor haben
        new Klasse("anonyme",null)
        {

        };
    }
}
