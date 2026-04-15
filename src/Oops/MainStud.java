package Oops;

public class MainStud {

    public static void main(String[] args) {

        Student student = new Student();

        student.setName("Deepa");
        student.setAge(25);
        int num = 10;
        double convertedNum = num;

        System.out.println("Implicit Casting (int to double): " + convertedNum);

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Num: " + num);
        System.out.println("Converted Num: " + convertedNum);
    }
}
