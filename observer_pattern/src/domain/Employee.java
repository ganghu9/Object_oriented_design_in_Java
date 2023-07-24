package domain;

import java.util.Date;

public class Employee {

    private String name;
    private Date HireDate;
    private int salary;
    private  String department;
    private int phoneNumber;
    private String emailAddress;
    private int employeeID;
    private boolean working = false;

    private static int COUNTER;

    public Employee(String name, Date hireDate, int salary, String department, int phoneNumber, String emailAddress,
    int employeeID, boolean working) {

        this.name = name;
        HireDate = hireDate;
        this.salary = salary;
        this.department = department;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.employeeID = ++COUNTER;
    }

    public String toString(){
        return "domain.Employee [bane=" + name + ", HireDate=" + HireDate + ", salary=" + salary +
                ", department=" + department + ", phoneNumber=" + phoneNumber + ", emailAddress=" + emailAddress +
                ", employeeID=" + employeeID + ", working=" + working + "]";

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId(){
        return employeeID;
    }


}
