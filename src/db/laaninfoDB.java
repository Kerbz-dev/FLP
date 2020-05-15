package db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.LaaneTilbud;

public class laaninfoDB {


        public List<LaaneTilbud> getLaan () {
            ArrayList<LaaneTilbud> list = new ArrayList<LaaneTilbud>();
            Datakobling DB = new Datakobling(); 
            try {
                Statement stmt = DB.connection.createStatement();
                String query = "SELECT * FROM laanetilbud";

                ResultSet rs = stmt.executeQuery(query);
                while (rs.next()) {
                    int telefonnummer = rs.getInt("telefonnummer");
                    int kundeindbetaling = rs.getInt("kundeindbetaling");
                    int laanlaengde = rs.getInt("laanlaengde");
                    boolean overstigergraense = rs.getBoolean("overstigergraense");
                    int laanestatus = rs.getInt("laanestatus");
                    int bilid = rs.getInt("bilid");
                    int bilsealgerid = rs.getInt("bilsaelgerid");
                    String rentedato = rs.getString("rentedato");

                    LaaneTilbud laan = new LaaneTilbud(telefonnummer, kundeindbetaling, laanlaengde,
                            overstigergraense, laanestatus, bilid, bilsealgerid, rentedato);

                    list.add(laan);
                }
            } catch (SQLException e) {
                System.out.println("Error running SQL statement");
                System.out.println(e.getMessage());
            }
            return list;
        } 
    }