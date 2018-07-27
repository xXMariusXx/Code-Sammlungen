package Done.Properties_Bindings.JavaBeans.Support;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Main { //1. Version mit PropertyChangeListener, ohne Klassen die einen Listener implementieren

    public static void propertyVar1Main()
    {
        //Verwaltung<Artikel> artikelVerwaltung = new Verwaltung<Artikel>();

        Artikel artikel = new Artikel(50,"test");
        //artikelVerwaltung.add(artikel);

        PropertyChangeListener propertyChangeListener = (PropertyChangeEvent e) -> Werbung.drucken((int) e.getNewValue());

        artikel.addPropertyChangeListener(propertyChangeListener);
        artikel.setPreis(55);
        artikel.setPreis(55);
        artikel.setPreis(150);
    }
}
