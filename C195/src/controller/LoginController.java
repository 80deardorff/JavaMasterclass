package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML private TextField passwordField;
    @FXML private TextField usernameField;
    @FXML private Label userFeedback;

    @FXML void onSignOn(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/appointment.fxml")));
        Stage loginStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newStage = new Stage();
        newStage.setTitle("Appointments");
        newStage.setScene(new Scene(root, 600, 400));
        newStage.centerOnScreen();
        loginStage.close();
        newStage.show();
    }

    private void setUserFeedback(String s) {
        userFeedback.setText(s);
        userFeedback.setVisible(true);

        // Lambda for starting a new thread to sleep for 5 seconds,
        // then make user feedback text disappear
        new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            userFeedback.setVisible(false);
        }).start();
    }
}