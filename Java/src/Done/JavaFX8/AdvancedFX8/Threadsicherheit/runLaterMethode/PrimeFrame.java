package Done.JavaFX8.AdvancedFX8.Threadsicherheit.runLaterMethode;

import javafx.application.Application;
import javafx.application.Platform;
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

// Lagert Berechnung der Primzahl in eigenen Thread aus und
// stellt Update der GUI in die EventQueue ein
public class PrimeFrame extends Application {

    private Prime prime;
    private BorderPane bpcontent;

    @Override
    public void start(final Stage primaryStage) {
        BorderPane bp = new BorderPane();

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

        class PrimeRunner implements Runnable {

            @Override
            public void run() {
                final int eingabe = Integer.parseInt(tf.getText());
                final int result = prime.calcPrimeNr(eingabe);
                Platform.runLater(() -> {
                    status.setText(String.valueOf(result));
                    bpcontent.setCenter(status);
                    berechnen.setDisable(false);
                });
            }

        }

        berechnen.setOnAction(e -> {
            berechnen.setDisable(true);
            ProgressBar pb = new ProgressBar();
            bpcontent.setCenter(pb);

            prime = new Prime();
            pb.progressProperty().bind(prime.progressProperty());

            Thread runner = new Thread(new PrimeRunner());
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
