package dataBaseAccess;

import java.sql.*;

public class SQLiteJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Connection c = null;
		 Statement stmt = null;
		    try {
		      Class.forName("org.sqlite.JDBC");
		      c = DriverManager.getConnection("jdbc:sqlite:test.db");
		      
		      stmt = c.createStatement();
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
		      stmt.close();
		      c.close();
		      
		    } catch ( Exception e ) {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		      System.exit(0);
		    }
		    System.out.println("Opened database successfully");
	}
	

}
