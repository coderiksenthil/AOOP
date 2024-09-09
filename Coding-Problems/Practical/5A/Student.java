import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String id;
    private List<Course> courses;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void enrollInCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this);
        }
    }
}