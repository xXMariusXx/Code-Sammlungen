package Done.Properties_Bindings.JavaBeans.Support2;

public class Main { //2. Version mit PropertyChangeListener, Werbung implementiert einen Listener

    public static void propertyVar2Main(){
        Artikel artikel = new Artikel(50,"test");

        Werbung werbung = new Werbung();
        artikel.addPropertyChangeListener(werbung);
        artikel.setPreis(40);

    }

}
