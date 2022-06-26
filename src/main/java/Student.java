import java.util.List;

public class Student {

    public String name;
    public List<Room> rooms;

    public boolean isInRoom(String name) {
        return rooms.stream().anyMatch((room) -> room.name.equals(name));
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rooms=" + rooms +
                '}';
    }
}
