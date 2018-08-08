package Done.JavaFX8.AdvancedFX8.Threadsicherheit.TaskMethode;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

// Lagert lange Berechnungen über Task in eigenen Thread aus
public class PrimeFrame extends Application {

    @Override
    public void start(final Stage primaryStage) {
        BorderPane bp = new BorderPane();
        BorderPane bpcontent;

        MenuBar mb = new MenuBar();
        Menu primmenu = new Menu("Primzahl");
        MenuItem beenden = new MenuItem("Beenden");
        beenden.setOnAction(e -> {
            primaryStage.close();
            Platform.exit();
        });
        primmenu.getItems().add(beenden);
        mb.getMenus().add(primmenu);

        FlowPane fp = new FlowPane();
        fp.setPadding(new Insets(10.0));
        fp.setHgap(10.0);
        TextField tf = new TextField();
        Label label = new Label("-te Primzahl");
        Button berechnen = new Button("Berechnen");

        fp.getChildren().addAll(tf, label, berechnen);

        bp.setTop(mb);
        bp.setCenter(fp);

        Label status = new Label("Primzahl muss noch berechnet werden!");

        bpcontent = new BorderPane();
        bpcontent.setTop(fp);
        bpcontent.setCenter(status);
        bp.setCenter(bpcontent);

        berechnen.setOnAction(e -> {
            berechnen.setDisable(true);

            final ProgressBar pb = new ProgressBar();
            bpcontent.setCenter(pb);

            final Task<Integer> task = new PrimeTask(Integer.parseInt(tf.getText()));
            pb.progressProperty().bind(task.progressProperty());

            task.setOnSucceeded((v) -> { //wird ausgeführt, wenn Event succeded ausgelöst wird -> wenn Task fertig ist
                status.setText(String.valueOf(task.getValue()));
                bpcontent.setCenter(status);
                berechnen.setDisable(false);
            });
            Thread runner = new Thread(task); //Task läuft in seperatem Thread
            runner.setDaemon(true);
            runner.start();
        });

        Scene scene = new Scene(bp, 400.0, 150.0);

        primaryStage.setTitle("Primzahlen 1");
        primaryStage.setScene(scene);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch();

    }

}
