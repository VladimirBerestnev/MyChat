package newchat;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    public TextArea newChatArea;
    @FXML
    public ListView usersList;
    @FXML
    public TextField enterText;
    @FXML
    public Button buttonSend;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        usersList.setItems(FXCollections.observableArrayList("User1", "User2"));
    }

    public void exit(ActionEvent actionEvent) {
        System.exit(1);
    }

    public void edit(ActionEvent actionEvent) {
    }

    public void help(ActionEvent actionEvent) throws URISyntaxException, IOException {
        Desktop desktop = Desktop.getDesktop();
        desktop.browse(new URI("http://yandex.ru"));
    }

    public void enterText(ActionEvent actionEvent) {
    moveTextFromField();
    }

    public void sendMessage(ActionEvent actionEvent) {
        moveTextFromField();
    }

    private void moveTextFromField() {
        String msg = enterText.getText();
        if (msg.length() > 0)
            newChatArea.appendText(msg + System.lineSeparator());
        enterText.clear();

    }


    public void about(ActionEvent actionEvent) {
    }
}
