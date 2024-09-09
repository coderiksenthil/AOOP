public class DefaultEnrollmentManager implements EnrollmentManager {
    @Override
    public void enrollStudentInCourse(Student student, Course course) {
        student.enrollInCourse(course);
    }
}
