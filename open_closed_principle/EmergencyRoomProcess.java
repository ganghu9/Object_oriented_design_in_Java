public class EmergencyRoomProcess {

    public static void main(String[] args) {
        
        HospitalManagement ERDirector = new HospitalManagement();
        Employee peggy = new Nurse(1, "Peggy", "Emergency", true);
        ERDirector.callUpon(peggy);
        
    }
    
}
