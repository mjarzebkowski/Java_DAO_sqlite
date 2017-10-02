package net.codejava.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MJ_DAO_Controller {
    //connection String
    static String dbHost = "localhost";
    static String dbPassword = "1234";
    static String dbPort = "1234";
    static String dbUser = "admin";
    static String dbName = "default";

    // specjalnie dla SQLite
    static String dbPatch = "K:\\Repo2017\\Java_DAO_sqlite\\Java_DAO_sqlite\\Users.sqlite3";

    public static void MJ_DAO_Controller(){
// from:       http://www.codejava.net/java-se/jdbc/connect-to-sqlite-via-jdbc
        try {
            Class.forName("org.sqlite.JDBC");
            String dbURL = dbPatch;
            Connection conn = DriverManager.getConnection(dbURL);
            if (conn != null) {
                System.out.println("Connected to the database");
                DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
                System.out.println("Driver name: " + dm.getDriverName());
                System.out.println("Driver version: " + dm.getDriverVersion());
                System.out.println("Product name: " + dm.getDatabaseProductName());
                System.out.println("Product version: " + dm.getDatabaseProductVersion());
                conn.close();
            }
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void initializeDB(){
//        create new file, open it using jdbc, and run query
    };

    public static void connectToDB(){

    };

    public static void connectToDB_SQLite(String dbPatch){

    };

    public static void addUser(String username, String password){

    };
    public static void removeUser(String username){

    };
    public static void printListUser(){

    };
    public static boolean isExistUser(String username){
        return false;
    };

    public static boolean isExistUser(int ID){
        return false;
    };

    public static boolean compareUserPassword(String passDB, String passInserted){
        return false;
    };
    public static boolean compareUserName(String usernameDB, String usernameInserted){
        return false;
    };
}
