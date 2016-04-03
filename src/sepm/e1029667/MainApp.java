package sepm.e1029667;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import sepm.e1029667.gui.ArtikelBestandController;
import sepm.e1029667.gui.HomeController;
import sepm.e1029667.gui.RechnungenController;
import sepm.e1029667.gui.VerkaufController;

import java.io.IOException;

/**
 * Created by Notrelb on 02.04.2016.
 */
public class MainApp extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;


    @Override
    public void start(Stage primaryStage) throws Exception {

        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Pferde Megoutlet");

        //Load the root layout
        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("gui/RootLayout.fxml"));
        rootLayout = (BorderPane) loader.load();

        Scene scene = new Scene(rootLayout);
        primaryStage.setScene(scene);
        primaryStage.show();

        this.showHomeOverview();

    }

    //Shows the homeoverview scene
    private void showHomeOverview(){
        FXMLLoader loader = this.buildPaneScene("gui/Home.fxml");

        //Give the controller acces to the main app.
        HomeController controller = loader.getController();
        controller.setMainApp(this);
    }


    /**
     * Open  the Window Scene
     */
    public void showVerkauf(){


        FXMLLoader loader = this.buildSplitPaneScene("gui/Verkauf.fxml");
        VerkaufController controller = loader.getController();
        controller.setMainApp(this);

    }

    /**
     * Open the  ArtikelBearbeiten Scene
     */
    public void showArtikelBearbeiten(){
        FXMLLoader loader = this.buildSplitPaneScene("gui/ArtikelBestand.fxml");

        ArtikelBestandController controller = loader.getController();
        controller.setMainApp(this);
    }


    /**
     * Open the Rechnungen Scene
     */

    public void showRechnungen(){
        FXMLLoader loader = this.buildSplitPaneScene("gui/Rechnungen.fxml");

        RechnungenController controller = loader.getController();
        controller.setMainApp(this);
    }


    /**
     * Open the Statistik Scene
     */
    public void showStatistik(){
        this.buildSplitPaneScene("gui/Statistik.fxml");
    }


    /**
     * Open the Home Scene
     */
    public void showHome(){
        this.showHomeOverview();
    }




    private FXMLLoader buildSplitPaneScene(String url){
        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource(url));
            SplitPane overviewPage = (SplitPane) loader.load();
            rootLayout.setCenter(overviewPage);
            return loader;

        }catch (IOException e){
            e.printStackTrace();
        }
        return  null;
    }

    private FXMLLoader buildPaneScene(String url){
        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource(url));
            Pane overviewPage = (Pane) loader.load();
            rootLayout.setCenter(overviewPage);
            return loader;
        }catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }




    public static void main (String [] args){
        launch(args);
    }

}
