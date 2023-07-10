public class ClientModule {

    public static void main(String[] args) {

        Employee peggy = new Employee(1, "peggy", "Accounting", true);

        ClientModule.hireNewEmployee(peggy);
    }


    
    public static void hireNewEmployee(Employee employee) {
        EmployeeDAO employeeDao = new EmployeeDAO();
        employeeDao.saveEmployee(employee);

    }

    public static void terminateEmployee(Employee employee) {
        EmployeeDAO employeeDao = new EmployeeDAO();
        employeeDao.deleteEmployee(employee);
    }




}
