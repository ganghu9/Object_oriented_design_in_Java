public class Doctor extends Employee {

    public Doctor(int id, String name, String department, boolean working) {
        super(id, name, department, working);
        System.out.println("Doctor in action...");
    }

    // public void prescribeMedicine() {
    //     System.out.println("Prescribe Medicine");
    // }

    // public void diagnosePatients() {
    //     System.out.println("Diagnose Patients");
    // }

}