package com.yearup.week2.homework;
import java.util.Scanner;

import static com.yearup.week2.homework.Calculator.area;

public class Part3{
    public static void userInput(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a length: ");
        double length = input.nextDouble();
        System.out.println("Enter a width: ");
        double width = input.nextDouble();
    }

    public static  void main(String[] args){
        area(5,7);


    }
}
