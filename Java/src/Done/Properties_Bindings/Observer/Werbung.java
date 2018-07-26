package Done.Properties_Bindings.Observer;

import java.util.Observable;
import java.util.Observer;

public class Werbung implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        Artikel a = (Artikel)  o;
        drucken(a.getPreis());
    }


    public static void drucken(int a){
        System.out.println("Neuer Preis: " + a);
    }
}
