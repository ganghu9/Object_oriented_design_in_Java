package domain;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

    Employee emp1 = new Employee("John", null, 100000,
            "IT", 123456789, "John@gmail.com", 1, false);

    Employee emp2 = new Employee("Mike", null, 200000,
            "IT", 123332678, "Mike@gmail.com", 2, false);

    Employee emp3 = new Employee("Steve", null, 300000,
            "IT", 378560922, "Steve@gmail.com", 3, false);

    Employee emp4 = new Employee("Mark", null, 400000,
            "IT", 143256789, "Mike@gmail.com", 4, false);



    List<Employee> employees;

    public List<Employee> generateEmployees() {
        employees = new ArrayList<Employee>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }










}
