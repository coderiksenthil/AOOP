public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", "S001");
        Course course1 = new Course("C001", "Mathematics");
        
        EnrollmentManager enrollmentManager = new DefaultEnrollmentManager();
        enrollmentManager.enrollStudentInCourse(student1, course1);

        // Print student details
        System.out.println("Student: " + student1.getName() + ", Courses: ");
        for (Course course : student1.getCourses()) {
            System.out.println(course.getCourseName());
        }

        // Print course details
        System.out.println("Course: " + course1.getCourseName() + ", Enrolled Students: ");
        for (Student student : course1.getEnrolledStudents()) {
            System.out.println(student.getName());
        }
    }
}
