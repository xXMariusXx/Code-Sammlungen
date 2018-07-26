package Done.Properties_Bindings.Property.Invalidation;


import javafx.beans.InvalidationListener;
import javafx.beans.Observable;


public class Werbung implements InvalidationListener {


    public static void drucken(int a){
        System.out.println("ungültig");
    }

    @Override
    public void invalidated(Observable observable) {
        Artikel artikel = (Artikel) observable;
        if (artikel.getPreis() <0)
        {
            drucken(artikel.getPreis());
        }
    }
}
