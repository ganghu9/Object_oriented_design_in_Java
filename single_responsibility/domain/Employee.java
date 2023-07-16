package domain;
public class Employee {
    
    private Long id;
    private String name;
    private String deparment;
    private Boolean working;


    public Employee(long id, String name, String deparment, boolean working) {
        this.id = id;
        this.name = name;
        this.deparment = deparment;
        this.working = working;
    }
    

    public String toString() {
        return "Employee [id = " + id + ", name = " + name + ", deparment = " + deparment + ", working = " + working + "]";
    }

}
