package CreationalDesignPatterns.BuilderPattern.withoutpattern;

import java.util.List;

// Step 1: Product class - The complex Student object being built
public class Student {
    // mandatory fields
    int rollNumber;
    int age;
    String name;
    String branch;

    // optional fields
    String fatherName;
    List<String> subjects;
    String bloodGroup;

    // Without Builder - Constructor overloading
    // Telescoping Constructor Problem - adding mandatory parameters
    public Student(int rollNumber, int age, String name, String branch) {
        this.rollNumber = rollNumber;
        this.age = age;
        this.name = name;
        this.branch = branch;
    }

    // Telescoping Constructor Problem - adding new parameter - fatherName(optional)
    public Student(int rollNumber, int age, String name, String branch, String fatherName) {
        this.rollNumber = rollNumber;
        this.age = age;
        this.name = name;
        this.branch = branch;
        this.fatherName = fatherName;
    }

    // Telescoping Constructor Problem - adding new parameter - subjects(optional)
    public Student(int rollNumber, int age, String name, String branch, String fatherName, List<String> subjects) {
        this.rollNumber = rollNumber;
        this.age = age;
        this.name = name;
        this.branch = branch;
        this.fatherName = fatherName;
        this.subjects = subjects;
    }

    // Telescoping Constructor Problem - All arguments constructor
    // Big Constructor with long parameter list
    public Student(int rollNumber, int age, String name, String branch, String fatherName, List<String> subjects, String bloodGroup) {
        this.rollNumber = rollNumber;
        this.age = age;
        this.name = name;
        this.branch = branch;
        this.fatherName = fatherName;
        this.subjects = subjects;
        this.bloodGroup = bloodGroup;
    }
}
