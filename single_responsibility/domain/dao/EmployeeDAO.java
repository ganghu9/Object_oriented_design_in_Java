package domain.dao;
// DAO stands for data access objects

import domain.Employee;

public class EmployeeDAO {

//     public EmployeeDAO (Employee employee) {
//     }
    

public void saveEmployee(Employee employee) {
    // save employee to the database
    // DatabaseConnectionManager connectionManager = DatabaseConnectionManager.getManagerInstance();
    // connectionManager.connect();
    // connectionManager.getConnectionObject().prepareStatement("insert into employee_tbl");
    // connectionManager.disconnect();

    System.out.println("Saved employee to the database: " + employee);


}

public void deleteEmployee(Employee employee) {
    // delete employee from the database

    System.out.println("Deleted employee from the database: " + employee);
}

}