package regular.four;

//1.Create array of employee { id , name , dept , salary }
//dept class { id , name }
//sort array of employees based on salary in descending order .
//2.Accept department id from user .
//Find out number of employees in that department.

import java.util.List;
import java.util.Scanner;

class Department {
    int id;
    String name;

    Department(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Employee {
    int id;
    String name;
    Department dept;
    double salary;

    Employee(int id, String name, Department dept, double salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee(1, "A", new Department(1, "IT"), 10000);
        employees[1] = new Employee(2, "B", new Department(2, "HR"), 20000);
        employees[2] = new Employee(3, "C", new Department(1, "IT"), 30000);
        employees[3] = new Employee(4, "D", new Department(2, "HR"), 40000);
        employees[4] = new Employee(5, "E", new Department(1, "IT"), 50000);

        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                if (employees[i].salary < employees[j].salary) {
                    Employee temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }

        for (Employee employee : employees) {
            System.out.println("ID: " + employee.id + ", Name: " + employee.name + ", Department: " + employee.dept.name + ", Salary: " + employee.salary);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter department id: ");
        int id = sc.nextInt();
        int count = 0;
        for (Employee employee : employees) {
            if (employee.dept.id == id) {
                count++;
            }
        }
        System.out.println("Number of employees in department " + id + " is " + count);
    }
}
