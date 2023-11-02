public class Nurse extends Person{
    private int roomNumber;
    private static int counter = 1;

    public Nurse(){
        super("Nurse ");
        this.roomNumber=counter++;
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
                    + "\n\tRoom Number: " + roomNumber;
    }
}
