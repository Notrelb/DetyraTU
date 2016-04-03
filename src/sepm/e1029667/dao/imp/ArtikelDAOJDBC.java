package sepm.e1029667.dao.imp;

import javafx.collections.ObservableList;
import sepm.e1029667.dao.ArtikelDAO;
import sepm.e1029667.domain.Artikel;
import sepm.e1029667.service.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Notrelb on 02.04.2016.
 */
public class ArtikelDAOJDBC implements ArtikelDAO {




    private Connection connection;
    PreparedStatement preparedStatement;


    public ArtikelDAOJDBC(){
        this.connection = ConnectionFactory.getConnection();

    }


    @Override
    public void insertArtikel(Artikel artikel) {
        try {
            preparedStatement = connection.prepareStatement("INSERT  INTO Artikel (ARTIKELNUMMER,NAME,PREIS) VALUES (?,?,?)");
            preparedStatement.setInt(1,artikel.getArtikelnummer());
            preparedStatement.setString(2,artikel.getBezeichnung());
            preparedStatement.setDouble(3,artikel.getPreis());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteArtikel(int uniqueID) {

        try {
            preparedStatement = connection.prepareStatement("DELETE FROM Artikel WHERE ID = ?");
            preparedStatement.setInt(1,uniqueID);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public ObservableList<Artikel> getAllArtikels() {
        return null;
    }

    @Override
    public void updateArtikel(Artikel artikel) {

    }

    @Override
    public void getArtikel(int uniqueID) {

    }
}
