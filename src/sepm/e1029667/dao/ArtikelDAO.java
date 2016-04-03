package sepm.e1029667.dao;

import javafx.collections.ObservableList;
import sepm.e1029667.domain.Artikel;

/**
 * Created by Notrelb on 02.04.2016.
 */
public interface ArtikelDAO {

    void insertArtikel(Artikel artikel);
    void deleteArtikel(int uniqueID);
    ObservableList<Artikel> getAllArtikels();
    void updateArtikel(Artikel artikel);
    void getArtikel(int uniqueID);

}
