package Done.Properties_Bindings.JavaUtil;

public class Main {

    public static void observerMain()
    {
        Artikel artikel = new Artikel(50,"test");
        Werbung werbung = new Werbung();

        artikel.addObserver(werbung);
        artikel.addObserver((a,b) -> System.out.println("Neuer Preis: " + ((Artikel)a).getPreis()));

        artikel.setPreis(40);
    }
}
