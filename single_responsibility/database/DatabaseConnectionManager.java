package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {

    private Connection conn;

    private static DatabaseConnectionManager connectionInstance = new DatabaseConnectionManager();


    private DatabaseConnectionManager() {

    }


    public static DatabaseConnectionManager getManagerInstance() {
        return connectionInstance;
    }

    /**
     * contains connection details
     * 
     * @throw SQLException
     */

    public void connect() throws SQLException {
        // processing specific to database connection details
        conn = DriverManager.getConnection("Some/Database/URL");
        System.out.println("Established Database Connection...");
    }

    public Connection getConnectionObject() {
        return conn;
    }

    public void disconnect() throws SQLException {
		conn.close();
		System.out.println("Disconnected from Database...");
	}





    
    // public void getManagerInstance(EmployeeDAO employeeDAO) {

    // }   
    
    
    // public void conncet(EmployeeDAO employeeDAO) {

    // }


    // public void getManagerObject(EmployeeDAO employeeDAO) {

    // }


    // public void disconnect(EmployeeDAO employeeDAO) {

    // }

}
