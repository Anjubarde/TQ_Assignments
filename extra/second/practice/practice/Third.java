package extra.second.practice.practice;

class Employee {
    String name;
    int salary;

    // Constructor
    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// Child class
class Manager extends Employee {
    int bonus;

    // Constructor
    Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    void displayAllDetails() {
        super.displayInfo();
        System.out.println("Bonus: " + this.bonus);
    }
}

public class Third {
    public static void main(String[] args) {
        Manager m = new Manager("Anjali", 50000, 10000);
        m.displayAllDetails();
    }
}
