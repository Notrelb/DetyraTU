package sepm.e1029667.gui;

import javafx.fxml.FXML;
import sepm.e1029667.MainApp;

/**
 * Created by Notrelb on 02.04.2016.
 */
public class HomeController {


    //Reference to the main application.
    private MainApp mainApp;


    /**
     * Called when the user clicks the Verkauf button.
     * Opens a new Scene.
     */
    @FXML
    private void handleOpenVerkauf(){
        mainApp.showVerkauf();
    }

    /**
     * Called when the user clicks the Artikel Bearbeiten button
     * Open a new Scene.
     */
    @FXML
    private void handleOpenArtikelBerbeiten(){

        mainApp.showArtikelBearbeiten();

    }


    @FXML
    private void hadeleOpenRechnungen(){
        mainApp.showRechnungen();
    }

    @FXML
    private void handelOpenStatistik(){
        mainApp.showStatistik();
    }



    /**
     *  Is Called by the main appliction to gibe a reference back to istelf.
     * @param mainApp
     */

    public void setMainApp (MainApp mainApp){
        this.mainApp = mainApp;
    }

}
