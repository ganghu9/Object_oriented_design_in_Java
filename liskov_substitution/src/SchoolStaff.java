public class SchoolStaff {
    String name;

    public SchoolStaff(String name) {
        this.name = name;
    }

    private void makeAnnouncements() {
        System.out.println("made announcements...");
    }

    private void takeAttendance() {
        System.out.println("took attendance...");
    }

    private void collectPaperWork() {
        System.out.println("collected paperwork...");
    }

    private void conductHallwayDuties() {
        System.out.println("conducted hallway duties...");
    }

    public void performOtherResponsibilities() {
        makeAnnouncements();
        takeAttendance();
        collectPaperWork();
        conductHallwayDuties();
    }


}
