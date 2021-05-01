public class StudentManager extends UserManager {
    @Override
    public void addCourse(String[] course) {
        System.out.println("Course is added to library.");
        super.addCourse(course);

    }
}
