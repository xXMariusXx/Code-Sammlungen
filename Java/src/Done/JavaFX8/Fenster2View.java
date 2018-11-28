package Done.JavaFX8;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Fenster2View {
    private Stage stage;
    private Testobjekt testobjekt;

    public Fenster2View() {
        this.stage = new Stage();
        this.testobjekt = new Testobjekt();
        this.erstellen();
    }

    public void erstellen()
    {
        MenuItem menuItemBeenden = new MenuItem("Beenden");
        Menu menuBeenden = new Menu("Beenden");
        menuBeenden.getItems().addAll(menuItemBeenden);
        MenuItem menuItem1 = new MenuItem("1");
        menuItem1.setAccelerator(new KeyCodeCombination(KeyCode.Y, KeyCombination.CONTROL_ANY));
        //menuItem1.setAccelerator(KeyCombination.valueOf("CTRL+Y"));
        menuItem1.setOnAction((event -> Controller.neuerWert(testobjekt)));
        MenuItem menuItem2 = new MenuItem("2");
        MenuItem menuItem3 = new MenuItem("3");
        MenuItem menuItem4 = new MenuItem("4");
        Menu menu1 = new Menu("erstesMenu");
        menu1.getItems().addAll(menuItem1,menuItem2);
        Menu menu2 = new Menu("zweitesMenu");
        menu2.getItems().addAll(menu1,menuItem3,menuItem4);
        MenuBar menuBar = new MenuBar(menu2,menuBeenden);

        ListView listView = new ListView(testobjekt.getListe());
        //listView.setItems(testobjekt.getListe());


        GridPane gridPane = new GridPane();
        gridPane.addRow(10);
        gridPane.add(menuBar,0,0,1,5);
        gridPane.add(listView,10,10,5,5);

        gridPane.add(new Button("TestEins"),7,7,2,2);
        gridPane.add(new Button("TestZwei"),3,3);



        Scene scene = new Scene(gridPane,1000,500);
        stage.setScene(scene);
        stage.show();
    }
}
