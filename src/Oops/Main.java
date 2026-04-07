package Oops;

public class Main {

    public static void main(String[] args) {

        Student student = new Student();

        student.setName("Deepa");
        student.setAge(25);

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }
}
