package model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DbContentProvider {

    Connection c = null;
    Statement stmt = null;


    private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:C://sqlite/db/test.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    protected Person insert(Person person) {

        try {
            establishConnectionWithDb();


            String sql = "INSERT INTO PEOPLE (ID,NAME,SURENAME,BIRTHDATE,DEATHDATE,SEX) " +
                       "VALUES (?,?,?,?,?,?);";
            
            try (Connection conn = this.connect();
                    PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setLong(1, person.getId());
                pstmt.setString(2, person.getName());
                pstmt.setString(3, person.getSurname());
                pstmt.setString(4, person.getBirthDate());
                pstmt.setString(5, person.getDeathDate());
                //pstmt.setString(6, person.get);
                pstmt.executeUpdate();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            
            
            
		      stmt.executeUpdate(sql);

            closeConnectionWithDb();

        } catch (Exception e)

        {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened database successfully");
		return null;
    }


    private void establishConnectionWithDb() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        c = DriverManager.getConnection("jdbc:sqlite:test.db");
        stmt = c.createStatement();
    }
    private void closeConnectionWithDb() throws SQLException {
        stmt.close();
        c.close();
    }

}

