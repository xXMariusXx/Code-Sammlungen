package Done.JavaFX8.AdvancedFX8.FXML;

import Done.JavaFX8.Testobjekt;
import javafx.collections.ObservableList;

public class Controller {
    private Testobjekt testobjekt;
    public Controller()
    {
        testobjekt = new Testobjekt();
    }

    public ObservableList getList()
    {
        return testobjekt.getListe();
    }

    public void neueZahl()
    {
        testobjekt.neuerWert();
    }
}
