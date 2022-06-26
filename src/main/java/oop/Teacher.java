package oop;

public class Teacher {

    String name;

    public Teacher(String paramName) {
        name = paramName;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }
}
