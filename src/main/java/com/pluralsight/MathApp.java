package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        double bobSalary = 19250;
        double garySalary = 24552;

        double highestSalary = Math.max(bobSalary, garySalary);

        if (bobSalary == highestSalary) {
            System.out.println("Bob's salary is higher");
        } else {
            System.out.println("Gary's salary is higher");
        }
    }
}