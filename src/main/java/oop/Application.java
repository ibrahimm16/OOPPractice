package oop;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        Teacher teacher = new Teacher("teacher");

        Room room = new Room("Intro to coding", teacher, 20);
        Room bio = new Room("biology", teacher, 20);

        Student student = new Student("student", Arrays.asList(room, bio));

        System.out.println(student);

        System.out.println(student.isInRoom("Intro to coding"));
        System.out.println(student.isInRoom("biology"));
        System.out.println(student.isInRoom("idk"));

    }
}
