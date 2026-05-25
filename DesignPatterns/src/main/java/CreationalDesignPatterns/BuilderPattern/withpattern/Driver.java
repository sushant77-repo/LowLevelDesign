package CreationalDesignPatterns.BuilderPattern.withpattern;

// Step 6: Client demonstration
public class Driver {
    public static void main(String[] args) {
        System.out.println("==================== Builder Pattern =====================");

        // Create director objects
        StudentRegistrationDirector engineeringDirector =
                new StudentRegistrationDirector(new EngineeringStudentBuilder());
        StudentRegistrationDirector managementDirector =
                new StudentRegistrationDirector(new ManagementStudentBuilder());

        // create students using different builders
        Student engineeringStudent = engineeringDirector.createStudent();
        Student managementStudent = managementDirector.createStudent();

        // print details
        engineeringStudent.print();
        System.out.println("=======================================");
        managementStudent.print();
    }
}
