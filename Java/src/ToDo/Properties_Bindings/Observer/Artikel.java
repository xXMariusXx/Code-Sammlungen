package ToDo.Properties_Bindings.Observer;

import java.util.Observable;
import java.io.Serializable;

//Observable
public class Artikel extends Observable  { //implements Serializable

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

        if (old > preis)
        {
            setChanged();
            notifyObservers();
        }

    }

    public int getPreis() {
        return preis;
    }

    public String getName() {
        return name;
    }

}
