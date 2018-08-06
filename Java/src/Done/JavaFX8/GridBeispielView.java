package Done.JavaFX8;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class GridBeispielView {
    public GridBeispielView()
    {
        ObservableList<String> list = FXCollections.observableArrayList();
        list.addAll("1","2","3","4","5","6");
        ListView listView = new ListView(list);

        Label label = new Label("Label 1");
        Label label1 = new Label("Label 2");

        TextField tf1 = new TextField("Textfeld 1");
        TextField tf2 = new TextField("Textfeld 2");
        TextField tf3 = new TextField("Textfeld 3");

        Button start = new Button("Start");


        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10,10,10,10));
        gridPane.setVgap(10);
        gridPane.setHgap(10);

        gridPane.add(listView,0,0,1,7);
        gridPane.addColumn(1,label,label1);
        gridPane.addColumn(3,tf1,tf2,tf3);
        gridPane.add(start,3,10);
        GridPane.setHalignment(start,HPos.CENTER);


        Scene scene = new Scene(gridPane);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
}
