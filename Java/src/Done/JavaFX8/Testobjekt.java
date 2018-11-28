package Done.JavaFX8;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.Arrays;
import java.util.Random;


public class Testobjekt {
    private IntegerProperty id = new SimpleIntegerProperty();
    private ObservableList<Integer> list = FXCollections.observableArrayList();

    public Testobjekt() {
        this.id.set(4);
        list.add(4);
    }


    public int getId() {
        return id.get();
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public void neuerWert()
    {
        int i = new Random().nextInt(50);
        id.set(i);
        list.add(i);
    }

    public ObservableList getListe()
    {
        return list;
    }
}
