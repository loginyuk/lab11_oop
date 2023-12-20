package com.example.task1;

public class Main {
    public static void main(String[] args) {
        User user = Student.builder()
            .name("Yura")
            .age(18)
            .grade(100)
            .build();
        System.out.println(user);
    }
}
