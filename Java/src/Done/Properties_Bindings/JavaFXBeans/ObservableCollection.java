package Done.Properties_Bindings.JavaFXBeans;

import Done.StreamAPI.Testobjekt;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

public class ObservableCollection {
    public static void main(String[] args) {
        ObservableList<Testobjekt> list = FXCollections.observableArrayList();
        list.addListener(new ListChangeListener<Testobjekt>(){
            @Override
            public void onChanged(ListChangeListener.Change<? extends Testobjekt>c){
                while(c.next()){ if(c.wasAdded()){
                    for(Testobjekt a : c.getAddedSubList()){
                        System.out.printf("%s wurde neu eingetragen%n", a.getName()); }}}}
        });


        list.addAll(new Testobjekt(10000,"Obermeier" ),
                new Testobjekt( 20000,"Neumeier"));
    }
}
