package extra.first.practice;

//Q2. Write a Java program to input electricity consumption unit and calculate total electricity bill according to the given
//condition: For first 50 units Rs. 0.50/unit For next 100 units Rs. 0.75/unit For next 100 units Rs. 1.20/unit For unit
//above 250 Rs. 1.50/unit An additional surcharge of 20% is added to the bill

import java.util.Scanner;

public class Two {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Input Electricity Unit

        System.out.print("Enter Electricity Unit: ");
        int unit = sc.nextInt();
        double totalBill = 0;

        //Calculate Electricity Bill
        if(unit <= 50) {
            totalBill = unit * 0.50;
        } else if(unit <= 150) {
            totalBill = 25 + (unit - 50) * 0.75;
        } else if(unit <= 250) {
            totalBill = 100 + (unit - 150) * 1.20;
        } else {
            totalBill = 220 + (unit - 250) * 1.50;
        }

        //Add 20% surcharge
        totalBill = totalBill + totalBill * 0.20;
        System.out.println("Total Electricity Bill: " + totalBill);
    }
}
