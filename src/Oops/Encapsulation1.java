package Oops;

class Stud {
    // Private data member — hidden from outside
    private String name;

    // Setter method
    public void setName(String name) {
        this.name = name;
    }

    // Getter method
    public String getName() {
        return name;
    }
}

public class Encapsulation1 {
    public static void main(String[] args) {
        Stud s = new Stud();

        // Setting value using setter
        s.setName("John");

        // Getting value using getter
        System.out.println("Student Name: " + s.getName());
    }
}
