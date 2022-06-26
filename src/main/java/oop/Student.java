package oop;

import java.util.List;

public class Student {

    String name;
    List<Room> rooms;

    public Student(String paramName, List<Room> paramRooms) {
        name = paramName;
        rooms = paramRooms;
    }

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
