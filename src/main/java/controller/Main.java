package controller;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.fxml.FXMLLoader.load;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Application {
    @Override
    public void start(Stage stage){
        try {
            stage.setScene(new Scene(load(getClass().getResource("GUI/login.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();
    }
    public static void main(String[] args){
        launch(args);

    }
}