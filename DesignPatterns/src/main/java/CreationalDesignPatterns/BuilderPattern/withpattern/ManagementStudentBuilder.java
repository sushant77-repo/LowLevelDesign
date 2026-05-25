package CreationalDesignPatterns.BuilderPattern.withpattern;

import java.util.List;

// Step 4: Concrete Builder for Management Students
public class ManagementStudentBuilder extends StudentBuilder {
    // Management-specific methods
    @Override
    public StudentBuilder setSubjects() {
        this.subjects = List.of("Law", "Economics", "Operations");
        return this;
    }
}
