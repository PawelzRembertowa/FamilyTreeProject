package model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbContentProvider {

    Connection c = null;
    Statement stmt = null;


    protected Person query() {

        try {
            establishConnectionWithDb();


            String sql = "CREATE TABLE IF NOT EXISTS PEOPLE " +
                    "(ID 			INT ," +
                    " NAME           TEXT, " +
                    " SURENAME       TEXT, " +
                    " BIRTHDATE      TEXT, " +
                    " DEATHDATE      TEXT, " +
                    " SEX            TEXT)";
            stmt.executeUpdate(sql);

		      /*sql = "INSERT INTO PEOPLE (ID,NAME,SURENAME,BIRTHDATE,DEATHDATE,SEX) " +
                       "VALUES (1, 'Kamil', 'Wyrzykowski', '19820515','' ,'M' );";
		      stmt.executeUpdate(sql);

		      sql = "INSERT INTO PEOPLE (ID,NAME,SURENAME,BIRTHDATE,DEATHDATE,SEX) " +
	                   "VALUES (1, 'Pawel', 'zRembertowa', '19890328','' ,'M' );";
		      stmt.executeUpdate(sql);

		      sql = "INSERT INTO PEOPLE (ID,NAME,SURENAME,BIRTHDATE,DEATHDATE,SEX) " +
	                   "VALUES (1, 'Michal', 'JamCiTo', '19860922','' ,'M' );";
		      stmt.executeUpdate(sql);
		      */
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

