package AccessModifier;

class Person {

    // private — only accessible inside this class
    private String name;
    private int age;

    // public — accessible from anywhere
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // public getter — controlled way to read private data
    public String getName() { return name; }
    public int getAge()     { return age;  }

    // public setter — controlled way to write private data
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }
}

public class AccessModifier1 {
    public static void main(String[] args) {

        Person p = new Person("Alice", 25);

        // ✅ public — works fine
        System.out.println("Name : " + p.getName());
        System.out.println("Age  : " + p.getAge());

        p.setAge(30);
        System.out.println("New Age: " + p.getAge());

        // ❌ private — compile error!
        // p.name = "Bob";
        // p.age  = -5;
    }
}