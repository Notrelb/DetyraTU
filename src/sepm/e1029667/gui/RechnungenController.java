package sepm.e1029667.gui;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import sepm.e1029667.MainApp;
import sepm.e1029667.domain.Artikel;
import sepm.e1029667.domain.Rechnung;

/**
 * Created by Notrelb on 02.04.2016.
 */
public class RechnungenController {

    //Reference to the main application.
    private MainApp mainApp;



    @FXML
    private TextField filterRechnung;

    @FXML
    private TableView<Rechnung> tabelViewRechnung;

        @FXML
        private TableColumn datumColumn;
        @FXML
        private TableColumn rechnungsNrColumn;
        @FXML
        private TableColumn gesamtsummeColumn;

    @FXML
    private Label datumRechnungLabel;
    @FXML
    private Label rechnungsNrLabel;
    @FXML
    private Label gesamtsummeLabel;

    @FXML
    private TableView<Artikel> tabelViewArtikel;

        @FXML
        private TableColumn artikelNrColumn;
        @FXML
        private TableColumn nameColumn;
        @FXML
        private TableColumn preisColumn;

    @FXML
    private void hadleOpenHome(){
        mainApp.showHome();
    }

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }

}
