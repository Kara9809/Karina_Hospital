public class Doctor extends Person{
    private DiseaseDescription diseaseSpecialty;
    private int roomNumber;
    private static int counter = 1;

    public Doctor(){
        super("Doctor ");
        this.diseaseSpecialty=DiseaseDescription.getRandomDiseaseDescription();
        this.roomNumber=counter++;
    }

    public DiseaseDescription getDiseaseSpecialty() {
        return diseaseSpecialty;
    }

    public void setDiseaseSpecialty(DiseaseDescription diseaseSpecialty) {
        this.diseaseSpecialty = diseaseSpecialty;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "\n\tId: " + getId()
                + "\n\tName: " + getName()
                + "\n\tAge: " + getAge()
                + "\n\tRoom Number: " + roomNumber
                + "\n\tDisease Specialty: " + diseaseSpecialty;
    }
}
