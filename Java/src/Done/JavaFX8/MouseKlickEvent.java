package Done.JavaFX8;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class MouseKlickEvent {

    public MouseKlickEvent() {

        Pane root = new Pane();

        root.setOnMouseClicked(event -> {
            root.getChildren().removeAll(root.getChildren());
            Rectangle r = new Rectangle(event.getX(), event.getY(), 35, 35);
            r.setFill(Color.BLUE);
            root.getChildren().add(r);
        });

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
}
