public class Student extends User {
    public Student(int id, String firstName, String lastName, String password, String email) {
        super(id,firstName,lastName,password,email);
        super.welcomeSystem();
    }
}
