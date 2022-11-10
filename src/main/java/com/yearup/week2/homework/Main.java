package com.yearup.week2.homework;

import static com.yearup.week2.homework.Test.userInput;

public class Main {
    static double length;
    static double width;
    public static void main(String[] args) {
        Test t = new Test();

        length = userInput();
        width = userInput();
        System.out.println(t.area(length, width));


    }
}
