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


        double carPrice = 15250;
        double truckPrice = 20000;

        double smallestPrice = Math.min(carPrice, truckPrice);

        if (carPrice == smallestPrice) {
            System.out.println("The car has the smallest price.");
        } else {
            System.out.println("The truck has the smallest price.");
        }
    }
}