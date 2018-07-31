package Done.Schichtenarchitektur.datenhaltung;

import Done.Schichtenarchitektur.fachlogik.Verwaltung;
import javafx.collections.ObservableList;

public interface IDao<T> {
    ObservableList<T> deserialisieren();
    void serialisieren(ObservableList<T> list);
    void alsTextSpeichern(Verwaltung v, String filename);

}
