package ToDo.JavaFX8;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class MeinEventHandler implements EventHandler<ActionEvent> {

    private String msg;

    public MeinEventHandler(String msg)
    {
        this.msg = msg;
    }
    public void handle(ActionEvent e)
    {
        System.out.println("msg");
    }
}
