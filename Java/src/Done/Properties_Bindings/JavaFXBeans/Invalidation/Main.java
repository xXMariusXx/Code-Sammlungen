package Done.Properties_Bindings.JavaFXBeans.Invalidation;


public class Main {

    public static void propertyMitSimpleMain()
    {
        Artikel artikel = new Artikel(100,"test");
        Werbung werbung = new Werbung();

        artikel.preisProperty().addListener(werbung);
        artikel.setPreis(60);
    }
}
