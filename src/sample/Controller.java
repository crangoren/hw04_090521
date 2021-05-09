package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

import javax.xml.soap.Text;
import java.awt.*;

public class Controller {
    @FXML
    TextField sendField;

    @FXML
    TextArea mainTextArea;
    @FXML
    Button btn;
//    private chatBuffer() {
//
//    }

    String chat = "";

    public String btnClicked(ActionEvent actionEvent) {
            mainTextArea.setText(chat + "User: " + sendField.getText());
            chat += "User: " + sendField.getText() + "\n";
            sendField.clear();

            return chat;
    }

}
