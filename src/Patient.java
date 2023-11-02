public class Patient extends Person {
    private Disease disease;

    public Patient() {
        super("Patient ");
        this.disease = new Disease();
    }

    public Disease getDisease() {
        return disease;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }

    @Override
    public String toString() {
        return "\n\n\t\tid: " + getId() + "\n\t\tName: " + getName() + "\n\t\tAge: " + getAge() + "\n\t\tDisease: " + getDisease();
    }
}
