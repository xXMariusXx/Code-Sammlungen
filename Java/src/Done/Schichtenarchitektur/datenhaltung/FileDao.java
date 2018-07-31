package Done.Schichtenarchitektur.datenhaltung;

import Done.Schichtenarchitektur.fachlogik.Verwaltung;
import javafx.collections.ObservableList;

public class FileDao<T> implements IDao<T> {

    @Override
    public ObservableList<T> deserialisieren() {
        return null;
    }

    @Override
    public void serialisieren(ObservableList<T> list) {

    }

    @Override
    public void alsTextSpeichern(Verwaltung v, String filename) {

    }
}
