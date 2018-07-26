package ToDo.Properties_Bindings.Property.Change.Support2;


import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;


public class Werbung implements PropertyChangeListener {

    public static void drucken(int a){
        System.out.println("Neuer Preis: " + a);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {

        if((int)evt.getOldValue() > (int)evt.getNewValue())
        {
            drucken((int) evt.getNewValue());
        }
    }
}