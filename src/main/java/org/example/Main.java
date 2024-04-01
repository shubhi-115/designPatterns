package org.example;

import org.example.builder.Student;

public class Main {
    public static void main(String[] args) {
        /*
        Steps to make Builder pattern -
        1) Make class and private constructor
        2) Make static Builder class inside your class. Make public methods of each parameter
        3) Make create method inside Student class, which return builder object
        4) Make build method inside Builder class which return the Student object after declaration and validation
         */
        System.out.println("Implementation of Builder class____________________");
        Student student1 = Student.create().name("Shubhi").email("abc@gmail.com").phone_number("8300096998").batch(2023).rank(1)
                .build();
        System.out.println(student1.toString());
    }
}