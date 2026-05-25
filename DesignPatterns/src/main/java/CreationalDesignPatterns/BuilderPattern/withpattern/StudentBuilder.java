package CreationalDesignPatterns.BuilderPattern.withpattern;

import java.util.List;

// Step 2: Abstract Builder interface
public abstract class StudentBuilder {
    // mandatory fields
    int rollNumber;
    int age;
    String name;
    String branch;

    // optional fields
    String fatherName;
    List<String> subjects;
    String bloodGroup;

    public StudentBuilder setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setBranch(String branch) {
        this.branch = branch;
        return this;
    }

    public StudentBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public StudentBuilder setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
        return this;
    }

    abstract public StudentBuilder setSubjects();

    // Build method
    public Student build() {
        return new Student(this);
    }
}
