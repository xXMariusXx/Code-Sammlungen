package Done.JavaFX8;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


public class FensterView  {
    private Testobjekt testobjekt;
    private Stage stage;

    public FensterView() {

        this.testobjekt= new Testobjekt();
        this.stage = new Stage();
        this.erstellen();
    }


    public void erstellen()
    {
        Button buttonBeenden = new Button("Beenden");
        buttonBeenden.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stage.close();
            }
        });

        Button buttonTestobjekt = new Button("neuer Wert");
        buttonTestobjekt.setOnAction(event -> testobjekt.neuerWert());
        VBox vBox = new VBox(buttonTestobjekt, buttonBeenden);
        vBox.setSpacing(5);
        vBox.setPadding(new Insets(10,10,10,10));
        vBox.setAlignment(Pos.CENTER_LEFT);
        VBox.setVgrow(vBox,Priority.ALWAYS);


        Label liveText = new Label("Live Wert: ");
        liveText.setFont(Font.font("Arial", FontWeight.BOLD,15));
        Label live = new Label("");
        live.setFont(Font.font("Arial", FontWeight.BOLD,15));
        live.textProperty().bind(testobjekt.idProperty().asString());

        HBox hBox = new HBox(liveText,live);
        hBox.setAlignment(Pos.CENTER);
        hBox.setPadding(new Insets(10,10,10,10));



        FlowPane flowPane = new FlowPane();
        Button button1 = new Button("Eins");
        Button button2 = new Button("Zwei");
        Button button3 = new Button("Drei");
        Button button4 = new Button("Vier");
        flowPane.getChildren().addAll(button1,button2,button3,button4);
        flowPane.setPadding(new Insets(10,10,10,10));
        flowPane.setAlignment(Pos.CENTER_LEFT);
        flowPane.setOrientation(Orientation.VERTICAL); //Standard horizontal

        Line line = new Line();
        line.setFill(new Color(0,0,0,0));
        line.setStroke(Color.rgb(0,255,0));



        BorderPane borderPane = new BorderPane();
        borderPane.setBottom(hBox);
        borderPane.setRight(vBox);
        borderPane.setCenter(line);
        borderPane.setLeft(flowPane);

        Scene scene = new Scene(borderPane);
        stage.setTitle("ProgrammWOW");
        stage.setScene(scene);
        stage.show();
    }
}
