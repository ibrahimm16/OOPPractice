package inheritence;

public class Application {

    public static void main(String[] args) {
        Doctor doctor = new Doctor("The Metaverse", 100);

        Job job = new Doctor(null, 0);

        Person person = new Person("Ibrahim", doctor);
    }
}
