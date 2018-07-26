package ToDo.Properties_Bindings.Property.Change.Support;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;

//Observable
public class Artikel implements Serializable {

    public static final String PROP_PREIS = "preis";
    private PropertyChangeSupport changes = new PropertyChangeSupport(this);

    private String name;
    private int preis;

    public Artikel(int p, String s)
    {
        this.name = s;
        this.preis = p;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPreis(int preis) {
        int old = this.preis;
        this.preis = preis;
        changes.firePropertyChange(PROP_PREIS, old, preis);
    }

    public int getPreis() {
        return preis;
    }

    public String getName() {
        return name;
    }

    public void addPropertyChangeListener(PropertyChangeListener l)
    {
        changes.addPropertyChangeListener(l);
    }

    public void removePropertyChangeListener(PropertyChangeListener l)
    {
        changes.removePropertyChangeListener(l);
    }


}
