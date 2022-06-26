package oop;

public class Room {

    String name;
    Teacher teacher;
    int numberOfStudents;

    public Room(String paramName, Teacher paramTeacher, int paramNOS) {
        name = paramName;
        teacher = paramTeacher;
        numberOfStudents = paramNOS;
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", teacher=" + teacher +
                ", numberOfStudents=" + numberOfStudents +
                '}';
    }
}
