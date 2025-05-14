package io.github.galaxyvn.buoi2;

public class Student {
    private int id;
    private String name;

    public Student() {
        System.out.println("Call constructor number 1");
    }

    Student (int id, String name) {
        this();
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Student student = new Student(1, "Nguyen Van");
    }
}
