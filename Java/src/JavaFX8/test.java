package JavaFX8;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

import javafx.event.ActionEvent;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class test {

    public static void main(String[] args) {

        HBox hBox = new HBox();
        VBox vBox = new VBox();
        hBox.setPadding(new Insets(0,0,0,0));
        hBox.setSpacing(5);
        HBox.setHgrow(hBox,Priority.ALWAYS);

        BorderPane borderPane = new BorderPane();
        borderPane.getChildren();

        FlowPane flowPane = new FlowPane();
        flowPane.setOrientation(Orientation.HORIZONTAL);

        GridPane gridPane = new GridPane();
        gridPane.setHgap(50);
        gridPane.setVgap(50);
        gridPane.add(new Button("Test"),0,0,2,2);
        gridPane.add(new Button("Test"),3,3);
        GridPane.setHalignment(gridPane,HPos.LEFT);
        GridPane.setValignment(gridPane,VPos.BASELINE);
        gridPane.addRow(1,borderPane);

        Line line = new Line();
        line.setFill(new Color(0,0,0,0));
        line.setStroke(Color.rgb(0,5,0));

        Button b = new Button("Test");
        b.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

            }
        });

        Button button2 = new Button("test");
        button2.setOnAction(new MeinEventHandler("Lorena"));


        class MeinEventHandler2 implements EventHandler<ActionEvent>
        {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("test");
            }
        }
        Button button3 = new Button("test");
        button3.setOnAction(new MeinEventHandler2());


        Label label = new Label("Test");
        label.setFont(Font.font("Arial", FontWeight.BOLD,15));

        label.textProperty().bind(button2.textProperty()); // !!!Üben

        TextField textField = new TextField();
        textField.getText();


        ObservableList list = FXCollections.<String>observableArrayList("A","B","C");
        ListView<String> listView = new ListView<String>();


        MenuItem menuItem = new MenuItem("Laden");
        menuItem.setOnAction(new MeinEventHandler("Laden"));
        menuItem.setAccelerator(KeyCombination.valueOf("CTRL+Y"));
        MenuItem menuItem2 = new MenuItem("Speichern");
        Menu untermenu = new Menu("Test");
        untermenu.getItems().addAll(menuItem,menuItem2);
        Menu obermenu = new Menu("Obermenu");
        obermenu.getItems().addAll(untermenu); //Da Menu extends MenuItem
        MenuBar menuBar = new MenuBar(obermenu);


    }
}
