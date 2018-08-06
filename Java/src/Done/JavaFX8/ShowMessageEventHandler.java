package Done.JavaFX8;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javax.swing.*;

public class ShowMessageEventHandler implements EventHandler<ActionEvent> {

    private String msg;

    public ShowMessageEventHandler(String msg)
    {
        this.msg = msg;
    }
    public void handle(ActionEvent e)
    {
        JOptionPane.showMessageDialog(null,msg);
    }
}
