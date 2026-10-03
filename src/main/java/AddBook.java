import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;

public class AddBook {

    @FXML
    private Button AddBookbtn;

    @FXML
    private TextField TxtAuthor;

    @FXML
    private ChoiceBox<?> TxtCategory;

    @FXML
    private DatePicker TxtDate;

    @FXML
    private Button btnClear;

    @FXML
    private TextField txtISBN;

    @FXML
    private Spinner<?> txtQty;

    @FXML
    private TextField txtTitle;

    @FXML
    void BtnOnActionClear(ActionEvent event) {

    }

    @FXML
    void btnAddBookOnAction(ActionEvent event) {

    }

}
