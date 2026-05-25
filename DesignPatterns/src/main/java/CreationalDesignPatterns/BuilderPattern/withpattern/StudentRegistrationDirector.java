package CreationalDesignPatterns.BuilderPattern.withpattern;

// Step 5: Director class for common student registration processes
public class StudentRegistrationDirector {
    private StudentBuilder builder;

    public StudentRegistrationDirector(StudentBuilder builder) {
        this.builder = builder;
    }

    public Student createStudent() {
        if (builder instanceof EngineeringStudentBuilder) {
            return createEngineeringStudent();
        } else if (builder instanceof ManagementStudentBuilder) {
            return createManagementStudent();
        }
        return null;
    }

    private Student createEngineeringStudent() {
        return builder.setName("John")
                .setAge(32)
                .setRollNumber(100)
                .setBranch("Mech")
                .setFatherName("Jake")
                .setSubjects()
                .setBloodGroup("A+")
                .build();
    }

    private Student createManagementStudent() {
        return builder.setName("Jane")
                .setAge(28)
                .setRollNumber(55)
                .setBranch("Finance")
                .setFatherName("Mike")
                .setSubjects()
                .setBloodGroup("O+")
                .build();
    }
}
