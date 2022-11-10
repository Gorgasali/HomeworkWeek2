package com.yearup.week2.homework;
import java.util.Scanner;

import static com.yearup.week2.homework.Test.userInput;

public class Test implements Calculator {
    //Method to calculate area which accepts two arguments of type double returns double
    public double area(double length, double width) {
        double area = length * width;
        //System.out.println("Area: " + area);
        return area;
    }

    //Method to calculate sum which accepts two arguments of type double returns double
    public double sum(double num1, double num2) {
        double sum = num1 + num2;
        //System.out.println("Sum: " + sum);
        return sum;
    }

    public double volume(double length, double width, double height) {
        double volume = length * width * height;
        //System.out.println("Volume: " + volume);
        return volume;
    }

    public static double userInput() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a length: ");
        return userInput.nextDouble();

    }

}

