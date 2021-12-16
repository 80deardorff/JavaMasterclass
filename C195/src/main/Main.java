package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.Objects;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/login.fxml")));
        stage.setTitle("Appointment Scheduler");
        stage.setScene(new Scene(root, 600, 450));
        stage.initStyle(StageStyle.UTILITY);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
