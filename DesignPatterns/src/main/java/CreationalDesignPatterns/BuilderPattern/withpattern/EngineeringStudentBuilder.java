package CreationalDesignPatterns.BuilderPattern.withpattern;

import java.util.List;

// Step 3: Concrete Builder for Engineering Students
public class EngineeringStudentBuilder extends StudentBuilder {
    // Engineering-specific methods
    @Override
    public StudentBuilder setSubjects() {
        this.subjects = List.of("Maths", "Science", "CS");
        return this;
    }
}
