package Done.Properties_Bindings.Property.Change.Simple;


import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class Werbung implements ChangeListener {

    @Override
    public void changed(ObservableValue observable, Object oldValue, Object newValue) {
        if ((int) oldValue > (int) newValue)
        {
            drucken((int) newValue);
        }
    }

    public static void drucken(int a){
        System.out.println("pms -> Neuer Preis: " + a);
    }
}
