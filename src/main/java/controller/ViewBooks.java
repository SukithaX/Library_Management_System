package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewBooks {

    @FXML
    private Button AddBooks;

    @FXML
    private Button Dashboard;

    @FXML
    private TableView<?> TblBooks;

    @FXML
    void btnAddBookOnAction(ActionEvent event) {
        Stage stage = new Stage();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("controller.addbook.AddBook.fxml"))));
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void btnDashOnAction(ActionEvent event) {

    }

}
