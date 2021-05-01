public class Main {

    public static void main(String[] args) {
        UserManager userManager = new UserManager();

        User user1 = new Student(1, "Berkcan", "Demir", "123", "berkcan@example.com");
        userManager.showInformationUser(user1);

        User user2 = new Student(2, "Ali", "Demir", "123", "ali@example.com");
        userManager.showInformationUser(user2);


        InstructorManager instructorManager = new InstructorManager();
        String[] addingCourse1 = {"Java"};
        instructorManager.addCourse(addingCourse1);

        StudentManager studentManager = new StudentManager();
        String[] addingCourse2 = {"Javascript"};
        studentManager.addCourse(addingCourse2);
    }
}
