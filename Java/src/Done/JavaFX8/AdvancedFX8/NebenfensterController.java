package Done.JavaFX8.AdvancedFX8;

import Done.JavaFX8.Testobjekt;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;

import java.net.URL;
import java.util.ResourceBundle;

public class NebenfensterController implements Initializable {

    private Testobjekt testobjekt;
    private Controller controller;

    @FXML
    private Label titel;
    @FXML
    private ListView listview;
    @FXML
    private MenuItem menuItemBeenden;


    @FXML
    public void beenden(ActionEvent actionEvent) {
        titel.getScene().getWindow().hide();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        titel.setText("Liste:");
        menuItemBeenden.setText("Beenden!");

    }

    public void setParameters(Controller controller)
    {
        this.controller = controller;
        listview.setItems(controller.getList());
    }

    @FXML
    public void neueZahl(ActionEvent actionEvent) {
        controller.neueZahl();
    }
}
