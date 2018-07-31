package Done.Schichtenarchitektur.fachlogik;

import javafx.collections.ObservableList;

public interface Verwaltung<T> {
    void aufnehmen(T object);
    void loeschen(T object);
    ObservableList<T> getList();
    void serialiseren();
    void deserialiseren();
    void alsTextSpeichern();
    double gibDurchschnitt();
}
