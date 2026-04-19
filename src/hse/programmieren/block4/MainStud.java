package hse.programmieren.block4;

public class MainStud {

    public static void main(String[] args) {
        Student student1 = new Student(234, "John", "IT", true);
        Student student2 = new Student(333, "Sam", "SAGP", false);

        //student1.changeMatkNr(5);
        System.out.println(student1.name);
        System.out.println(student2.name);
        System.out.println(student1);

        Student[] myArray = {student1, student2};
        System.out.println();
    }
}
