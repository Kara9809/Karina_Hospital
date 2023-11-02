import java.util.Arrays;

public class Hospital {
    private final String name;
    private Room[] rooms;

    public Hospital() {
        this.name = "Karina CTE";
        this.rooms = new Room[10];
        for (int i = 0; i < rooms.length; i++) {
            this.rooms[i] = new Room();
        }
    }

    public String getName() {
        return name;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "Hospital " + name + "\nRooms:\n" + Arrays.toString(rooms);
    }
}

