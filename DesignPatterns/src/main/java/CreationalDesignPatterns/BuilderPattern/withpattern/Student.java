package CreationalDesignPatterns.BuilderPattern.withpattern;

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

    // Constructor - package private, only the builder can create
    public Student(StudentBuilder builder) {
        this.rollNumber = builder.rollNumber;
        this.age = builder.age;
        this.name = builder.name;
        this.branch = builder.branch;
        this.fatherName = builder.fatherName;
        this.subjects = builder.subjects;
        this.bloodGroup = builder.bloodGroup;
    }

    public void print() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Roll Number: " + this.rollNumber);
        System.out.println("Branch: " + this.branch);
        System.out.println("Father's name: " + this.fatherName);
        System.out.println("Subjects: " + this.subjects);
        System.out.println("Blood Group: " + this.bloodGroup);
    }
}
