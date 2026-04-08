package Oops;

// No outer Inheritance_ex2 wrapper!

class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void eat()  { System.out.println(name + " is eating."); }
    void sleep(){ System.out.println(name + " is sleeping."); }
}

class Dog extends Animal {
    String breed;

    Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    void eat() { System.out.println(name + " eats dog food!"); }

    void bark() { System.out.println(name + " says: Woof!"); }
}

class Cat extends Animal {
    Cat(String name, int age) { super(name, age); }

    @Override
    void eat() { System.out.println(name + " eats gracefully."); }
}

// This matches the filename
public class Inheritance_ex2 {
    // empty — or delete this file entirely and use Main_I_ex2 as entry point
}