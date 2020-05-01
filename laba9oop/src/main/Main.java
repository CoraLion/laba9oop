package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent roat = FXMLLoader.load(getClass().getResource("main.fxml"));
        primaryStage.setTitle("First app: ");
        primaryStage.setScene(new Scene(roat, 500, 400));
        primaryStage.show();
    }
}
