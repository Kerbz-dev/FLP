package db;

 

import java.sql.Statement;

 

public class OpretLoginDB {

 

    public void createLogin(String medarbejderNavn, String username, String password) {
        Datakobling bils�lger = new Datakobling();
        try {
            Statement statement = bils�lger.connection.createStatement();

 

            statement.executeUpdate(
                    "INSERT INTO bilsealger " + "VALUES ('" + medarbejderNavn + "', '" + username + "', '" + password + "')");

 

            bils�lger.connection.close();

 

        } catch (Exception e) {
            System.out.println("Got exception");
            System.out.println(e.getMessage());
        }
    }
}