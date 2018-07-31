package Done.Schichtenarchitektur.gui;

import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class GuiKlasse extends Application {

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        Label label = new Label();
        label.setText(""+ Controller.getInstance().durchschnitt());
    }
}
