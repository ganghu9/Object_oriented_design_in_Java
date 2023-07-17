public class HospitalManagement {

    public void callUpon(Employee employee) {
        // This conditional statement will be messy when more requirements are added
        // if (employee instanceof Nurse) {
        //     checkVitalSigns();
        //     drawBlood();
        //     cleanPatientArea();
        // } else if (employee instanceof Doctor) {
        //     prescribeMedicine();
        //     diagnosePatients();
        // }

        employee.performDuties();


    }
    


    // Try to spot SRP violation
    // They are junk
    // Nurses
    // private void checkVitalSigns() {
    //     System.out.println("Checking vitals...");
    // }

    // private void drawBlood() {
    //     System.out.println("Drawing blood...");
    // }

    // private void cleanPatientArea() {
    //     System.out.println("Cleaning patient area...");
    // }

    // Doctors
    // private void prescribeMedicine() {
    //     System.out.println("Prescribe Medicine");
    // }

    // private void diagnosePatients() {
    //     System.out.println("Diagnose Patients");
    // }






}
