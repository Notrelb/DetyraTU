package sepm.e1029667.gui;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import sepm.e1029667.MainApp;
import sepm.e1029667.domain.Artikel;

/**
 * Created by Notrelb on 02.04.2016.
 */
public class ArtikelBestandController {

    //Reference to the main application.
    private MainApp mainApp;


    @FXML
    private TextField search;

    @FXML
    private TableView<Artikel> tabelViewArtikel;

        @FXML
        private TableColumn artikelNrColumn;
        @FXML
        private TableColumn nameColumn;
        @FXML
        private TableColumn typColumn;
        @FXML
        private TableColumn preisColumn;

    @FXML
    private TextField artikelNummerField;
    @FXML
    private TextField nameField;
    @FXML
    private TextField preisField;

    @FXML
    private void handleOpenHome(){
        mainApp.showHome();
    }

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }
}
