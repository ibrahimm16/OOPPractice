import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name = "teacher";

        Room room = new Room();
        room.name = "Intro to coding";
        room.numberOfStudents = 20;
        room.teacher = teacher;

        Student student = new Student();
        student.name = "student";
        student.rooms = Arrays.asList(room);


        System.out.println(student.isInRoom("not coding"));
    }
}
