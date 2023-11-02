import java.util.Arrays;

public class Room {
    private int roomNumber;
    private Doctor doctor;
    private Nurse nurse;
    private Patient[] patient;
    private static int counter = 1;
    public Room(){
        this.roomNumber=counter++;
        this.doctor=new Doctor();
        this.nurse=new Nurse();
        this.patient=new Patient[5];
        for (int i = 0; i < patient.length; i++) {
            this.patient[i]=new Patient();
        }
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    public Patient[] getPatient() {
        return patient;
    }

    public void setPatient(Patient[] patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        return "Room Number: " + roomNumber
                + "\n\tDoctor: " + doctor
                + "\n\n\tNurse: " + nurse
                + "\n\tPatients:\n" + Arrays.toString(patient);
    }
}
