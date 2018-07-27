package Done.Properties_Bindings.JavaFXBeans.Simple;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import java.io.Serializable;

public class Artikel implements Serializable {


    private String name;
    private final IntegerProperty preis = new SimpleIntegerProperty();

    public Artikel(int p, String s)
    {
        this.name = s;
        preis.set(p);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPreis(int preis) {
        this.preis.set(preis);
    }

    public IntegerProperty preisProperty()
    {
        return preis;
    }

    public final int getPreis() //final, damit Unterklassen nicht überschreiben können
    {
        return preis.get();
    }

    public String getName() {
        return name;
    }

}
