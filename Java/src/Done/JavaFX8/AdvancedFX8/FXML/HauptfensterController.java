package Done.JavaFX8.AdvancedFX8.FXML;

import Done.JavaFX8.Testobjekt;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HauptfensterController extends Application implements Initializable {

    private static Controller controller = new Controller();
    private Stage stage;

    @FXML
    private Button nebenFensterButton;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        this.stage = primaryStage;

        FXMLLoader hauptfensterLoader = new FXMLLoader(getClass().getResource("Hauptfenster.fxml"));
        Pane hauptfensterPane = hauptfensterLoader.load();

        HauptfensterController hauptfensterController = hauptfensterLoader.getController();
        //hauptfensterController.initList();

        Scene scene = new Scene(hauptfensterPane);
        stage.initStyle(StageStyle.DECORATED);
        stage.setScene(scene);
        stage.show();
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        nebenFensterButton.setText("neues Fenster öffnen");
    }



    @FXML
    public void nebenfensterOpen(ActionEvent actionEvent) {
        FXMLLoader nebenfensterloader = new FXMLLoader(getClass().getResource("Nebenfenster.fxml"));
        Pane nebenfenster = null;
        try {
            nebenfenster = nebenfensterloader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        NebenfensterController nebenfensterController = nebenfensterloader.getController();
        nebenfensterController.setParameters(controller);

        Scene scene = new Scene(nebenfenster);
        Stage myStage = new Stage();
        myStage.initStyle(StageStyle.DECORATED);
        myStage.setScene(scene);
        myStage.show();
    }

}
