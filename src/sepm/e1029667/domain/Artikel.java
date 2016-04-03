package sepm.e1029667.domain;

import javafx.beans.property.*;

/**
 * Created by Notrelb on 02.04.2016.
 */
public class Artikel {

    private IntegerProperty UNIQUE_ID;
    private IntegerProperty artikelnummer;
    private StringProperty bezeichnung;
    private DoubleProperty preis;


    public Artikel(int artikelnummer, String name, double preis){
        this.artikelnummer = new SimpleIntegerProperty(artikelnummer);
        this.bezeichnung = new SimpleStringProperty(name);
        this.preis = new SimpleDoubleProperty(preis);
    }

    public Artikel (){
        this(0,null,0);
    }


    public int getUNIQUE_ID() {
        return UNIQUE_ID.get();
    }

    public IntegerProperty UNIQUE_IDProperty() {
        return UNIQUE_ID;
    }


    public void setUNIQUE_ID(int UNIQUE_ID) {
        if(getUNIQUE_ID() == 0) {
            this.UNIQUE_ID.set(UNIQUE_ID);
        }else{
            System.out.println("Unique ID ist schon vorhanden");
        }
    }

    public int getArtikelnummer() {
        return artikelnummer.get();
    }

    public IntegerProperty artikelnummerProperty() {
        return artikelnummer;
    }

    public void setArtikelnummer(int artikelnummer) {
        this.artikelnummer.set(artikelnummer);
    }

    public String getBezeichnung() {
        return bezeichnung.get();
    }

    public StringProperty bezeichnungProperty() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung.set(bezeichnung);
    }

    public double getPreis() {
        return preis.get();
    }

    public DoubleProperty preisProperty() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis.set(preis);
    }
}
