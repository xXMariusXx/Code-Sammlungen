package Done.Schichtenarchitektur.fachlogik;

import Done.OOP.Auto;
import Done.Schichtenarchitektur.datenhaltung.FileDao;
import Done.Schichtenarchitektur.datenhaltung.IDao;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Autoverwaltung implements Verwaltung {
    private ObservableList<Auto> list = FXCollections.observableArrayList();
    private IDao<Auto> fileDao = new FileDao<Auto>();


    @Override
    public void aufnehmen(Object object) {

    }

    @Override
    public void loeschen(Object object) {

    }

    @Override
    public ObservableList getList() {
        return list;
    }

    @Override
    public void serialiseren() {
        fileDao.serialisieren(list);
    }

    @Override
    public void deserialiseren() {
        list = fileDao.deserialisieren();
    }

    @Override
    public void alsTextSpeichern() {
        fileDao.alsTextSpeichern(this,"/user/Desktop/test.txt");
    }

    public double gibDurchschnitt()
    {
        return 5.0;
    }
}
