public class Room {

    public String name;
    public Teacher teacher;
    public int numberOfStudents;

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", teacher=" + teacher +
                ", numberOfStudents=" + numberOfStudents +
                '}';
    }
}
