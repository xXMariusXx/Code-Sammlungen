package Done.JavaFX8;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class HauptProgrammView extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        //new GridBeispielView();
        //new MouseKlickEvent();
        //new FensterView();
        new Fenster2View();

    }
}
