package sepm.e1029667.gui;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import sepm.e1029667.MainApp;
import sepm.e1029667.domain.Artikel;

/**
 * Created by Notrelb on 02.04.2016.
 */
public class VerkaufController {


    //Reference to the main application.
    private MainApp mainApp;

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
    private void hadleOpenHome(){
        mainApp.showHome();
    }


    /**
     *  Is Called by the main appliction to gibe a reference back to istelf.
     * @param mainApp
     */

    public void setMainApp (MainApp mainApp){
        this.mainApp = mainApp;
    }
}
