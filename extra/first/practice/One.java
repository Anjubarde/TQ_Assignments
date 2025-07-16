package extra.first.practice;

import java.util.Scanner;

//Q1. Write a Java program to input basic salary of an employee and calculate its
//Gross salary according to following: Basic Salary <= 10000 : HRA = 20%, DA = 80% Basic Salary <= 20000 : HRA = 25%,
//DA = 90% Basic Salary >20000 : HRA = 30%, DA = 95%
public class One {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input Basic Salary
        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        double hra = 0, da = 0;

        //Calculate HRA and DA
        if(basicSalary <= 10000) {
            hra = 0.20 * basicSalary;
            da = 0.80 * basicSalary;
        } else if(basicSalary <= 20000) {
            hra = 0.25 * basicSalary;
            da = 0.90 * basicSalary;
        } else {
            hra = 0.30 * basicSalary;
            da = 0.95 * basicSalary;
        }

        //Calculate Gross Salary
        double grossSalary = basicSalary + hra + da;
        System.out.println("Gross Salary: " + grossSalary);
    }
}
