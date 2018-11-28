package Done.JavaFX8;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class HauptProgramm extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button mausButton = new Button("Cooles Maus Fenster");
        mausButton.setOnAction((evt) -> new MouseKlickEventView(primaryStage));

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(mausButton);


        Scene scene = new Scene(borderPane);
        primaryStage.setScene(scene);
        primaryStage.show();


        new GridBeispielView();
        //new MouseKlickEvent();
        //new FensterView();
        //new Fenster2View();

    }
}
