package Done.Schichtenarchitektur.gui;

import Done.Schichtenarchitektur.fachlogik.Autoverwaltung;
import Done.Schichtenarchitektur.fachlogik.Verwaltung;

public class Controller {
    private Verwaltung autoVerwaltung = new Autoverwaltung();
    private static final Controller controller = new Controller(); //Singleton Pattern

    private Controller()
    {

    }

    public static Controller getInstance()
    {
        return controller;
    }

    public void serialiseren()
    {
        autoVerwaltung.serialiseren();
    }

    public void deserialisieren(){
        autoVerwaltung.deserialiseren();
    }

    public double durchschnitt()
    {
        return autoVerwaltung.gibDurchschnitt();
    }
}
