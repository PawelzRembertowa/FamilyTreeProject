package model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

    public int insert(Person person) {
    	int check = 0;
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
                pstmt.setString(6, person.getSex().toString());
                //pstmt.setString(6, person.get);
                pstmt.executeUpdate();
            } catch (SQLException e) {
            	check = 1; // blad przy wstawianiu wiersza
                System.out.println(e.getMessage());
            }
		      stmt.executeUpdate(sql);
            closeConnectionWithDb();

        } catch (Exception e)

        {
        	check = 2; //blad polaczenia z baza danych
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened database successfully");
		return check;
    }

    public Person select(int Id) {
    	Person person;
    	
        try {
            establishConnectionWithDb();

            String sql = "Select * from PEOPLE " +
                       "WHERE id = ?;";
            
            try (Connection conn = this.connect();
                    PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setLong(1, Id);

                ResultSet rs = pstmt.executeQuery();
                
                 person = new Person(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
                
                
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
		//TUTAJ ZMIENILEM BY SIE KOMPILOWALO
        return null;
				//person;
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

