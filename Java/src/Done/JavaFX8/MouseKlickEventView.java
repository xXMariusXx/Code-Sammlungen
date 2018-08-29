package Done.JavaFX8;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.Random;

public class MouseKlickEventView {

    public MouseKlickEventView(Stage stage) {

        Scene alt = stage.getScene();

        Pane root = new Pane();

        root.setOnMouseClicked(event -> {
            root.getChildren().removeAll(root.getChildren());
            Random random = new Random();
            Rectangle r = new Rectangle(event.getX(), event.getY(), 15, 15);
            r.setFill(Color.rgb(random.nextInt(255),(int) (255* Math.random()) ,random.nextInt(255)));
            root.getChildren().add(r);
        });

        Scene scene = new Scene(root,100,100);
        root.setOnMouseExited(event -> stage.setScene(alt));

        stage.setScene(scene);
        stage.show();
    }
}
