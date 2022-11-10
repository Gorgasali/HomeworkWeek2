package com.yearup.week2.homework;

public interface Calculator {
    //Method to calculate area which accepts two arguments of type double returns double
    static void area(double length, double width) {
        double area = length * width;
        System.out.println("Area: " + area);

    }
   //Method to calculate sum which accepts two arguments of type double returns double
    static boolean sum(double num1,double num2) {
        double sum = num1 + num2;
        System.out.println("Sum: " + sum);
        return false;
    }
    //Method to calculate volume which accepts three arguments of type double and returns double
    static void area(double length, double width, double height) {
        double volume = length * width * height;
        System.out.println("Volume: " + volume);
    }
}
