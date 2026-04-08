package Oops;

// Parent class
class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    public double calculateSalary() {
        return 0;
    }

    public void displaySalary() {
        System.out.println(name + "'s Salary: ₹" + calculateSalary());
    }
}

// Child 1 — Fixed monthly salary
class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

// Child 2 — Paid per hour
class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

// Child 3 — Fixed + commission on sales
class SalesEmployee extends Employee {
    double baseSalary;
    double salesAmount;

    SalesEmployee(String name, double baseSalary, double salesAmount) {
        super(name);
        this.baseSalary = baseSalary;
        this.salesAmount = salesAmount;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (salesAmount * 0.10); // 10% commission
    }
}

public class Polymorphism1 {
    public static void main(String[] args) {

        Employee[] employees = {
                new FullTimeEmployee("Alice", 50000),
                new PartTimeEmployee("Bob", 200, 80),
                new SalesEmployee("Charlie", 30000, 100000)
        };

        System.out.println("===== Monthly Payroll =====");
        for (Employee e : employees) {
            e.displaySalary(); // each calculates differently
        }
    }
}