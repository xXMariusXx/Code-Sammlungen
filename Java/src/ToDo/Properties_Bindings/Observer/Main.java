package ToDo.Properties_Bindings.Observer;

public class Main {

    public static void observerMain()
    {
        Artikel artikel = new Artikel(50,"test");
        Werbung werbung = new Werbung();

        artikel.addObserver(werbung);

        artikel.setPreis(40);
    }
}
